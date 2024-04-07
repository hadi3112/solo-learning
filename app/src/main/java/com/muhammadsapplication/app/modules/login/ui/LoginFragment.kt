package com.muhammadsapplication.app.modules.login.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentLoginBinding
import com.muhammadsapplication.app.modules.gettingstarted.ui.GettingStartedActivity
import com.muhammadsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_GETTING_STARTED_ACTIVITY: Int = 374

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.loginVM = viewModel
    val destIntent = GettingStartedActivity.getIntent(requireActivity(), null)
    startActivityForResult(destIntent, REQUEST_CODE_GETTING_STARTED_ACTIVITY)
    requireActivity().onBackPressed()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGIN_FRAGMENT"

  }
}
