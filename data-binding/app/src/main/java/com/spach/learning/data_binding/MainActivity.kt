package com.spach.learning.data_binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.spach.learning.data_binding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bi: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main)
        bi.person = getData()
        bi.callback = MainActivityOnClick()
    }

    private fun getData(): Person {
        return Person("Seth Pacheco:", 27)
    }

    inner class MainActivityOnClick {
        fun onSubmit() {
            if (bi.editText.text.toString().isNotEmpty()) {
                val text = bi.editText.text.toString()
                bi.textView.text = text
            }
        }
    }
}