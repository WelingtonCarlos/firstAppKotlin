package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener {
            val nome = binding.editName.text.toString()
            binding.textResult1.text = "Olá, " + nome
            binding.textResult2.text = "Olá, ${nome}"
            binding.textResult3.setText("Olá, " + nome)
        }
    }
}