package com.neil.jetpackstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import com.neil.jetpackstudy.ui.lifecycle.LastLocationListener
import com.neil.jetpackstudy.ui.navigation.NavigationStudyActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_navigation.setOnClickListener {
            startActivity(Intent(this, NavigationStudyActivity::class.java))
        }

        //LiveData
        var liveData = MutableLiveData<String>()
        bt_livedata.setOnClickListener {
            //发送数据
            liveData.postValue("有新消息了")
        }
        //观察livedata对象
//        liveData.observe(this, Observer<String> {
//            //Updata UI
//            bt_livedata.setText(it)
//        })

        //更改LiveData数据
        var changLiveData = Transformations.map(liveData) {
            it + "changed"
        }
        changLiveData.observe(this, Observer<String> {
            //Updata UI
            bt_livedata.setText(it)
        })

        //Lifecycle
        var lastLocationListener = LastLocationListener()
        lifecycle.addObserver(lastLocationListener)
    }
}
