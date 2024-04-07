package com.muhammadsapplication.app.modules.levels.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levels.`data`.model.LevelsModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerHtmlweb3zeroModel
import com.muhammadsapplication.app.modules.levels.`data`.model.SpinnerPythongettingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LevelsVM : ViewModel(), KoinComponent {
  val levelsModel: MutableLiveData<LevelsModel> = MutableLiveData(LevelsModel())

  var navArguments: Bundle? = null

  val spinnerPythongettingList: MutableLiveData<MutableList<SpinnerPythongettingModel>> =
      MutableLiveData()

  val spinnerHtmlweb3zeroList: MutableLiveData<MutableList<SpinnerHtmlweb3zeroModel>> =
      MutableLiveData()
}
