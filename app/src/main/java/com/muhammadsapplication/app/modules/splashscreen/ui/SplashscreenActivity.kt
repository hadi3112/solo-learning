package com.muhammadsapplication.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivitySplashscreenBinding
import com.muhammadsapplication.app.modules.logintabcontainer.ui.LogintabcontainerActivity
import com.muhammadsapplication.app.modules.splashscreen.`data`.viewmodel.SplashscreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SplashscreenActivity :
    BaseActivity<ActivitySplashscreenBinding>(R.layout.activity_splashscreen) {
  private val viewModel: SplashscreenVM by viewModels<SplashscreenVM>()

  private val REQUEST_CODE_LOGINTABCONTAINER_ACTIVITY: Int = 192

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashscreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LogintabcontainerActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LOGINTABCONTAINER_ACTIVITY)
      }, 4000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASHSCREEN_ACTIVITY"

    }
  }
