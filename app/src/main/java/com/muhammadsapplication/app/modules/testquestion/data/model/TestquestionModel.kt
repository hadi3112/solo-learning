package com.muhammadsapplication.app.modules.testquestion.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TestquestionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_question_1_what)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription1: String? = MyApp.getInstance().resources.getString(R.string.msg_1_2_3_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_include_iostream_using)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAns: String? = MyApp.getInstance().resources.getString(R.string.lbl_ans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription3: String? = MyApp.getInstance().resources.getString(R.string.msg_for_int_i_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription4: String? = MyApp.getInstance().resources.getString(R.string.msg_for_int_i_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription5: String? = MyApp.getInstance().resources.getString(R.string.msg_for_int_i_03)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCorrect: String? = MyApp.getInstance().resources.getString(R.string.lbl_correct)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription6: String? = MyApp.getInstance().resources.getString(R.string.msg_for_i_1_to_le)

)
