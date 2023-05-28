package com.nadyasapplication.app.modules.halamanregistrasi.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HalamanRegistrasiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAyobergabungb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ayo_bergabung_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonatebloods: String? =
      MyApp.getInstance().resources.getString(R.string.msg_donate_blood_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaLengkap: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_lengkap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoHp: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_hp)
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
  var txtTanggalLahir: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeratBadan: String? = MyApp.getInstance().resources.getString(R.string.lbl_berat_badan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKg: String? = MyApp.getInstance().resources.getString(R.string.lbl_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sudah_memiliki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasuk: String? = MyApp.getInstance().resources.getString(R.string.lbl_masuk2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwelveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
