package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  WorkoutPlanAdapter adapter;
    private WorkoutPlan1 workoutPlan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new WorkoutPlanAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public void onResume() {
        super.onResume();
        if(adapter !=null){
            adapter.setWorkoutPlans(WorkoutPlanList.get(getApplicationContext()).getWorkoutPlans());
            adapter.notifyDataSetChanged();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.add1:
                Intent intent= new Intent(getApplicationContext(),WorkoutPlanActivity.class);
                WorkoutPlanList workoutPlanList = WorkoutPlanList.get(getApplicationContext());
                startActivity(intent);
                finish();
                return true;
            default:
                return false;
        }
    }


    private class WorkoutPlanHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView titleTextView;
        WorkoutPlan1 workoutPlan1;

        public WorkoutPlanHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            titleTextView=(TextView)itemView.findViewById(R.id.title_text_view);
        }

        public void bindWorkoutPlan(WorkoutPlan1 workoutPlan1){
            this.workoutPlan1=workoutPlan1;
            titleTextView.setText(workoutPlan1.getDay());
        }

        @Override
        public void onClick(View v){
            Intent intent=new Intent(RecycleActivity.this,WorkoutPlanActivity.class);
            intent.putExtra("id",workoutPlan1.getId());
            startActivity(intent);
        }
    }


    private class WorkoutPlanAdapter extends RecyclerView.Adapter<WorkoutPlanHolder>{
        private List<WorkoutPlan1> workoutPlans;
        private WorkoutPlanHolder holder;

        public WorkoutPlanAdapter(){
            setWorkoutPlans(WorkoutPlanList.get(RecycleActivity.this).getWorkoutPlans());
        }

        public void setWorkoutPlans(List<WorkoutPlan1> workoutPlans){
            this.workoutPlans=workoutPlans;
        }

        @Override
        public WorkoutPlanHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater= LayoutInflater.from(RecycleActivity.this);
            View view=layoutInflater.inflate(R.layout.list_row,parent,false);
            holder=new WorkoutPlanHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(WorkoutPlanHolder holder,int position){
            WorkoutPlan1 workoutPlan1=workoutPlans.get(position);
            holder.bindWorkoutPlan(workoutPlan1);
        }

        @Override
        public int getItemCount(){
            return workoutPlans.size();
        }
    }
}

