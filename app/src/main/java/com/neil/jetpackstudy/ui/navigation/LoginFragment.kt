package com.neil.jetpackstudy.ui.navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.neil.jetpackstudy.R
import com.neil.jetpackstudy.databinding.FragmentLoginBinding
import com.neil.jetpackstudy.viewmodel.LoginModel

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        //val binding: FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)
        val loginModel = LoginModel("neil", "123", context!!)

        //绑定
        binding.model = loginModel
        binding.activity = activity
        return binding.root
    }

}
