package com.example.mad_practical_4_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton = findViewById<Button>(R.id.Login)
        val signupbutton = findViewById<Button>(R.id.SignUp)

        loginbutton.setOnClickListener(){
            Intent(this@MainActivity, LoginActivity::class.java).also { startActivity(it) }
        }

        signupbutton.setOnClickListener(){
            Intent(this@MainActivity, RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}