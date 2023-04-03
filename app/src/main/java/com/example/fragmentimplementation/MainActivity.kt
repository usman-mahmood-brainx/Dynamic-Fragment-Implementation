package com.example.fragmentimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = dynamicFragment("First Fragment",R.color.purple_200)
        val secondFragment = dynamicFragment("Second Fragment",R.color.teal_200)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment,firstFragment)
            commit()
        }

        var btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        var btnFragment2 = findViewById<Button>(R.id.btnFragment2)
        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}