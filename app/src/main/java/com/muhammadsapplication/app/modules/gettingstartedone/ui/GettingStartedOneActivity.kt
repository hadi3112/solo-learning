package com.muhammadsapplication.app.modules.gettingstartedone.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityGettingStartedOneBinding
import com.muhammadsapplication.app.modules.gettingstartedone.`data`.viewmodel.GettingStartedOneVM
import com.muhammadsapplication.app.modules.gettingstartedtwo.ui.GettingStartedTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GettingStartedOneActivity :
    BaseActivity<ActivityGettingStartedOneBinding>(R.layout.activity_getting_started_one) {
  private val viewModel: GettingStartedOneVM by viewModels<GettingStartedOneVM>()

  private val REQUEST_CODE_GETTING_STARTED_TWO_ACTIVITY: Int = 962

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gettingStartedOneVM = viewModel
    val destIntent = GettingStartedTwoActivity.getIntent(this, null)
    startActivityForResult(destIntent, REQUEST_CODE_GETTING_STARTED_TWO_ACTIVITY)
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GETTING_STARTED_ONE_ACTIVITY"

  }
}
