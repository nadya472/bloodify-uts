package com.nadyasapplication.app.modules.detailprofilone.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailProfilOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaLengkap: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_lengkap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaLengkapOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nama_lengkap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDPMI: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_pmi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_xxx_xxx_xxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTglLahir: String? = MyApp.getInstance().resources.getString(R.string.lbl_tgl_lahir)
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
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGolonganDarah: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_golongan_darah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoHp: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_hp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSebagiandataa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sebagian_data_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYa: String? = MyApp.getInstance().resources.getString(R.string.lbl_ya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTidak: String? = MyApp.getInstance().resources.getString(R.string.lbl_tidak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
