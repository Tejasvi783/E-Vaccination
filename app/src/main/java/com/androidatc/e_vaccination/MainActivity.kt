package com.androidatc.e_vaccination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingActionButton.setOnClickListener{
            Toast.makeText(applicationContext, "Email us at: evaccination@gmail.com", Toast.LENGTH_LONG).show()
        }

        btn_login.setOnClickListener{
            val intent = Intent(this, SecondActivity :: class.java)
            startActivity(intent)
        }
    }
}