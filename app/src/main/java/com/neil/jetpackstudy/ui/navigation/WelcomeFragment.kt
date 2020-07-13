package com.neil.jetpackstudy.ui.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.neil.jetpackstudy.R
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_login.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
        bt_register.setOnClickListener {
            //使用Safe Args传参
            val action = WelcomeFragmentDirections.actionToRegisterFragment().setParam1("666")
            findNavController().navigate(action)
        }
    }

}
