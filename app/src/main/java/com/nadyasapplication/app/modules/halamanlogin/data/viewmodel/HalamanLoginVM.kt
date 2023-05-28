package com.nadyasapplication.app.modules.halamanlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.halamanlogin.`data`.model.HalamanLoginModel
import org.koin.core.KoinComponent

class HalamanLoginVM : ViewModel(), KoinComponent {
  val halamanLoginModel: MutableLiveData<HalamanLoginModel> = MutableLiveData(HalamanLoginModel())

  var navArguments: Bundle? = null
}
