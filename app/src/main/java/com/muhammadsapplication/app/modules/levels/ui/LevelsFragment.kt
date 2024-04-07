package com.muhammadsapplication.app.modules.levels.ui

import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentLevelsBinding
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerHtmlweb3zeroModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerPythongettingModel
import com.muhammadsapplication.app.modules.levels.`data`.viewmodel.LevelsVM
import kotlin.String
import kotlin.Unit

class LevelsFragment : BaseFragment<FragmentLevelsBinding>(R.layout.fragment_levels) {
  private val viewModel: LevelsVM by viewModels<LevelsVM>()

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
    viewModel.spinnerHtmlweb3zeroList.value = mutableListOf(
    SpinnerHtmlweb3zeroModel("Item1"),
    SpinnerHtmlweb3zeroModel("Item2"),
    SpinnerHtmlweb3zeroModel("Item3"),
    SpinnerHtmlweb3zeroModel("Item4"),
    SpinnerHtmlweb3zeroModel("Item5")
    )
    val spinnerHtmlweb3zeroAdapter =
    SpinnerHtmlweb3zeroAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerHtmlweb3zeroList.value?:
    mutableListOf())
    binding.spinnerHtmlweb3zero.adapter = spinnerHtmlweb3zeroAdapter
    binding.levelsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LEVELS_FRAGMENT"

  }
}
