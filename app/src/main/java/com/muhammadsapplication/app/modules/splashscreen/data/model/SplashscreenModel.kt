package com.muhammadsapplication.app.modules.splashscreen.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashscreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSololearning: String? = MyApp.getInstance().resources.getString(R.string.lbl_solo_learning)

)
