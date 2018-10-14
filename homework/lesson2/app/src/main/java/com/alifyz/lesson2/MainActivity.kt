package com.alifyz.lesson2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var mCount  = 0
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textview)
        textView.text = mCount.toString()

        if(savedInstanceState != null) {
            textView.text = savedInstanceState.getString("data")
            mCount = savedInstanceState.getInt("integer")
        }
    }


    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putString("data", mCount.toString())
        outState?.putInt("integer", mCount)
    }


    fun increment(view : View) {
        mCount++
        textView.text = mCount.toString()
    }
}
