package com.nadyasapplication.app.modules.menureward.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class List1200pxdominosRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDisc20Allva: String? = MyApp.getInstance().resources.getString(R.string.msg_disc_20_all_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSKBerlaku: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_k_berlaku)

)
