package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class application_general extends AppCompatActivity {

    //家电概况界面RecyclerView数组
    private String[] application_general_data = {"总台数","总价格","十一月总耗能"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_general);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(application_general.this,android.R.layout.simple_list_item_1,application_general_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将家电概况界面的数组里的数据传给ListView
    }
}
