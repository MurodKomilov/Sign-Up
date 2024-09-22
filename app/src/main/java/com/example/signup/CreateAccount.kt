package com.example.signup

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.signup.databinding.CreateAccountBinding

class CreateAccount : ComponentActivity() {
    private lateinit var binding:CreateAccountBinding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = CreateAccountBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }





}


}