package com.example.tiger.scripture_reference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView output = (TextView)findViewById(R.id.output);


        Intent intent = getIntent();
        String message = intent.getStringExtra(Main.EXTRA_MESSAGE);

       // output = new TextView(this);
        //textView.setTextSize(40);
        output.setText("Your favorite scripture is:\n" + message);

    }
}
