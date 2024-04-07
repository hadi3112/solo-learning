package com.muhammadsapplication.app.modules.preferences.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PreferencesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_personalize_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggested: String? = MyApp.getInstance().resources.getString(R.string.lbl_suggested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSlides: String? = MyApp.getInstance().resources.getString(R.string.lbl_slides)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPdfanalysis: String? = MyApp.getInstance().resources.getString(R.string.lbl_pdf_analysis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMemory: String? = MyApp.getInstance().resources.getString(R.string.lbl_memory)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpacedlearning: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_spaced_learning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodingstuff: String? = MyApp.getInstance().resources.getString(R.string.lbl_coding_stuff)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListeningspeed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listening_speed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCssValue: String? = null
)
