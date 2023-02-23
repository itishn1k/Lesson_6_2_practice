package com.example.lesson_6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        binding.apply {
            btnAdd.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    list.add(editText.text.toString())
                    editText.text.clear()
                }
            }
            btnPrint.setOnClickListener {
                list.forEach {
                    tvResult.append("$it\n")
                }
            }
        }
    }
}