package com.muhammadsapplication.app.modules.homepageexplore.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageexploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtObjectoriented: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_object_oriented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPython: String? = MyApp.getInstance().resources.getString(R.string.lbl_python)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtC: String? = MyApp.getInstance().resources.getString(R.string.lbl_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHtml: String? = MyApp.getInstance().resources.getString(R.string.lbl_html)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndroiddev: String? = MyApp.getInstance().resources.getString(R.string.lbl_android_dev)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSolidity: String? = MyApp.getInstance().resources.getString(R.string.lbl_solidity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularmodules: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_modules)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPythonfour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_python_4_everybody_getting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHtmlforwebthree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_html_for_web_3_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCabeginners: String? =
      MyApp.getInstance().resources.getString(R.string.msg_c_a_beginner_s_guide)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearn: String? = MyApp.getInstance().resources.getString(R.string.msg_learn_solididity_for)

)
