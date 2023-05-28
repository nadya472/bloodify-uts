package com.nadyasapplication.app.modules.menuprofil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menuprofil.`data`.model.MenuProfilModel
import org.koin.core.KoinComponent

class MenuProfilVM : ViewModel(), KoinComponent {
  val menuProfilModel: MutableLiveData<MenuProfilModel> = MutableLiveData(MenuProfilModel())

  var navArguments: Bundle? = null
}
