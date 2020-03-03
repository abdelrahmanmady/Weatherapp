package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class ListActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> array=new ArrayList<>();

        array.add("Android");
        array.add("iPhone");
        array.add("Windows");
        array.add("Blackberry");
        array.add("Linux");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,array);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent messageIntent=new Intent(ListActivity.this,DeviceDetailActivity.class);
                startActivity(messageIntent);
            }
        });

    }
}
