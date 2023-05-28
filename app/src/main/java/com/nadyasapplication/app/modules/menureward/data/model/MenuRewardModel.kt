package com.nadyasapplication.app.modules.menureward.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuRewardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_reward_kamu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDapatkanpenawa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dapatkan_penawa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointSaya: String? = MyApp.getInstance().resources.getString(R.string.lbl_point_saya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)

)
