package com.nadyasapplication.app.modules.kartudigital.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.kartudigital.`data`.model.KartuDigitalModel
import org.koin.core.KoinComponent

class KartuDigitalVM : ViewModel(), KoinComponent {
  val kartuDigitalModel: MutableLiveData<KartuDigitalModel> = MutableLiveData(KartuDigitalModel())

  var navArguments: Bundle? = null
}
