package com.z2wenfa.logcatwidget.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.weijiaxing.logcatviewer.R;
import com.z2wenfa.logviewer.LogcatActivity;


public class UseLogcatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_logcat);

        LogcatActivity.launch(UseLogcatActivity.this);

    }
}
