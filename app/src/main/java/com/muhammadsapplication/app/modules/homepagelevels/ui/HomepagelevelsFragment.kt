package com.muhammadsapplication.app.modules.homepagelevels.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentHomepagelevelsBinding
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.SpinnerPythongettingModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.viewmodel.HomepagelevelsVM
import kotlin.String
import kotlin.Unit

class HomepagelevelsFragment :
    BaseFragment<FragmentHomepagelevelsBinding>(R.layout.fragment_homepagelevels) {
  private val viewModel: HomepagelevelsVM by viewModels<HomepagelevelsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerPythongettingList.value = mutableListOf(
    SpinnerPythongettingModel("Item1"),
    SpinnerPythongettingModel("Item2"),
    SpinnerPythongettingModel("Item3"),
    SpinnerPythongettingModel("Item4"),
    SpinnerPythongettingModel("Item5")
    )
    val spinnerPythongettingAdapter =
    SpinnerPythongettingAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerPythongettingList.value?:
    mutableListOf())
    binding.spinnerPythongetting.adapter = spinnerPythongettingAdapter
    binding.homepagelevelsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGELEVELS_FRAGMENT"

  }
}
