package com.example.versionone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class call_office_Activity extends AppCompatActivity {

    //联系官方界面RecyclerView数组
    private String[] call_office_data = {"拨打官方电话","登录官方网站","提出建议和吐槽"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_office);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(call_office_Activity.this,android.R.layout.simple_list_item_1,call_office_data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);         //将联系官方界面的数组里的数据传给ListView
    }
}
