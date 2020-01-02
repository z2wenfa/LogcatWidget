package com.z2wenfa.logcatwidget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.weijiaxing.logcatviewer.R;
import com.z2wenfa.logcatwidget.ui.UseFloatingLogcatServiceActivity;
import com.z2wenfa.logcatwidget.ui.UseLogcatActivity;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Logcat(View view) {

        Log.e(TAG, "Logcat");
        startActivity(new Intent(this, UseLogcatActivity.class));

    }

    public void FloatingLogcat(View view) {

        Log.e(TAG, "FloatingLogcat");
        startActivity(new Intent(this, UseFloatingLogcatServiceActivity.class));
    }

    public void LogcatControl(View view) {

        Log.e(TAG, "LogcatControl");
//        startActivity(new Intent(this, UseLogcatControlActivity.class));

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", "tst");
    }
}
