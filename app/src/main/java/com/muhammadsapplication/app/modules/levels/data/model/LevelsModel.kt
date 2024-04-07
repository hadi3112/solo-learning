package com.muhammadsapplication.app.modules.levels.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LevelsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUnlockedlvlone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlocked_lvl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtObjectoriented: String? =
      MyApp.getInstance().resources.getString(R.string.msg_object_oriented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoops: String? = MyApp.getInstance().resources.getString(R.string.lbl_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForloops: String? = MyApp.getInstance().resources.getString(R.string.lbl_for_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoopswith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_loops_with_conditions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhileloops: String? = MyApp.getInstance().resources.getString(R.string.lbl_while_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasics: String? = MyApp.getInstance().resources.getString(R.string.lbl_basics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConditionals: String? = MyApp.getInstance().resources.getString(R.string.lbl_conditionals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputoutput: String? = MyApp.getInstance().resources.getString(R.string.lbl_input_output)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfelseelseif: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_if_else_elseif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallengeone: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenge_1_grade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoopsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_loops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenge2mpthr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenge_2_mp3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallengethree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenge_3_arithmatic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdvanced: String? = MyApp.getInstance().resources.getString(R.string.msg_advanced_concepts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArrays: String? = MyApp.getInstance().resources.getString(R.string.lbl_arrays)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseful: String? = MyApp.getInstance().resources.getString(R.string.msg_useful_subroutines)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommonsorting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_common_sorting_algorithms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBosschallenge: String? =
      MyApp.getInstance().resources.getString(R.string.msg_boss_challenge)

)
