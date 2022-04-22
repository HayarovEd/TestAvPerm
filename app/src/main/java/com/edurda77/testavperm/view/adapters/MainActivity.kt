package com.edurda77.testavperm.view.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edurda77.testavperm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}