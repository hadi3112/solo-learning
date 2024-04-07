package com.muhammadsapplication.app.modules.gettingstartedtwo.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGettingstarted: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_getting_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHilookingto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_looking_to_master)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGopremium: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_premium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnlockall: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlock_all_levels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosea: String? = MyApp.getInstance().resources.getString(R.string.msg_choose_a_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewchallenge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_challenge_patterns)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_solve_tests_mcqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscounts: String? = MyApp.getInstance().resources.getString(R.string.lbl_discounts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_earn_medals_to_unlock)

)
