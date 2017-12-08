package com.example.versionone;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class contact_Activity extends Activity {
    public static GroupListFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new GroupListFragment();

        getFragmentManager().beginTransaction()
                .replace(R.id.fragContainer, fragment).commit();

    }
}
