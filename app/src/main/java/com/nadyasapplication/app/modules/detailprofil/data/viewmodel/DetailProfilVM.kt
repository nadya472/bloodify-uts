package com.nadyasapplication.app.modules.detailprofil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.detailprofil.`data`.model.DetailProfilModel
import org.koin.core.KoinComponent

class DetailProfilVM : ViewModel(), KoinComponent {
  val detailProfilModel: MutableLiveData<DetailProfilModel> = MutableLiveData(DetailProfilModel())

  var navArguments: Bundle? = null
}
