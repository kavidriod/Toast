package com.androidninja.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showToastButton,chainToastMethodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToastButton = findViewById(R.id.showToastButton);
        chainToastMethodButton = findViewById(R.id.chainToastMethodButton);

        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context  context = getApplicationContext();
                CharSequence text = "Hello Toast";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
            }
        });


        chainToastMethodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello Chain Toast Method",Toast.LENGTH_LONG).show();
            }
        });
    }
}