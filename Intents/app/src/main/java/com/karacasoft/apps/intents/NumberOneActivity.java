package com.karacasoft.apps.intents;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberOneActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener, View.OnClickListener {

    private ListView listView;
    private EditText editTextAdd;
    private Button buttonAdd;


    private ArrayList<String> items = new ArrayList<>();

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_one);

        listView = (ListView) findViewById(R.id.listView);

        editTextAdd = (EditText) findViewById(R.id.editTextAddItem);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(adapter);

        items.add("Merhaba");
        items.add("Dünya");
        items.add("Sena");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut1");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut8");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut");
        items.add("Mahmut2");
        items.add("Mahmut3");
        items.add("Mahmut4");
        items.add("Mahmut");

        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(this);
        buttonAdd.setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        items.remove(i);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {
        // TODO butonları filtrele
        String text = editTextAdd.getText().toString();

        if(!text.isEmpty()) {
            items.add(text);
        }
        adapter.notifyDataSetChanged();

    }
}
