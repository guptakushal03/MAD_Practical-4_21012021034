package com.example.mad_practical_4_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Signupbutton = findViewById<Button>(R.id.Signup)
        Signupbutton.setOnClickListener(){
            Intent(this@RegistrationActivity, LoginActivity::class.java).also { startActivity(it) }
        }

    }
}