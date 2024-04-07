package com.muhammadsapplication.app.modules.logintabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.logintabcontainer.`data`.model.LogintabcontainerModel
import org.koin.core.KoinComponent

class LogintabcontainerVM : ViewModel(), KoinComponent {
  val logintabcontainerModel: MutableLiveData<LogintabcontainerModel> =
      MutableLiveData(LogintabcontainerModel())

  var navArguments: Bundle? = null
}
