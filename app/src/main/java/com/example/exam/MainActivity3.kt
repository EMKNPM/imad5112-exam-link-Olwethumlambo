package com.example.exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    //Declarations
    private lateinit var btnDisplay : Button
    private lateinit var btnBack : Button
    private lateinit var tvDetails : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        //typecasting
        btnDisplay = findViewById(R.id.btnDisplay)
        btnBack = findViewById(R.id.btnBack)
        tvDetails = findViewById(R.id.tvDetails)


        val item = arrayOf(
           "Tent",
            "Marshmallows",
            "Flashlight"
        )

        val category = arrayOf(
            "Shelter",
            "Food",
            "Safety"
        )

        val comments = arrayOf(
            "4-person waterproof",
            "For S'mores (Mega Size)",
            "Check batteries (AA)"
        )

        var output = ""

        for (i in  item.indices){
            output +=
                "Item: ${item[i]}\n" +
                        "Category: ${category[i]}\n" +
                        "Comment: ${comments[i]}\n\n"
        }

        tvDetails.text=output

        
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}