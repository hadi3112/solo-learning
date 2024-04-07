package com.muhammadsapplication.app.modules.homepageexplore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homepageexplore.`data`.model.HomepageexploreModel
import org.koin.core.KoinComponent

class HomepageexploreVM : ViewModel(), KoinComponent {
  val homepageexploreModel: MutableLiveData<HomepageexploreModel> =
      MutableLiveData(HomepageexploreModel())

  var navArguments: Bundle? = null
}
