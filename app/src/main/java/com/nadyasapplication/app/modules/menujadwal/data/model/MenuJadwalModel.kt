package com.nadyasapplication.app.modules.menujadwal.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuJadwalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJADWALKEGIATAN: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jadwal_kegiatan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_utd_pmi_kabupat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkandatang: String? = MyApp.getInstance().resources.getString(R.string.lbl_akan_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHariini: String? = MyApp.getInstance().resources.getString(R.string.lbl_hari_ini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGedungJuangFortyFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gedung_juang_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBekasiBerpijar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bekasi_berpijar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKamis13April: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kamis_13_april)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinggu15Apri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_minggu_15_apri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetlandTambun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_metland_tambun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPMRSMKN1Cika: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pmr_smkn_1_cika)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinggu15ApriOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_minggu_15_apri)

)
