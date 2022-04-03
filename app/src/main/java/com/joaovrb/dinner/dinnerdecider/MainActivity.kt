package com.joaovrb.dinner.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import java.util.*


class MainActivity : AppCompatActivity() {
    // add list of types of food to rotate when button DECIDE! is pressed
    private val foodTypeList = arrayListOf("Chinese", "Italian", "American-US", "Japanese", "Indian", "Thay")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDecide = findViewById<Button>(R.id.btnDecide)
        val selectedFoodText = findViewById<TextView>(R.id.selectedFoodText)
        val btnAddFood = findViewById<Button>(R.id.btnAddFood)


        btnDecide.setOnClickListener {
          val random = Random()
          val randomFood = random.nextInt(foodTypeList.count())
          selectedFoodText.text = foodTypeList[randomFood]
        }

        btnAddFood.setOnClickListener {
            val txtAddFood = findViewById<TextView>(R.id.txtAddFood)
            val newFoodValue = txtAddFood.text.toString()
            foodTypeList.add(newFoodValue)
            txtAddFood.text = ""
            println(foodTypeList)
        }

    }
}