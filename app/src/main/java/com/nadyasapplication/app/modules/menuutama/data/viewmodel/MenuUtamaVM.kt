package com.nadyasapplication.app.modules.menuutama.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menuutama.`data`.model.MenuUtamaModel
import com.nadyasapplication.app.modules.menuutama.`data`.model.MenuUtamaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuUtamaVM : ViewModel(), KoinComponent {
  val menuUtamaModel: MutableLiveData<MenuUtamaModel> = MutableLiveData(MenuUtamaModel())

  var navArguments: Bundle? = null

  val menuUtamaList: MutableLiveData<MutableList<MenuUtamaRowModel>> =
      MutableLiveData(mutableListOf())
}
