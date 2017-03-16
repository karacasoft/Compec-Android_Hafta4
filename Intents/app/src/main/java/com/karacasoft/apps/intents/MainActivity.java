package com.karacasoft.apps.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btnActivity1);
        Button btn2 = (Button) findViewById(R.id.btnActivity2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnActivity1) {
            Intent intent = new Intent(this, com.karacasoft.apps.intents.NumberOneActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btnActivity2) {

        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "OnPause'a girdi!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "OnStop'a girdi!");
    }
}
