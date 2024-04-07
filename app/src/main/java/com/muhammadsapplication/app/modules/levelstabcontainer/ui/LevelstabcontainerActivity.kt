package com.muhammadsapplication.app.modules.levelstabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityLevelstabcontainerBinding
import com.muhammadsapplication.app.modules.levelstabcontainer.`data`.viewmodel.LevelstabcontainerVM
import kotlin.String
import kotlin.Unit

class LevelstabcontainerActivity :
    BaseActivity<ActivityLevelstabcontainerBinding>(R.layout.activity_levelstabcontainer) {
  private val viewModel: LevelstabcontainerVM by viewModels<LevelstabcontainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.levelstabcontainerVM = viewModel
    val adapter = LevelstabcontainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerViewpager) { tab, position ->
      tab.text = LevelstabcontainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LEVELSTABCONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LevelstabcontainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
