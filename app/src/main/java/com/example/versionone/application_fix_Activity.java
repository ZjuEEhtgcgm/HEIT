package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class application_fix_Activity extends AppCompatActivity {

    //电器维修界面RecyclerView数组
    private String[] application_fix_data = {"问题描述","推荐维修方案","维修估价"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_fix_);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(application_fix_Activity.this,android.R.layout.simple_list_item_1,application_fix_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将电器维修界面的数组里的数据传给ListView
    }
}
