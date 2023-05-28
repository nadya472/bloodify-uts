package com.nadyasapplication.app.modules.lupapassword.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LupaPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTulisalamatem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tulis_alamat_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMASUK: String? = MyApp.getInstance().resources.getString(R.string.lbl_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyNineValue: String? = null
)
