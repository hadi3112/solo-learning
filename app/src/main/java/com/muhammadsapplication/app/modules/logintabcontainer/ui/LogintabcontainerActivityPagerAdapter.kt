package com.muhammadsapplication.app.modules.logintabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import com.muhammadsapplication.app.modules.login.ui.LoginFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class LogintabcontainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_login),MyApp.getInstance().resources.getString(R.string.lbl_sign_up))

        val viewPages: List<Fragment> = listOf(LoginFragment(),LoginFragment())

    }
}
