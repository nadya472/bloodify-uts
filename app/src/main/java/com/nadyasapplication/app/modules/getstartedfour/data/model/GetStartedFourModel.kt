package com.nadyasapplication.app.modules.getstartedfour.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GetStartedFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBloodify: String? = MyApp.getInstance().resources.getString(R.string.lbl_bloodify)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJointheBloodi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_join_the_bloodi)

)
