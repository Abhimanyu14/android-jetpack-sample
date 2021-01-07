package com.makeappssimple.demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var _count: MutableLiveData<Int> = MutableLiveData(0)
    val count: LiveData<Int>
        get() = _count

    fun increment() {
        _count.value = _count.value?.plus(1)
    }

    fun decrement() {
        _count.value = _count.value?.minus(1)
    }
}
