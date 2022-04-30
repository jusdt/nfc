package com.example.ui;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ui.ui.read_load;

public class MainActivity extends AppCompatActivity {
    Button btnRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRead = (Button) findViewById(R.id.read_button);
        btnRead.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, read_load.class);
                startActivity(intent);
            }
        });
    }
}