package com.muhammadsapplication.app.modules.levelsplay.ui

import android.content.Context
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseDialogFragment
import com.muhammadsapplication.app.databinding.DialogLevelsplayBinding
import com.muhammadsapplication.app.modules.levelsplay.`data`.viewmodel.LevelsplayVM
import com.muhammadsapplication.app.modules.testquestion.ui.TestquestionActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LevelsplayDialog : BaseDialogFragment<DialogLevelsplayBinding>(R.layout.dialog_levelsplay) {
  private val viewModel: LevelsplayVM by viewModels<LevelsplayVM>()

  private val REQUEST_CODE_TESTQUESTION_ACTIVITY: Int = 545

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.levelsplayVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = TestquestionActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_TESTQUESTION_ACTIVITY)
      dismiss()
      }, 20000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LEVELSPLAY_DIALOG"

    }
  }
