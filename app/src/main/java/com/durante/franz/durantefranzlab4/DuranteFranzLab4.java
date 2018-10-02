package com.durante.franz.durantefranzlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DuranteFranzLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durante_franz_lab4);
        Log.d("4IT-B", "onCreate() method");
        Button btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Back button is pressed!", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn2 = (Button) findViewById(R.id.button);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Snackbar snackbar = Snackbar.make(v,"Next button is pressed!", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-B","onStart() method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-B","onResume() method");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-B","onPause() method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-B","onStop() method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-B","onDestroy() method");
    }
}
