package com.muhammadsapplication.app.modules.gettingstartedtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityGettingStartedTwoBinding
import com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.viewmodel.GettingStartedTwoVM
import com.muhammadsapplication.app.modules.preferences.ui.PreferencesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GettingStartedTwoActivity :
    BaseActivity<ActivityGettingStartedTwoBinding>(R.layout.activity_getting_started_two) {
  private val viewModel: GettingStartedTwoVM by viewModels<GettingStartedTwoVM>()

  private val REQUEST_CODE_PREFERENCES_ACTIVITY: Int = 623


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gettingStartedTwoVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = PreferencesActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PREFERENCES_ACTIVITY)
      }, 20000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "GETTING_STARTED_TWO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, GettingStartedTwoActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
