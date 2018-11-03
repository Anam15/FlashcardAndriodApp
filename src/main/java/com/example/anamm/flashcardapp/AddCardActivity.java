package com.example.anamm.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.myBtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(AddCardActivity.this, MainActivity.class); // create a new Intent, this is where we will put our data
                data.putExtra("stringKey1", ((EditText) findViewById(R.id.editquestion)).getText().toString()); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("stringKey2", ((EditText) findViewById(R.id.editanswer)).getText().toString()); // puts another string into the Intent, with the key as 'string2
                String s1 = getIntent().getStringExtra("stringKey1");
                String s2 = getIntent().getStringExtra("stringKey2");
                AddCardActivity.this.setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity

            }

        });


    }
}