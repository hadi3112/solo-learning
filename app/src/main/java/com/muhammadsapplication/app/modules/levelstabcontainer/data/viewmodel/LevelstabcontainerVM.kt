package com.muhammadsapplication.app.modules.levelstabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.levelstabcontainer.`data`.model.LevelstabcontainerModel
import org.koin.core.KoinComponent

class LevelstabcontainerVM : ViewModel(), KoinComponent {
  val levelstabcontainerModel: MutableLiveData<LevelstabcontainerModel> =
      MutableLiveData(LevelstabcontainerModel())

  var navArguments: Bundle? = null
}
