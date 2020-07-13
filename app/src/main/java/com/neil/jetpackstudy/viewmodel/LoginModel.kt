package com.neil.jetpackstudy.viewmodel

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.neil.jetpackstudy.ui.main.MainMenuActivity
import com.neil.jetpackstudy.utils.Constants

/**
 * @USER NEIL.Z
 * @TIME 2020/6/23 0023 14:57
 * @DESC 使用databinding 负责登录逻辑的处理以及两个输入框内容改变的时候数据更新的处理
 */
class LoginModel constructor(name: String , pwd: String, context: Context) {
    //双向绑定数据
    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)
    var context: Context = context

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        n.set(s.toString())
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        p.set(s.toString())
    }

    fun login() {
        if (n.get().equals(Constants.USER_NAME) && p.get().equals(Constants.USER_PWD)) {
            Toast.makeText(context, "登录成功", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainMenuActivity::class.java)
            context.startActivity(intent)
        } else {
            Toast.makeText(context, "登录失败", Toast.LENGTH_SHORT).show()
        }
    }
}