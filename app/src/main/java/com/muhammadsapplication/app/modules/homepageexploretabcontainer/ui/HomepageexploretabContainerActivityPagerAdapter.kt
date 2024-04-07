package com.muhammadsapplication.app.modules.homepageexploretabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import com.muhammadsapplication.app.modules.homepageexplore.ui.HomepageexploreFragment
import com.muhammadsapplication.app.modules.homepagelevels.ui.HomepagelevelsFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class HomepageexploretabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_explore),MyApp.getInstance().resources.getString(R.string.lbl_levels),MyApp.getInstance().resources.getString(R.string.lbl_challenges))

        val viewPages: List<Fragment> =
                listOf(HomepageexploreFragment(),HomepagelevelsFragment(),HomepagelevelsFragment())

    }
}
