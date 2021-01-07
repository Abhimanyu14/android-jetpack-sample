package com.makeappssimple.demo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val activityViewModel by viewModels<MainActivityViewModel>()
    lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textview_count)

        findViewById<Button>(R.id.button_increment).setOnClickListener {

            activityViewModel.increment()
        }

        findViewById<Button>(R.id.button_decrement).setOnClickListener {

            activityViewModel.decrement()
        }

        activityViewModel.count.observe(this, {
            textview.text = it.toString()
        })
    }
}
