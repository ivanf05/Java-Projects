package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by ivan on 4/20/2017.
 */

public class WorkoutPlanTable {
    public static final String TABLE_WORKOUT_PLAN="workoutplans";
    public static final String COL_ID="_id";
    public static final String COL_UUID = "uuid";
    public static final String COL_DAY="Day";
    public static final String COL_EXERCISE1 = "exercise1";
    public static final String COL_DES1 = "description_of_exercise1";
    public static final String COL_EXERCISE2 = "exercise2";
    public static final String COL_DES2 = "description_of_exercise2";
    public static final String COL_EXERCISE3 = "exercise3";
    public static final String COL_DES3 = "description_of_exercise3";

    public static final String COL_EXERCISE4 = "exercise4";
    public static final String COL_DES4 = "description_of_exercise4";
    public static final String COL_CARDIO = "cardio";
    public static final String COL_CARDIO_DESCRIPTION = "description_of_cardio";

    private static final String DATABASE_CREATE =
            "create table " + TABLE_WORKOUT_PLAN +"(" +
                    COL_ID +  " integer primary key autoincrement, " +
                    COL_UUID + " text not null, " +
                    COL_DAY +  " text not null, " +
                    COL_EXERCISE1 + " text not null, " +
                    COL_DES1 + " text not null, "+
                    COL_EXERCISE2 + " text not null, "+
                    COL_DES2 + " text not null, "+
                    COL_EXERCISE3 + " text not null, "+
                    COL_DES3 + " text not null, "+
                    COL_EXERCISE4 + " text not null, "+
                    COL_DES4 + " text not null, "+
                    COL_CARDIO + " text not null, "+
                    COL_CARDIO_DESCRIPTION + " text not null"+ ");";

    public static void onCreate(SQLiteDatabase database){
        database.execSQL(DATABASE_CREATE);Log.d(WorkoutPlanTable.class.getName(), DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion){
        Log.w(WorkoutPlanTable.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion  +
                "which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_WORKOUT_PLAN);
        onCreate(database);
    }
}
