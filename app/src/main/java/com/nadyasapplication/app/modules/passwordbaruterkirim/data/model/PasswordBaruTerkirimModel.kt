package com.nadyasapplication.app.modules.passwordbaruterkirim.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PasswordBaruTerkirimModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_password_baru_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginkembali: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_kembali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTidakmenerima: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tidak_menerima)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKirimulang: String? = MyApp.getInstance().resources.getString(R.string.lbl_kirim_ulang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMASUK: String? = MyApp.getInstance().resources.getString(R.string.lbl_masuk)

)
