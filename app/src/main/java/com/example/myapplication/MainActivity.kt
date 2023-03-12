package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val inchValue = 2.54   //1 cm=2.54 inches
    private lateinit var enterInches: EditText  //Initializing the Widgets later
    private lateinit var Convertbutton: Button
    private lateinit var textViewCentimeters: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches = findViewById(R.id.TextViewConvert)
        Convertbutton = findViewById(R.id.button_convert)
        textViewCentimeters = findViewById(R.id.textViewConvert)

        Convertbutton.setOnClickListener {

            if (enterInches.text.toString().isNotEmpty()) {

                val result = enterInches.text.toString().toDouble() * inchValue
                textViewCentimeters.text=result.toString()

            }else {

                textViewCentimeters.text=getString(R.string.text)
            }
        }


    }
}