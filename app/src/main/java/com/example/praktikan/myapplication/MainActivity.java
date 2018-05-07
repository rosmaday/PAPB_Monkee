package com.example.praktikan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView ListView;
    private ArrayList<String> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView=(ListView)findViewById(R.id.ListView);
        values = new ArrayList<>();

        for(int i=0;i<50;i++){
            values.add("Ini data ke - "+1);
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        ListView.setAdapter(adapter);

        ListView setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView,
                                    Viwe view, int i, long l){
                Toast.makeText(getApplicationContext()
                            values.get(i),Toast.LENGTH_LONG).show();
            }
        })
    }
}
