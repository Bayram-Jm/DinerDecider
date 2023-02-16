package com.bayram.dinerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.bayram.dinerdecider.databinding.ActivityMainBinding
import java.util.Random
import kotlin.random.Random as Random1


class MainActivity : AppCompatActivity() {

    val foodList = mutableListOf("Çorba", "Towuk Çorba", "Manty", "Palow", "Kelem we kartoşka gowrulan", "Pizza")

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.decideBtn.setOnClickListener {
           val random = Random()
            val randomFood = random.nextInt(foodList.count())
            binding.selectFoodTxt.text = foodList[randomFood]
        }
        binding.addBtn.setOnClickListener{
              val newFood = binding.addTxt.text.toString()
            foodList.add(newFood)
            binding.addTxt.text.clear()
        }
        // binding.addBtn.isEnabled = !binding.addTxt.text.toString().trim().isEmpty()




    }
}