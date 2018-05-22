package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by ivan on 4/21/2017.
 */

public class WorkoutPlanCursorWrapper extends CursorWrapper {
    public WorkoutPlanCursorWrapper(Cursor cursor) {
        super(cursor);
    }
    public WorkoutPlan1 getWorkoutPlan(){
        String uuid = getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_UUID));
        String day = getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_DAY));
        String exercise1= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_EXERCISE1));
        String des1= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_DES1));
        String exercise2= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_EXERCISE2));
        String des2= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_DES2));
        String exercise3= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_EXERCISE3));
        String des3= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_DES3));
        String exercise4= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_EXERCISE4));
        String des4= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_DES4));
        String cardio= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_CARDIO));
        String des6= getString(getColumnIndexOrThrow(WorkoutPlanTable.COL_CARDIO_DESCRIPTION));
        WorkoutPlan1 workoutPlan1 = new WorkoutPlan1(uuid,day,exercise1,des1,exercise2,des2,exercise3,des3,exercise4,des4,
               cardio,des6);
        return workoutPlan1;

    }
}
