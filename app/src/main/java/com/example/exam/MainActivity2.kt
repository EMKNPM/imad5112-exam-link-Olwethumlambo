package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    //Declarations
    private lateinit var btnAdd : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private lateinit var tvShelter : TextView
    private lateinit var tvFood : TextView
    private lateinit var tvSafety : TextView
    private lateinit var btnNext : Button

    //create an array of items in details
    val item = arrayOf("Tent", "Marshmallows", "Flashlight")

    //create an array of categories
    val category = arrayOf("Shelter", "Food", "Safety")

    //create an array of quantity
    val quantity = arrayOf(1, 2, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        //typecasting
        btnAdd = findViewById(R.id.btnAdd)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        tvShelter = findViewById(R.id.tvShelter)
        tvFood = findViewById(R.id.tvFood)
        tvSafety = findViewById(R.id.tvSafety)
        btnNext = findViewById(R.id.btnNext)


        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity3 ::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}