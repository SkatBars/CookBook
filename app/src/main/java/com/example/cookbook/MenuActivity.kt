package com.example.cookbook

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.wear.widget.WearableLinearLayoutManager
import com.example.cookbook.databinding.ActivityMenuBinding

class MenuActivity : WearableActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val items = mutableListOf<ItemMenu>()
        items.add(ItemMenu("Борщ", R.drawable.ic_borsch, R.drawable.borsch, R.string.borsch))
        items.add(ItemMenu("Цезарь", R.drawable.ic_cesar, R.drawable.cesar, R.string.cesar))
        items.add(ItemMenu("Мол. коктейль", R.drawable.ic_milkshake, R.drawable.milkshake, R.string.milkshake))
        items.add(ItemMenu("Спагетти", R.drawable.ic_spagetti, R.drawable.spagetti, R.string.spagetti))
        items.add(ItemMenu("Блинчики", R.drawable.ic_blinchik, R.drawable.blinchik, R.string.blinchik))

        binding = ActivityMenuBinding.inflate(layoutInflater)
        val layoutManager = WearableLinearLayoutManager(applicationContext)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = MenuAdapter(items)
        setContentView(binding.root)
    }
}
