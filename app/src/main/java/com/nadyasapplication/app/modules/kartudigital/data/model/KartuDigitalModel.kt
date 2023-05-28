package com.nadyasapplication.app.modules.kartudigital.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KartuDigitalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKARTUDIGITALA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kartu_digital_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVeronicaPark: String? = MyApp.getInstance().resources.getString(R.string.lbl_veronica_park)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt000894271909: String? = MyApp.getInstance().resources.getString(R.string.lbl_000894271909)
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_at)

)
