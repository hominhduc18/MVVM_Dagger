package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.LoginactivityBinding
import com.example.myapplication.viewModels.LoginViewModel


class LoginActivitys : AppCompatActivity() {

    private val viewModel: LoginViewModel by lazy {
        ViewModelProvider(this)[LoginViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: LoginactivityBinding= DataBindingUtil.setContentView(this,R.layout.loginactivity)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel


        binding.btnLogins.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


