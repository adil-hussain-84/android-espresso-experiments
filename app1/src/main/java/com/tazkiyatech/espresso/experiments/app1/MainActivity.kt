package com.tazkiyatech.espresso.experiments.app1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        count++

        val text = resources.getQuantityString(R.plurals.onResume_called_xx_times, count, count)

        findViewById<TextView>(R.id.textView).text = text
    }
}