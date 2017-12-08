package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class p_i_Activity extends AppCompatActivity {

    //个人信息界面RecyclerView数组
    private String[] p_i_data = {"头像","用户ID","密码设置","家庭住址"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_information);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(p_i_Activity.this,android.R.layout.simple_list_item_1,p_i_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将个人信息界面的数组里的数据传给ListView
    }
}
