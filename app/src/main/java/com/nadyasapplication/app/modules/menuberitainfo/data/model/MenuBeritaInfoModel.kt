package com.nadyasapplication.app.modules.menuberitainfo.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuBeritaInfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDISCOVER: String? = MyApp.getInstance().resources.getString(R.string.lbl_discover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeritadanInfo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_berita_dan_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtURGENTPMIKa: String? = MyApp.getInstance().resources.getString(R.string.msg_urgent_pmi_ka)

)
