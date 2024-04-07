package com.muhammadsapplication.app.modules.homepageexploretabcontainer.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageexploretabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHihadi: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_hadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt25718000xp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2571_8000_xp_collected)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrenttrack: String? = MyApp.getInstance().resources.getString(R.string.lbl_current_track)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCfunction: String? =
      MyApp.getInstance().resources.getString(R.string.msg_c_function_programming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPtsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_000_pts)

)
