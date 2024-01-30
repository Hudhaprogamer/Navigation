package com.example.belajar_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.belajar_navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnHello.setOnClickListener{


            var nilaiA = binding.inputA.text.toString().toInt()
            var nilaiB = binding.inputB.text.toString().toInt()
            var hasil = jumlah(nilaiA, nilaiB)
            binding.tvHello.setText(hasil.toString())
        }

    }
    private fun jumlah(a: Int, b:Int): Int{
        return a + b
    }
}