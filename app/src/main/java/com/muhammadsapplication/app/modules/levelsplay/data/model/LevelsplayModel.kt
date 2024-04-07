package com.muhammadsapplication.app.modules.levelsplay.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LevelsplayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChallengeone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenge_1_grade2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_prerequisites)

)
