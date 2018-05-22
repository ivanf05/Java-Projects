package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static edu.lewisu.cs.ivanfonseca.personalworkoutplanner.WorkoutPlanTable.COL_UUID;

/**
 * Created by ivan on 4/20/2017.
 */

public class WorkoutPlanList {
    private static WorkoutPlanList workoutPlanList;
    private SQLiteDatabase database;

    public static WorkoutPlanList get(Context context){
        if(workoutPlanList==null){
            workoutPlanList=new WorkoutPlanList(context);
        }
        return workoutPlanList;
    }

    private WorkoutPlanList(Context context){

        database= new DbHelper(context).getWritableDatabase();
    }

    public List getWorkoutPlans(){
        ArrayList<WorkoutPlan1> workoutPlans =  new ArrayList();
        Cursor c = database.query(WorkoutPlanTable.TABLE_WORKOUT_PLAN,null,null,null,null,null,null);
        WorkoutPlanCursorWrapper cursorWrapper = new WorkoutPlanCursorWrapper(c);
        WorkoutPlan1 workoutPlan1;
        try {
            cursorWrapper.moveToFirst();
            while(!cursorWrapper.isAfterLast()){
                workoutPlan1 = cursorWrapper.getWorkoutPlan();
                workoutPlans.add(workoutPlan1);
                cursorWrapper.moveToNext();
            }
        }finally {
            cursorWrapper.close();
        }
        return workoutPlans;
    }

    public WorkoutPlan1 getWorkoutPlan(UUID id) {
        String selection = WorkoutPlanTable.COL_UUID + "=?";
        String [] selection_args = {id.toString()};
        Cursor cursor = database.query(WorkoutPlanTable.TABLE_WORKOUT_PLAN,null,selection,selection_args,null,null,null);
        WorkoutPlanCursorWrapper cursorWrapper = new WorkoutPlanCursorWrapper(cursor);
        WorkoutPlan1 workoutPlan1 = null;
        try {
            if (cursorWrapper.getCount() == 0){

            }
            cursorWrapper.moveToFirst();
            workoutPlan1 = cursorWrapper.getWorkoutPlan();
        }finally {
            cursorWrapper.close();
        }
        return workoutPlan1;
    }
    private ContentValues getContentValues(WorkoutPlan1 workoutPlan1){
        ContentValues values = new ContentValues();
        values.put(COL_UUID,workoutPlan1.getId().toString());
        values.put(WorkoutPlanTable.COL_DAY,workoutPlan1.getDay().toString());
        values.put(WorkoutPlanTable.COL_EXERCISE1,workoutPlan1.getExercise1().toString());
        values.put(WorkoutPlanTable.COL_DES1,workoutPlan1.getDes1().toString());
        values.put(WorkoutPlanTable.COL_EXERCISE2,workoutPlan1.getExercise2().toString());
        values.put(WorkoutPlanTable.COL_DES2,workoutPlan1.getDes2().toString());
        values.put(WorkoutPlanTable.COL_EXERCISE3,workoutPlan1.getExercise3().toString());
        values.put(WorkoutPlanTable.COL_DES3,workoutPlan1.getDes3().toString());
        values.put(WorkoutPlanTable.COL_EXERCISE4,workoutPlan1.getExercise4().toString());
        values.put(WorkoutPlanTable.COL_DES4,workoutPlan1.getDes4().toString());
        values.put(WorkoutPlanTable.COL_CARDIO,workoutPlan1.getCardio().toString());
        values.put(WorkoutPlanTable.COL_CARDIO_DESCRIPTION,workoutPlan1.getDes6().toString());
        return values;
    }
    public void addWorkoutPlan(WorkoutPlan1 workoutPlan1){
        ContentValues values = getContentValues(workoutPlan1);
        database.insert(WorkoutPlanTable.TABLE_WORKOUT_PLAN,null,values);
    }
    public void updateWorkout(WorkoutPlan1 workoutPlan1){
        ContentValues contentValues= getContentValues(workoutPlan1);
        String uuid = workoutPlan1.getId().toString();
        String selection = WorkoutPlanTable.COL_UUID + "= ?";
        String[] selection_args = {uuid};
        database.update(WorkoutPlanTable.TABLE_WORKOUT_PLAN,contentValues, selection, selection_args);

    }
    public void deletePlan(WorkoutPlan1 workoutPlan1){
        ContentValues contentValues= getContentValues(workoutPlan1);
        String uuid = workoutPlan1.getId().toString();
        String selection = WorkoutPlanTable.COL_UUID + "= ?";
        String[] selection_args = {uuid};
        database.delete(WorkoutPlanTable.TABLE_WORKOUT_PLAN,selection, selection_args);
    }

}
