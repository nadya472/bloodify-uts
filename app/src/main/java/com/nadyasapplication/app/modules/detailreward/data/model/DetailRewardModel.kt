package com.nadyasapplication.app.modules.detailreward.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailRewardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTebusmurahset: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tebus_murah_set2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSyaratdanKete: String? =
      MyApp.getInstance().resources.getString(R.string.msg_syarat_dan_kete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLokasiOutlet: String? = MyApp.getInstance().resources.getString(R.string.lbl_lokasi_outlet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is3)

)
