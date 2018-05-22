package edu.lewisu.cs.ivanfonseca.personalworkoutplanner;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        db.close();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_icon,menu);
        return true;
    }
    public void buttonClick(View V){
        Intent launchMain = new Intent(this,MainActivity.class);
        startActivity(launchMain);
    }
    public void buttonClick2(View V){
        Intent launchMain = new Intent(this,RecycleActivity.class);
        startActivity(launchMain);
    }
}

