package com.neil.jetpackstudy.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.neil.jetpackstudy.R
import com.neil.jetpackstudy.viewmodel.SharedViewModel
import kotlinx.android.synthetic.main.activity_mainmenu.*


/**
 * @USER NEIL.Z
 * @TIME 2020/6/23 0023 11:15
 * @DESC
 */
class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        //用fragment容器构建导航控制器
        val navControl = findNavController(R.id.nav_host_fragment)
        //关联NavigationView和导航控制器
        NavigationUI.setupWithNavController(bottom_navigation_view, navControl)

        //activity的viewmodel
        val viewModel = ViewModelProvider(this).get(SharedViewModel::class.java)
        viewModel.getInfo()?.observe(this, Observer {
            Log.e("zh", "MainMenuActivity ViewModel " + it)
        })
    }

}