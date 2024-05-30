package com.example.buttonclicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    //instance var fir button link to xml widget
    //NO PRIMITIVES
    //var/val name: type
    //lateinit promise initialize later
    lateinit var clickerButton: Button
    lateinit var clickerLayout: ConstraintLayout
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //wire code- link xml to kotlin
        clickerButton = findViewById(R.id.button_main_clicker)
        clickerLayout = findViewById(R.id.layout_main)
        clickerButton.text = "Click me!"


        //listeners {executed code}
        clickerButton.setOnClickListener {
            points++
            if(points%2==0) {
                clickerButton.textSize++
            }
            clickerButton.rotation+=5
            clickerButton.text= "Points: $points"
            var colo = Color.rgb((0..255).random() ,(0..255).random(), (0..255).random())
            clickerButton.setBackgroundColor(colo)
            //message when hit 10 clicks
            when (points) {
                10 -> {
                    //context
                    Toast.makeText(this,"YAY 10 clicks", Toast.LENGTH_SHORT).show()
                }
                20 -> {
                    Toast.makeText(this,"YAY 20 clicks", Toast.LENGTH_SHORT).show()
                }
                30 -> {
                    Toast.makeText(this,"YAY 30 clicks", Toast.LENGTH_SHORT).show()
                }
            }





        }
    }
}