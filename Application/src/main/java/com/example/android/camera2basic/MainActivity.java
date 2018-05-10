package com.example.android.camera2basic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ocrbutton;
    Button picbutton;
    Button logobutton;
    Button continuebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadpage);
        ocrbutton=findViewById(R.id.ocrbutton);
        picbutton=findViewById(R.id.picbutton);
        logobutton=findViewById(R.id.logobutton);
        continuebutton=findViewById(R.id.loadbutton);
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

    }
    public void gotocam(View view){
        Intent intent=new Intent(MainActivity.this,CameraActivity.class);

        startActivity(intent);
    }

}
