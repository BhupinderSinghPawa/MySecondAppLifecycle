package com.example.mysecondapplifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Log.i("myLog", "DisplayMessageActivity onCreate Called");

        // Get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // In the layout's Textview, set the string
        TextView textview = findViewById(R.id.textView2);
        textview.setText(message);

        // Program Example - Finding Layout, create textview, set text from resource; add to layout
        ConstraintLayout myLayout;
        myLayout = findViewById(R.id.myLayout);
        TextView pgmTextView = new TextView(this);
        pgmTextView.setText(R.string.pgm_message);
        myLayout.addView(pgmTextView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("myLog", "DisplayMessageActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("myLog", "DisplayMessageActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("myLog", "DisplayMessageActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("myLog", "DisplayMessageActivity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("myLog", "DisplayMessageActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myLog", "DisplayMessageActivity onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i("myLog", "DisplayMessageActivity onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i("myLog", "DisplayMessageActivity onRestoreInstanceState");
    }
}
