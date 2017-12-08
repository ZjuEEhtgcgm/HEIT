package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class manage_Activity extends AppCompatActivity {

    //管理界面RecyclerView数组
    private String[] manage_data = {"电器维修","数据","优化方案","安全和隐私","能源物联网扩展模块"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(manage_Activity.this,android.R.layout.simple_list_item_1,manage_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将管理界面的数组里的数据传给ListView
    }
}
