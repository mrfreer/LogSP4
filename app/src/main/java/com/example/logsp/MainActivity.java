package com.example.logsp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickedOnButton(View view){
        Log.v("MDC_Android", "Button Clicked!");
        Toast.makeText(this, "Button Clicked.", Toast.LENGTH_SHORT).show();
        EditText editText = findViewById(R.id.editTextName);
        //we have the name inside of the editText
        //We want to save it to a SharedPreference
        SharedPreferences sharedPreferences = getSharedPreferences("MDC_CODE", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", editText.getText().toString());
        myEdit.commit();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}