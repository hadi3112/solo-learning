package com.muhammadsapplication.app.modules.logintabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityLogintabcontainerBinding
import com.muhammadsapplication.app.modules.gettingstarted.ui.GettingStartedActivity
import com.muhammadsapplication.app.modules.logintabcontainer.`data`.viewmodel.LogintabcontainerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LogintabcontainerActivity :
    BaseActivity<ActivityLogintabcontainerBinding>(R.layout.activity_logintabcontainer) {
  private val viewModel: LogintabcontainerVM by viewModels<LogintabcontainerVM>()

  private val REQUEST_CODE_GETTING_STARTED_ACTIVITY: Int = 855

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logintabcontainerVM = viewModel
    val adapter = LogintabcontainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerViewpager) { tab, position ->
      tab.text = LogintabcontainerActivityPagerAdapter.title[position]
      }.attach()
      val destIntent = GettingStartedActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GETTING_STARTED_ACTIVITY)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LOGINTABCONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LogintabcontainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
