package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    public static WorkoutPlan1 workoutPlan;
    public static int save;
    public static int save1;
    public static int save2;
    public static int save3;
    private RadioButton goalButton1;
    private RadioButton goalButton2;
    private RadioButton male;
    private RadioButton female;
    private Button submit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);
        goalButton1 =(RadioButton) findViewById(R.id.goalButton1);
        goalButton2 =(RadioButton) findViewById(R.id.goalButton2);

        male =(RadioButton) findViewById(R.id.maleButton);
        female =(RadioButton) findViewById(R.id.femaleButton);

        goalButton1.setOnClickListener(new MainActivity.goalButton1ChangeListener());
        goalButton2.setOnClickListener(new MainActivity.goalButton2ChangeListener());
        male.setOnClickListener(new MainActivity.maleButtonChangeListener());
        female.setOnClickListener(new MainActivity.femaleButtonChangeListener());
        submit=(Button) findViewById(R.id.submitButton);


    }
    public void buttonClick3(View V){

        Intent launchMain = new Intent(this,WorkoutPlanActivity.class);
        startActivity(launchMain);
    }
    public void buttonClick4(View V){

        Intent launchMain = new Intent(this,LaunchActivity.class);
        startActivity(launchMain);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_list,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.list:
                Intent intent= new Intent(getApplicationContext(),RecycleActivity.class);
                WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
                startActivity(intent);
                finish();
                return true;
            default:
                return false;
        }
    }

    private class goalButton1ChangeListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (goalButton1.isChecked()){
                save = 1;
            }
        }
    }
    private class goalButton2ChangeListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (goalButton2.isChecked()){
                save1 = 1;
            }
        }
    }
    private class maleButtonChangeListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (male.isChecked()){
                save2 = 1;
            }
        }
    }
    private class femaleButtonChangeListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (female.isChecked()){
                save3 = 1;
            }
        }
    }
}
