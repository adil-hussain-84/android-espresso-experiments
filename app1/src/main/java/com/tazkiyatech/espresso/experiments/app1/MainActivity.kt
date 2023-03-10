package com.tazkiyatech.espresso.experiments.app1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var stringBuilder: StringBuilder

    private lateinit var lifecycleEventsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stringBuilder = StringBuilder()

        lifecycleEventsTextView = findViewById(R.id.lifecycleEventsTextView)

        lifecycleEventsTextView.text = appendStringToStringBuilder("onCreate")
    }

    override fun onStart() {
        super.onStart()
        lifecycleEventsTextView.text = appendStringToStringBuilder("onStart")
    }

    override fun onResume() {
        super.onResume()
        lifecycleEventsTextView.text = appendStringToStringBuilder("onResume")
    }

    override fun onPause() {
        super.onPause()
        lifecycleEventsTextView.text = appendStringToStringBuilder("onPause")
    }

    override fun onStop() {
        super.onStop()
        lifecycleEventsTextView.text = appendStringToStringBuilder("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleEventsTextView.text = appendStringToStringBuilder("onDestroy")
    }

    private fun appendStringToStringBuilder(string: String): String {
        if (stringBuilder.isNotEmpty()) {
            stringBuilder.append(",")
        }
        return stringBuilder.append(string).toString()
    }
}