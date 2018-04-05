package com.example.amansingh.android_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Created",t.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Resuming",t.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Started",t.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Paused",t.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Stopped",t.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t = new Toast(getApplicationContext());
        t.makeText(this,"Destroyed",t.LENGTH_SHORT).show();
    }
}
