package com.nadyasapplication.app.modules.tipegoldar.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TipeGoldarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihtipeGolo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_tipe_golo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihRhesusmu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_rhesusmu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl4)

)
