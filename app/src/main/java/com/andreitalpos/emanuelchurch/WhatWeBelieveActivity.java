package com.andreitalpos.emanuelchurch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class WhatWeBelieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Toolbar whatWeBelieveToolbar = (Toolbar) findViewById(R.id.whatWeBelieveToolbar);
        //whatWeBelieveToolbar.setTe

        setSupportActionBar(whatWeBelieveToolbar);

    }

}