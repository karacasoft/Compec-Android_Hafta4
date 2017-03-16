package com.karacasoft.apps.intentsandlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.karacasoft.apps.intentsandlistview.complex.ComplexListViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBasicListView = (Button) findViewById(R.id.btnBasicListView);
        Button btnComplexListView = (Button) findViewById(R.id.btnComplexListView);

        btnBasicListView.setOnClickListener(this);
        btnComplexListView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnBasicListView) {
            Intent i = new Intent(this, BasicListViewActivity.class);
            startActivity(i);
        } else if(view.getId() == R.id.btnComplexListView){
            Intent i = new Intent(this, ComplexListViewActivity.class);
            startActivity(i);
        }
    }
}
