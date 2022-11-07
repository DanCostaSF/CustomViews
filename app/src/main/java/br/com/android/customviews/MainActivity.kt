package br.com.android.customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import br.com.android.customviews.component.LabelShowMoneyComponent
import br.com.android.customviews.component.PixManualContentView
import br.com.android.customviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewModel()
        setupObservers()

        binding.lsmc.money = 123f
        binding.pix.txv_tittle = true

    }

    private fun setupViewModel() {
        binding.vm = viewModel
    }

    private fun setupObservers() {
        viewModel.value.observe(this){
            binding.txvValue.text = it.toString()
        }
    }
}