package com.serioussem.webviewexample.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serioussem.webviewexample.databinding.HomeActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        HomeActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

}