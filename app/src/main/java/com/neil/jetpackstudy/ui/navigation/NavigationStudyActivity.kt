package com.neil.jetpackstudy.ui.navigation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.neil.jetpackstudy.R

/**
 * @USER NEIL.Z
 * @TIME 2020/6/23 0023 10:07
 * @DESC navigation导航
 * 1.创建基础目录：资源文件res目录下创建navigation目录 -> 右击navigation目录New一个Navigation resource file
 * 2.在navigation file中创建一个Destination，如果说navigation是我们的导航工具，Destination是我们的目的地
 * 3.建立NavHostFragment
 */
class NavigationStudyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
    }
}