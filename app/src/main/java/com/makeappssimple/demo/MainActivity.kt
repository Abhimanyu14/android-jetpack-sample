package com.makeappssimple.demo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var count = 0
    lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textview_count)

        findViewById<Button>(R.id.button_increment).setOnClickListener {
            count++
            textview.text = count.toString()
        }

        findViewById<Button>(R.id.button_decrement).setOnClickListener {
            count--
            textview.text = count.toString()
        }
    }
}
