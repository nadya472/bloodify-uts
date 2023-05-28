package com.nadyasapplication.app.modules.menuprofil.`data`.model

import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuProfilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasiUmum: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_informasi_umum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_profil2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTentangKami: String? = MyApp.getInstance().resources.getString(R.string.lbl_tentang_kami)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreferensi: String? = MyApp.getInstance().resources.getString(R.string.lbl_preferensi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendFeedbakc: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
