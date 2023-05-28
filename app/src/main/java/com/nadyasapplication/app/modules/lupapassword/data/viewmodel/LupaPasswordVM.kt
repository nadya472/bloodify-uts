package com.nadyasapplication.app.modules.lupapassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.lupapassword.`data`.model.LupaPasswordModel
import org.koin.core.KoinComponent

class LupaPasswordVM : ViewModel(), KoinComponent {
  val lupaPasswordModel: MutableLiveData<LupaPasswordModel> = MutableLiveData(LupaPasswordModel())

  var navArguments: Bundle? = null
}
