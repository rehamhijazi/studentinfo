package com.example.studentinfo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {

    TextView note_title , note_desc  , note_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("title");
        String level = getIntent().getStringExtra("note");
        String avg = getIntent().getStringExtra("date");



        note_title = findViewById(R.id.note_title);
        note_desc = findViewById(R.id.note_desc);
        note_date = findViewById(R.id.note_date);

        note_title.setText(name);
        note_desc.setText(level);
        note_date.setText(avg);



    } }
