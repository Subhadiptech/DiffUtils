package com.ersubhadip.diffutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.ersubhadip.diffutils.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodList: ArrayList<FoodModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpList()
    }

    private fun setUpList() {
        foodList = ArrayList<FoodModel>()
        foodList.add(FoodModel("1", "Apple", ""))
        foodList.add(FoodModel("2", "Orange", ""))
        foodList.add(FoodModel("3", "Banana", ""))
        foodList.add(FoodModel("4", "Mango", ""))
        binding.listItem.layoutManager =
            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        foodAdapter = FoodAdapter()
        foodAdapter.submitList(foodList)
        binding.listItem.adapter = foodAdapter
    }
}