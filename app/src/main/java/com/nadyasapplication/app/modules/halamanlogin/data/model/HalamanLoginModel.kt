package com.nadyasapplication.app.modules.halamanlogin.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBagaimanakabar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bagaimana_kabar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKataSandi: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupakatasandi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lupa_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_belum_memiliki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftar: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
