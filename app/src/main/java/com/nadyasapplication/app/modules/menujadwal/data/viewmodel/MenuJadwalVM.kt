package com.nadyasapplication.app.modules.menujadwal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menujadwal.`data`.model.MenuJadwalModel
import com.nadyasapplication.app.modules.menujadwal.`data`.model.SpinnerBarsearchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuJadwalVM : ViewModel(), KoinComponent {
  val menuJadwalModel: MutableLiveData<MenuJadwalModel> = MutableLiveData(MenuJadwalModel())

  var navArguments: Bundle? = null

  val spinnerBarsearchList: MutableLiveData<MutableList<SpinnerBarsearchModel>> = MutableLiveData()
}
