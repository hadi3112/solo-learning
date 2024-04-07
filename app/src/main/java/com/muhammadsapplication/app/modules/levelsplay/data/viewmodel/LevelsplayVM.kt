package com.muhammadsapplication.app.modules.levelsplay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levelsplay.`data`.model.LevelsplayModel
import org.koin.core.KoinComponent

class LevelsplayVM : ViewModel(), KoinComponent {
  val levelsplayModel: MutableLiveData<LevelsplayModel> = MutableLiveData(LevelsplayModel())

  var navArguments: Bundle? = null
}
