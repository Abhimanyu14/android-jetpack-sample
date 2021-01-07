package com.makeappssimple.demo

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.makeappssimple.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityViewModel by viewModels<MainActivityViewModel>()
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewBinding.lifecycleOwner = this
        viewBinding.model = activityViewModel

        activityViewModel.count.observe(this, {
            viewBinding.textviewCount.text = it.toString()
        })
    }
}
