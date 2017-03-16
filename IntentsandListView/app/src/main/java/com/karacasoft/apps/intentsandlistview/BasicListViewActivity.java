package com.karacasoft.apps.intentsandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BasicListViewActivity extends AppCompatActivity {

    private ListView basicListView;
    private ArrayAdapter<String> basicListAdapter;
    private ArrayList<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_view);

        basicListView = (ListView) findViewById(R.id.basicListView);
        basicListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        basicListView.setAdapter(basicListAdapter);

        items.add("Mahmut");
        items.add("Karaca");
        items.add("KaracaSoft");
        items.add("");
        items.add("This");
        items.add("is");
        items.add("definitely");
        items.add("not");
        items.add("an");
        items.add("advertisement");

        basicListAdapter.notifyDataSetChanged();
    }
}
