package com.makeappssimple.demo

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var count = 0
        private set

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}
