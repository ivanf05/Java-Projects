package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.UUID;

import static edu.lewisu.cs.ivanfonseca.personalworkoutplanner.MainActivity.save;
import static edu.lewisu.cs.ivanfonseca.personalworkoutplanner.MainActivity.save1;
import static edu.lewisu.cs.ivanfonseca.personalworkoutplanner.MainActivity.save2;
import static edu.lewisu.cs.ivanfonseca.personalworkoutplanner.MainActivity.save3;

public class WorkoutPlanActivity extends AppCompatActivity {
    private WorkoutPlan1 workoutPlan1;
    private Button addEditButton;
    private EditText day;
    private EditText exercise1;
    private EditText exercise2;
    private EditText exercise3;
    private EditText exercise4;
    private EditText des1;
    private EditText des2;
    private EditText des3;
    private EditText des4;
    private EditText cardio;
    private EditText cardio_description;
    private WorkoutPlanList workoutPlanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_plan);
        addEditButton = (Button)findViewById(R.id.button);
        day =(EditText)findViewById(R.id.day);
        exercise1 =(EditText)findViewById(R.id.ex1);
        exercise2 =(EditText)findViewById(R.id.ex2);
        exercise3 =(EditText)findViewById(R.id.ex3);
        exercise4 =(EditText)findViewById(R.id.ex4);
        des1 = (EditText)findViewById(R.id.des1);
        des2 = (EditText)findViewById(R.id.des2);
        des3 = (EditText)findViewById(R.id.des3);
        des4 = (EditText)findViewById(R.id.des4);
        cardio= (EditText)findViewById(R.id.cardio);
        cardio_description=(EditText)findViewById(R.id.description);

        //If female and wants to gain muscle
        if(save1 ==1 && save3==1){
            workoutPlan1 = new WorkoutPlan1();
            workoutPlan1.setDay("Tuesday");
            workoutPlan1.setExercise1("Squats");
            workoutPlan1.setExercise2("Leg Press");
            workoutPlan1.setExercise3("Leg curls");
            workoutPlan1.setExercise4("Leg Extenstion");
            workoutPlan1.setCardio("Stair Master");
            workoutPlan1.setDes1("4 sets of 8-10 reps");
            workoutPlan1.setDes2("4 sets of 8-10 reps");
            workoutPlan1.setDes3("4 sets of 10-12 reps");
            workoutPlan1.setDes4("4 sets of 10-12 reps");
            workoutPlan1.setDes6("20 minutes");

            day.setText(workoutPlan1.getDay());
            exercise1.setText(workoutPlan1.getExercise1());
            exercise2.setText(workoutPlan1.getExercise2());
            exercise3.setText(workoutPlan1.getExercise3());
            exercise4.setText(workoutPlan1.getExercise4());
            des1.setText(workoutPlan1.getDes1());
            des2.setText(workoutPlan1.getDes2());
            des3.setText(workoutPlan1.getDes3());
            des4.setText(workoutPlan1.getDes4());
            cardio_description.setText(workoutPlan1.getDes6());
            cardio.setText(workoutPlan1.getCardio());
            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.addWorkoutPlan(workoutPlan1);
            save1= 0;
            save3=0;

        }
        //If male and wants to gain muscle
        if(save1==1 && save2==1) {
            workoutPlan1 = new WorkoutPlan1();
            workoutPlan1.setDay("Thursday");
            workoutPlan1.setExercise1("Pullups");
            workoutPlan1.setExercise2("Deadlift");
            workoutPlan1.setExercise3("Bicep Curls");
            workoutPlan1.setExercise4("Seated Rows");
            workoutPlan1.setCardio("Running");
            workoutPlan1.setDes1("4 sets of 10-12 reps");
            workoutPlan1.setDes2("5 sets of 8-10 reps");
            workoutPlan1.setDes3("4 sets of 10-12 reps");
            workoutPlan1.setDes4("4 sets of 10-12 reps");
            workoutPlan1.setDes6("2 miles");

            day.setText(workoutPlan1.getDay());
            exercise1.setText(workoutPlan1.getExercise1());
            exercise2.setText(workoutPlan1.getExercise2());
            exercise3.setText(workoutPlan1.getExercise3());
            exercise4.setText(workoutPlan1.getExercise4());
            des1.setText(workoutPlan1.getDes1());
            des2.setText(workoutPlan1.getDes2());
            des3.setText(workoutPlan1.getDes3());
            des4.setText(workoutPlan1.getDes4());
            cardio_description.setText(workoutPlan1.getDes6());
            cardio.setText(workoutPlan1.getCardio());
            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.addWorkoutPlan(workoutPlan1);
            save1= 0;
            save2 = 0;

        }
        //If male and wants to lose weight
        if(save==1 && save2==1) {
            workoutPlan1 = new WorkoutPlan1();
            workoutPlan1.setDay("Monday");
            workoutPlan1.setExercise1("Sit-ups");
            workoutPlan1.setExercise2("Bicycle Kicks");
            workoutPlan1.setExercise3("Leg Raises");
            workoutPlan1.setExercise4("Sprints");
            workoutPlan1.setCardio("Running");
            workoutPlan1.setDes1("4 sets of 30 reps");
            workoutPlan1.setDes2("4 sets of 20 reps");
            workoutPlan1.setDes3("4 sets of 20 reps");
            workoutPlan1.setDes4("4 sets of 15 sec.");
            workoutPlan1.setDes6("3 miles");

            day.setText(workoutPlan1.getDay());
            exercise1.setText(workoutPlan1.getExercise1());
            exercise2.setText(workoutPlan1.getExercise2());
            exercise3.setText(workoutPlan1.getExercise3());
            exercise4.setText(workoutPlan1.getExercise4());
            des1.setText(workoutPlan1.getDes1());
            des2.setText(workoutPlan1.getDes2());
            des3.setText(workoutPlan1.getDes3());
            des4.setText(workoutPlan1.getDes4());
            cardio_description.setText(workoutPlan1.getDes6());
            cardio.setText(workoutPlan1.getCardio());

            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.addWorkoutPlan(workoutPlan1);
            save=0;
            save2=0;
        }
        //If female and wants to lose weight
        if(save==1 && save3==1) {
            workoutPlan1 = new WorkoutPlan1();
            workoutPlan1.setDay("Saturday");
            workoutPlan1.setExercise1("Sit-ups");
            workoutPlan1.setExercise2("Bicycle Kicks");
            workoutPlan1.setExercise3("Squat Jumps");
            workoutPlan1.setExercise4("Stair Master");
            workoutPlan1.setCardio("Running");
            workoutPlan1.setDes1("4 sets of 30 reps");
            workoutPlan1.setDes2("4 sets of 20 reps");
            workoutPlan1.setDes3("4 sets of 20 reps");
            workoutPlan1.setDes4("30 minutes");
            workoutPlan1.setDes6("3 miles");

            day.setText(workoutPlan1.getDay());
            exercise1.setText(workoutPlan1.getExercise1());
            exercise2.setText(workoutPlan1.getExercise2());
            exercise3.setText(workoutPlan1.getExercise3());
            exercise4.setText(workoutPlan1.getExercise4());
            des1.setText(workoutPlan1.getDes1());
            des2.setText(workoutPlan1.getDes2());
            des3.setText(workoutPlan1.getDes3());
            des4.setText(workoutPlan1.getDes4());
            cardio_description.setText(workoutPlan1.getDes6());
            cardio.setText(workoutPlan1.getCardio());
            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.addWorkoutPlan(workoutPlan1);
            save=0;
            save3=0;
        }
            day.addTextChangedListener(new DayListener());
            exercise1.addTextChangedListener(new ExerciseListener1());
            exercise2.addTextChangedListener(new ExerciseListener2());
            exercise3.addTextChangedListener(new ExerciseListener3());
            exercise4.addTextChangedListener(new ExerciseListener4());
            des1.addTextChangedListener(new DescriptionListener1());
            des2.addTextChangedListener(new DescriptionListener2());
            des3.addTextChangedListener(new DescriptionListener3());
            des4.addTextChangedListener(new DescriptionListener4());
            cardio.addTextChangedListener(new CardioListener());
            cardio_description.addTextChangedListener(new CardioDescriptionListener());

        UUID id = (UUID)getIntent().getSerializableExtra("id");
        //user doesn't enter all fields

        if (id != null){
            workoutPlan1 = WorkoutPlanList.get(getApplicationContext()).getWorkoutPlan(id);
        }
        if(workoutPlan1 != null) {
            addEditButton.setText(R.string.update);
            if(workoutPlan1.getDay()=="Enter Workout Day of The Week:"){
            }
            else{
                day.setText(workoutPlan1.getDay());
                exercise1.setText(workoutPlan1.getExercise1());
                exercise2.setText(workoutPlan1.getExercise2());
                exercise3.setText(workoutPlan1.getExercise3());
                exercise4.setText(workoutPlan1.getExercise4());
                cardio.setText(workoutPlan1.getCardio());
                des1.setText(workoutPlan1.getDes1());
                des2.setText(workoutPlan1.getDes2());
                des3.setText(workoutPlan1.getDes3());
                des4.setText(workoutPlan1.getDes4());
                cardio_description.setText(workoutPlan1.getDes6());

            }
            addEditButton.setOnClickListener(new OnUpateButtonClick());
        }
        else{
            workoutPlan1 = new WorkoutPlan1();
            addEditButton.setOnClickListener(new OnAddButtonClick());
        }

    }
    public void buttonClick4(View V){
        Intent launch = new Intent(this,RecycleActivity.class);
        startActivity(launch);
    }
    private class OnAddButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.addWorkoutPlan(workoutPlan1);
            save = 0;
            save1=0;
            save2=0;
            save3=0;
            finish();
        }
    }

    private class OnUpateButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
            workoutPlanList.updateWorkout(workoutPlan1);
            save = 0;
            save1=0;
            save2=0;
            save3=0;
            finish();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.delete:
                Intent intent= new Intent(getApplicationContext(),RecycleActivity.class);
                WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
                workoutPlanList.deletePlan(workoutPlan1);
                startActivity(intent);
                finish();
                return true;
            default:
                return false;
        }
    }

    private class DayListener implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDay(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class ExerciseListener1 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setExercise1(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class ExerciseListener2 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setExercise2(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class ExerciseListener3 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setExercise3(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class ExerciseListener4 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setExercise4(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class DescriptionListener1 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDes1(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    private class DescriptionListener2 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDes2(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class DescriptionListener3 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDes3(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class DescriptionListener4 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDes4(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class CardioListener implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setCardio(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
    private class CardioDescriptionListener implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            workoutPlan1.setDes6(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }
}
