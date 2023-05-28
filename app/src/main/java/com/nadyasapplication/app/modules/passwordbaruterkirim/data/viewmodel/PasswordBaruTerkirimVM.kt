package com.nadyasapplication.app.modules.passwordbaruterkirim.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.passwordbaruterkirim.`data`.model.PasswordBaruTerkirimModel
import org.koin.core.KoinComponent

class PasswordBaruTerkirimVM : ViewModel(), KoinComponent {
  val passwordBaruTerkirimModel: MutableLiveData<PasswordBaruTerkirimModel> =
      MutableLiveData(PasswordBaruTerkirimModel())

  var navArguments: Bundle? = null
}
