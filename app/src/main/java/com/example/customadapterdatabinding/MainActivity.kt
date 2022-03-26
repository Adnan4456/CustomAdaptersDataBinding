package com.example.customadapterdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.customadapterdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val post = Post("Databinding" , " CustomBinding Adapter",
        "https://pixabay.com/photos/tree-sunset-clouds-sky-silhouette-736885/")
        binding.post = post

    }
}