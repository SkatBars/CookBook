package com.example.cookbook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.cookbook.databinding.ActivityMainBinding

class MainActivity : WearableActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.i("qwe", "resume")
        super.onStart()
    }
}