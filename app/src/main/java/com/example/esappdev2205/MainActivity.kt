package com.example.esappdev2205

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.esappdev2205.databinding.ActivityMainBinding
import kotlin.reflect.typeOf


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.button.setOnClickListener {

            var userweight =  binding.weightinput.text.toString()
            var userhight  =  binding.hightinput.text.toString()
            var convert:Double = 0.3048
            var hightvalu: Int  = ("$userhight*$convert")
            var indexscor:Int = userweight/hightvalu

            when(indexscor){
                in 1..25 -> "under"
                in 1..25 -> "normal"
                in 1..25 -> "over"
                else -> "ovese"
            }


       }

    }

}