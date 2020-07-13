package com.neil.jetpackstudy.ui.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @USER NEIL.Z
 * @TIME 2020/6/24 0024 9:36
 * @DESC 实现了LifecycleObserver接口，说明LastLocationListener成为了一个Lifecycle的观察者
 */
class LastLocationListener : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        Log.e("zh", "lifecycle LastLocationListener start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        // disconnect from system location service
        Log.e("zh", "lifecycle LastLocationListener stop")
    }
}
