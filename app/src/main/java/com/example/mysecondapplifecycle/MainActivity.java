package com.example.mysecondapplifecycle;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_CONTACT_SUBACTIVITY = 2;

    public static final String EXTRA_MESSAGE = "com.example.mypehlapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("myLog", "MainActivity onCreate Called");
    }

    /** called when user clicks the button */
    public void sendMessage(View view){

        // get the message present in the textView
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        Log.d("myLog", message);

        // start an instance of DisplayMessageActivity specified by Intent - Explicit
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("myLog", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("myLog", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("myLog", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("myLog", "MainActivity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("myLog", "MainActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myLog", "MainActivity onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i("myLog", "MainActivity onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i("myLog", "MainActivity onRestoreInstanceState");
    }
}
