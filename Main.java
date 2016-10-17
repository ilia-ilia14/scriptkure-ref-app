package com.example.tiger.scripture_reference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "gymbandit.org.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText book = (EditText)findViewById(R.id.book);
        final EditText  chapter = (EditText)findViewById(R.id.chapter);
        final EditText  verse = (EditText)findViewById(R.id.verse);
        Button share = (Button)findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String textOutPut = book.getText().toString() +", "+ chapter.getText().toString() +
                        ", " + verse.getText().toString();



                Intent  intent = new Intent(Main.this, Activity2.class);
                intent.putExtra(EXTRA_MESSAGE, textOutPut);

                startActivity(intent);

               // i.putExtra("key", textOutPut);

            }
        });




    }
}
