package com.example.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examTips = new String[5];
        lvExamTips = findViewById(R.id.listViewExamTips);

        examTips[0] = "Don't just read the code, code it as much as possible during each practical session";
        examTips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTips[2] = "Prepare your template source code for each topic";
        examTips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examTips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, examTips);

        lvExamTips.setAdapter(adapter);
    }
}