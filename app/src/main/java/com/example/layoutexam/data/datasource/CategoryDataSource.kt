package com.example.layoutexam.data.datasource

import com.example.layoutexam.R
import com.example.layoutexam.data.model.Category

interface CategoryDataSource {
    fun getCategoryData(): List<Category>
}

class CategoryDataSourceImpl() : CategoryDataSource {
    override fun getCategoryData(): List<Category> {
        return mutableListOf(
            Category(image = R.drawable.img_dessert, name = "Dessert"),
            Category(image = R.drawable.img_ayam, name = "Lunch"),
            Category(image = R.drawable.img_drink, name = "Drink"),
            Category(image = R.drawable.img_lunch, name = "Meat"),
            Category(image = R.drawable.ic_seger, name = "seger"),
            Category(image = R.drawable.ic_pedes, name = "pedes")


        )
    }
}