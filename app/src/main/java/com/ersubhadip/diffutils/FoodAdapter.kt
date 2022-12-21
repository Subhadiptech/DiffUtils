package com.ersubhadip.diffutils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter : ListAdapter<FoodModel, FoodAdapter.ProgrammingViewHolder>(DiffUtilsCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ProgrammingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {
        val item = getItem(position)
        holder.bindData(item)
    }

    class DiffUtilsCallback() : DiffUtil.ItemCallback<FoodModel>() {
        override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {

            return oldItem == newItem
        }

    }

    inner class ProgrammingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.food_title)
        fun bindData(item: FoodModel) {
            title.text = item.title
        }
    }
}