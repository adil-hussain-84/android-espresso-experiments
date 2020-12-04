package com.tazkiyatech.espresso.experiments.app1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var stringBuilder: StringBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stringBuilder = StringBuilder()

        textView.text = appendString("onCreate")
    }

    override fun onStart() {
        super.onStart()
        textView.text = appendString("onStart")
    }

    override fun onResume() {
        super.onResume()
        textView.text = appendString("onResume")
    }

    override fun onPause() {
        super.onPause()
        textView.text = appendString("onPause")
    }

    override fun onStop() {
        super.onStop()
        textView.text = appendString("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textView.text = appendString("onDestroy")
    }

    private fun appendString(string: String): String {
        if (stringBuilder.isNotEmpty()) {
            stringBuilder.append(",")
        }
        return stringBuilder.append(string).toString()
    }
}