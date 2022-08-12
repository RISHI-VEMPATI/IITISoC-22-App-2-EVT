package com.example.evt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserActivity : AppCompatActivity() {
    private var btndriver: Button? = null
    private var btnstudent: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_useractivity)
        btndriver = findViewById<View>(R.id.btndriver) as Button
        btndriver!!.setOnClickListener { openDriverloginActivity() }
        btnstudent = findViewById<View>(R.id.btnstudent) as Button
        btnstudent!!.setOnClickListener { openStudentloginActivity() }
    }

    private fun openDriverloginActivity() {
        val intent = Intent(this@UserActivity, DriverloginActivity::class.java)
        startActivity(intent)
    }
    private fun openStudentloginActivity() {
        val intent = Intent(this@UserActivity, StudentloginActivity::class.java)
        startActivity(intent)
    }
}