package com.nadyasapplication.app.modules.halamanregistrasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.halamanregistrasi.`data`.model.HalamanRegistrasiModel
import org.koin.core.KoinComponent

class HalamanRegistrasiVM : ViewModel(), KoinComponent {
  val halamanRegistrasiModel: MutableLiveData<HalamanRegistrasiModel> =
      MutableLiveData(HalamanRegistrasiModel())

  var navArguments: Bundle? = null
}
