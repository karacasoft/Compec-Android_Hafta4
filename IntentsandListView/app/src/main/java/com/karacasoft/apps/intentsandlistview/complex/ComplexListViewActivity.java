package com.karacasoft.apps.intentsandlistview.complex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import com.karacasoft.apps.intentsandlistview.R;

public class ComplexListViewActivity extends AppCompatActivity {

    private ListView complexListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_list_view);

        complexListAdapter = (ListView) findViewById(R.id.complexListView);
    }
}
