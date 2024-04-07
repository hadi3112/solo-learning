package com.muhammadsapplication.app.modules.homepagelevels.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.HomepagelevelsModel
import com.muhammadsapplication.app.modules.homepagelevels.`data`.model.SpinnerPythongettingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepagelevelsVM : ViewModel(), KoinComponent {
  val homepagelevelsModel: MutableLiveData<HomepagelevelsModel> =
      MutableLiveData(HomepagelevelsModel())

  var navArguments: Bundle? = null

  val spinnerPythongettingList: MutableLiveData<MutableList<SpinnerPythongettingModel>> =
      MutableLiveData()
}
