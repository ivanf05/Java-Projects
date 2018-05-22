package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import java.util.UUID;

/**
 * Created by ivan on 4/18/2017.
 */

public class WorkoutPlan1{
    private String day;
    private String exercise1;
    private String des1;
    private String exercise2;
    private String des2;
    private String exercise3;
    private String des3;
    private String exercise4;
    private String des4;
    private String cardio;
    private String des6;
    private UUID id;
    public WorkoutPlan1(){
        this.id = UUID.randomUUID();
    }
    public WorkoutPlan1(String day, String exercise1, String des1, String exercise2, String des2, String exercise3, String des3, String exercise4, String des4, String cardio, String des6) {
        this.id=UUID.randomUUID();
        this.day = day;
        this.exercise1 = exercise1;
        this.des1 = des1;
        this.exercise2 = exercise2;
        this.des2 = des2;
        this.exercise3 = exercise3;
        this.des3 = des3;
        this.exercise4 = exercise4;
        this.des4 = des4;
        this.cardio = cardio;
        this.des6 = des6;
    }


    public WorkoutPlan1(String id,String day, String exercise1, String des1, String exercise2, String des2, String exercise3, String des3, String exercise4, String des4, String cardio, String des6) {
        this.id=UUID.fromString(id);
        this.day = day;
        this.exercise1 = exercise1;
        this.des1 = des1;
        this.exercise2 = exercise2;
        this.des2 = des2;
        this.exercise3 = exercise3;
        this.des3 = des3;
        this.exercise4 = exercise4;
        this.des4 = des4;
        this.cardio = cardio;
        this.des6 = des6;

    }


    public UUID getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getExercise1() {
        return exercise1;
    }

    public void setExercise1(String exercise1) {
        this.exercise1 = exercise1;
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1;
    }

    public String getExercise2() {
        return exercise2;
    }

    public void setExercise2(String exercise2) {
        this.exercise2 = exercise2;
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2;
    }

    public String getExercise3() {
        return exercise3;
    }

    public void setExercise3(String exercise3) {
        this.exercise3 = exercise3;
    }

    public String getDes3() {
        return des3;
    }

    public void setDes3(String des3) {
        this.des3 = des3;
    }

    public String getExercise4() {
        return exercise4;
    }

    public void setExercise4(String exercise4) {
        this.exercise4 = exercise4;
    }

    public String getDes4() {
        return des4;
    }

    public void setDes4(String des4) {
        this.des4 = des4;
    }



    public String getCardio() {
        return cardio;
    }

    public void setCardio(String cardio) {
        this.cardio = cardio;
    }

    public String getDes6() {
        return des6;
    }

    public void setDes6(String des6) {
        this.des6 = des6;
    }
}
