package com.example.signup

import android.animation.ObjectAnimator
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.signup.databinding.ActivitySignUp2Binding
import com.example.signup.databinding.ActivitySignUpBinding

class SignUp2 : AppCompatActivity() {
    private  lateinit var binding: ActivitySignUp2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            progressBar.max = 3

            checkbox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked){
                    passwordEtx.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                } else passwordEtx.inputType = InputType.TYPE_CLASS_TEXT






        }




        ObjectAnimator.ofInt(binding.progressBar, "progress", 2)
            .start()


    }}}