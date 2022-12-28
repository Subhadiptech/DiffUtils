package com.ersubhadip.diffutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodList: ArrayList<FoodModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpList()
    }

    private fun setUpList() {
        foodList.add(FoodModel("1", "Apple", ""))
        foodList.add(FoodModel("2", "Orange", ""))
        foodList.add(FoodModel("3", "Banana", ""))
        foodList.add(FoodModel("4", "Mango", ""))
        foodAdapter = FoodAdapter()
        foodAdapter.submitList(foodList)
    }
}