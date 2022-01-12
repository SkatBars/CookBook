package com.example.cookbook

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cookbook.databinding.RecyclerItemBinding

class MenuAdapter(private val items: List<ItemMenu>) : RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        return MenuHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MenuHolder(
        private val binding: RecyclerItemBinding,
        private val context: Context
    ): RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(itemMenu: ItemMenu) {
            binding.iconMenu.setImageDrawable(context.getDrawable(itemMenu.icon))
            binding.titleMenu.text = itemMenu.title
        }

        companion object {
            fun from(parent: ViewGroup): MenuHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = RecyclerItemBinding.inflate(inflater)
                return MenuHolder(binding, parent.context)
            }
        }
    }


}