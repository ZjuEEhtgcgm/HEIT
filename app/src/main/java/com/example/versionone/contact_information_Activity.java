package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class contact_information_Activity extends AppCompatActivity {

    //聊天记录管理界面RecyclerView数组
    private String[] contact_information_data = {"名称","价格","厂商","运行状态","能耗"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_information);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(contact_information_Activity.this,android.R.layout.simple_list_item_1,contact_information_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将聊天记录管理界面的数组里的数据传给ListView
    }
}
