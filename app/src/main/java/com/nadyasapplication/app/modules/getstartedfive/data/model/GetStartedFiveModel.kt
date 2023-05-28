package com.nadyasapplication.app.modules.getstartedfive.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GetStartedFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMulaiGayaHidu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mulai_gaya_hidu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMerekaSELAMAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mereka_selamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDapatkanREWARD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dapatkan_reward)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_temukan_jadwal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tahukan_kamu_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKumpulkanpoint: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kumpulkan_point)

)
