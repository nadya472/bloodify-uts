package com.nadyasapplication.app.modules.detailjadwal.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailJadwalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDETAILKEGIATAN: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_kegiatan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUTDPMIKabupat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_utd_pmi_kabupat2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBukasetiaphar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buka_setiap_har)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPukul08002: String? = MyApp.getInstance().resources.getString(R.string.msg_pukul_08_00_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKegiatandonor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kegiatan_donor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJlRayaTeuku: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_raya_teuku)

)
