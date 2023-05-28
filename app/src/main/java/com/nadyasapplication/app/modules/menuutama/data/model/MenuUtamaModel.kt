package com.nadyasapplication.app.modules.menuutama.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuUtamaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaloVeronica: String? = MyApp.getInstance().resources.getString(R.string.msg_halo_veronica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDPMIxxxxxx: String? = MyApp.getInstance().resources.getString(R.string.msg_id_pmi_xxx_xxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAB: String? = MyApp.getInstance().resources.getString(R.string.lbl_ab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.msg_wanita_23_tahu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBekasiJawaBa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bekasi_jawa_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpdateData: String? = MyApp.getInstance().resources.getString(R.string.lbl_update_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKartuDigital: String? = MyApp.getInstance().resources.getString(R.string.lbl_kartu_digital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointKamu: String? = MyApp.getInstance().resources.getString(R.string.lbl_point_kamu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtURGENTPMIKa: String? = MyApp.getInstance().resources.getString(R.string.msg_urgent_pmi_ka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtikelPilihan: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_artikel_pilihan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApakahbolehme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apakah_boleh_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLebihbanyak: String? = MyApp.getInstance().resources.getString(R.string.lbl_lebih_banyak)

)
