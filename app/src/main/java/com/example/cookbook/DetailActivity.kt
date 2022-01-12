package com.example.cookbook

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cookbook.databinding.ActivityDetailBinding

class DetailActivity : Activity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        binding.icon.setImageDrawable(getDrawable(intent.getIntExtra("icon", R.drawable.ic_borsch)))
        binding.image.setImageDrawable(getDrawable(intent.getIntExtra("img", R.drawable.borsch)))
        binding.title.text = intent.getStringExtra("title")
        binding.text.text = getString(intent.getIntExtra("text", R.string.borsch))
        setContentView(binding.root)
    }
}