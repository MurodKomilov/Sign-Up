package com.example.signup

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.signup.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.apply {
            progressBar.max = 3


            ObjectAnimator.ofInt(progressBar, "progress", 1)
                .start()

            nextBtn.setOnClickListener {
                var intent = Intent(this@SignUp, SignUp2::class.java)
                startActivity(intent)
            }

            icBack.setOnClickListener {
                finish()
            }
        }


    }
}