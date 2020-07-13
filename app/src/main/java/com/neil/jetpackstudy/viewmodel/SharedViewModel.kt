package com.neil.jetpackstudy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @USER NEIL.Z
 * @TIME 2020/6/29 0029 9:55
 * @DESC viewmodel，配合LiveData就可以观察Name的变化
 */
class SharedViewModel : ViewModel() {

    private var info: MutableLiveData<String>? = null

    fun getInfo(): LiveData<String>? {
        if (info == null) {
            info = MutableLiveData<String>()
            setInfo()
        }
        return info
    }

    fun setInfo() {
        info?.value = "onexzgj"
    }

    fun setInfo(value: String) {
        info?.value = value
    }
}