package com.muhammadsapplication.app.modules.gettingstartedone.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedOneModel(
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
  var txtChoosewhatto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_what_to_learn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPicka: String? = MyApp.getInstance().resources.getString(R.string.msg_pick_a_preference)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectwhat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_what_tech)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonotworry: String? = MyApp.getInstance().resources.getString(R.string.lbl_do_not_worry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_there_s_tutorial)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_go_through_as_many)

)
