package com.nadyasapplication.app.modules.menuutama.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuUtamaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRiwayatDonor: String? = MyApp.getInstance().resources.getString(R.string.lbl_riwayat_donor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaliCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_kali)

)
