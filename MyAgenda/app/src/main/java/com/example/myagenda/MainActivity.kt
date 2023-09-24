package com.example.myagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.myagenda.databinding.ActivityMainBinding
import com.example.myagenda.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: CONNECT THE VIEW MODEL WITH LIVE DATA IN LATER CODING SESSIONS
        viewModel = ViewModelProvider(this).get()
        viewModel.init()
    }
}