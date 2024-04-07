package com.muhammadsapplication.app.modules.homepageexploretabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepageexploretabcontainer.`data`.model.HomepageexploretabContainerModel
import org.koin.core.KoinComponent

class HomepageexploretabContainerVM : ViewModel(), KoinComponent {
  val homepageexploretabContainerModel: MutableLiveData<HomepageexploretabContainerModel> =
      MutableLiveData(HomepageexploretabContainerModel())

  var navArguments: Bundle? = null
}
