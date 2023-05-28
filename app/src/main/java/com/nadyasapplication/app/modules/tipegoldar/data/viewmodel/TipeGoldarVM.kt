package com.nadyasapplication.app.modules.tipegoldar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.tipegoldar.`data`.model.TipeGoldarModel
import org.koin.core.KoinComponent

class TipeGoldarVM : ViewModel(), KoinComponent {
  val tipeGoldarModel: MutableLiveData<TipeGoldarModel> = MutableLiveData(TipeGoldarModel())

  var navArguments: Bundle? = null
}
