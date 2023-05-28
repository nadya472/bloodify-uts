package com.nadyasapplication.app.modules.detailinfo.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailInfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtURGENTPMIKab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_urgent_pmi_kab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)

)
