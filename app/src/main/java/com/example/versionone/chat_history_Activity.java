package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chat_history_Activity extends AppCompatActivity {

    //聊天记录管理界面RecyclerView数组
    private String[] chat_history_data = {"查看聊天记录","管理聊天记录"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_history);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(chat_history_Activity.this,android.R.layout.simple_list_item_1,chat_history_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将聊天记录管理界面的数组里的数据传给ListView
    }
}
