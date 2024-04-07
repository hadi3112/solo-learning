package com.muhammadsapplication.app.modules.homepageexplore.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentHomepageexploreBinding
import com.muhammadsapplication.app.modules.homepageexplore.`data`.viewmodel.HomepageexploreVM
import kotlin.String
import kotlin.Unit

class HomepageexploreFragment :
    BaseFragment<FragmentHomepageexploreBinding>(R.layout.fragment_homepageexplore) {
  private val viewModel: HomepageexploreVM by viewModels<HomepageexploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homepageexploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGEEXPLORE_FRAGMENT"

  }
}
