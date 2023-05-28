package com.nadyasapplication.app.modules.menujadwalcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menujadwalcontainer.`data`.model.MenuJadwalContainerModel
import org.koin.core.KoinComponent

class MenuJadwalContainerVM : ViewModel(), KoinComponent {
  val menuJadwalContainerModel: MutableLiveData<MenuJadwalContainerModel> =
      MutableLiveData(MenuJadwalContainerModel())

  var navArguments: Bundle? = null
}
