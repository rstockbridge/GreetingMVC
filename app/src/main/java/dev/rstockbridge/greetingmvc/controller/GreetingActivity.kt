package dev.rstockbridge.greetingmvc.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.rstockbridge.greetingmvc.databinding.ActivityMainBinding
import dev.rstockbridge.greetingmvc.model.GreetingModel

// This activity is not rotation safe
class GreetingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val model = GreetingModel()
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            clickCount++
            showMessage(model.getMessage(clickCount))
        }

        showMessage(model.getMessage(clickCount))
    }

    private fun showMessage(text: String) {
        binding.label.text = text
    }
}
