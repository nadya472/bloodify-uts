package com.nadyasapplication.app.modules.menureward.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListchatimeemblemOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTebusmurahsetOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tebus_murah_set)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSKBerlakuThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_k_berlaku)

)
