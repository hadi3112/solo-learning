package com.muhammadsapplication.app.modules.homepageexploretabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityHomepageexploretabContainerBinding
import com.muhammadsapplication.app.modules.homepageexploretabcontainer.`data`.viewmodel.HomepageexploretabContainerVM
import com.muhammadsapplication.app.modules.levelstabcontainer.ui.LevelstabcontainerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageexploretabContainerActivity :
    BaseActivity<ActivityHomepageexploretabContainerBinding>(R.layout.activity_homepageexploretab_container)
    {
  private val viewModel: HomepageexploretabContainerVM by
      viewModels<HomepageexploretabContainerVM>()

  private val REQUEST_CODE_LEVELSTABCONTAINER_ACTIVITY: Int = 193

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageexploretabContainerVM = viewModel
    val adapter =
    HomepageexploretabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerViewpager) { tab, position ->
      tab.text = HomepageexploretabContainerActivityPagerAdapter.title[position]
      }.attach()
      val destIntent = LevelstabcontainerActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEVELSTABCONTAINER_ACTIVITY)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "HOMEPAGEEXPLORETAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomepageexploretabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
