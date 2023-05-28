package com.nadyasapplication.app.modules.menuberitainfo.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListfoodoneOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_anti_hambar_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJanuariCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_januari_2023)

)
