package com.nadyasapplication.app.modules.menuberitainfo.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListbrucemarsgjtdRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMudahlakukan: String? = MyApp.getInstance().resources.getString(R.string.msg_mudah_lakukan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJanuariCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_januari_2023)

)
