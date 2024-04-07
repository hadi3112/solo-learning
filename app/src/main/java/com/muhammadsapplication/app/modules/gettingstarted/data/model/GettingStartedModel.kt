package com.muhammadsapplication.app.modules.gettingstarted.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedModel(
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
  var txtHowitworks: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_it_works)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPickatrack: String? = MyApp.getInstance().resources.getString(R.string.lbl_pick_a_track)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosea: String? = MyApp.getInstance().resources.getString(R.string.msg_choose_a_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompletelevels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_complete_levels)
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
  var txtProgress: String? = MyApp.getInstance().resources.getString(R.string.lbl_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_earn_medals_to_unlock)

)
