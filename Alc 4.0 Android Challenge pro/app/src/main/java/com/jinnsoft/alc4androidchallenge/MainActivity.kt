package com.jinnsoft.alc4androidchallenge

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("ALC 4 Phase 1")


        aboutBtn.setOnClickListener {
            setContentView(R.layout.activity_about)
            startActivity(Intent(this,AboutActivity::class.java))

        }

        profileBtn.setOnClickListener {
            setContentView(R.layout.activity_about)
            startActivity(Intent(this,ProfileActivity::class.java))

        }


    }

}
