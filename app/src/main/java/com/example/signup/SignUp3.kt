package com.example.signup

import android.animation.ObjectAnimator
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.signup.databinding.ActivitySignUp3Binding

class SignUp3 : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUp3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        setupOtpInput()

        binding.progressBar.max = 3
        ObjectAnimator.ofInt(binding.progressBar, "progress", 3)
            .start()

    }

    private fun setupOtpInput() {
        binding.apply {

            otpDigit1.addTextChangedListener(GenericTextWatcher(otpDigit1, otpDigit2))
            otpDigit2.addTextChangedListener(GenericTextWatcher(otpDigit2, otpDigit3))
            otpDigit3.addTextChangedListener(GenericTextWatcher(otpDigit3, otpDigit4))
            otpDigit4.addTextChangedListener(GenericTextWatcher(otpDigit4, null))
        }
    }

    private inner class GenericTextWatcher(
        private val currentView: EditText,
        private val nextView: EditText?
    ) : TextWatcher {

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {
            if (s?.length == 1) {
                nextView?.requestFocus()
            }
        }
    }
}