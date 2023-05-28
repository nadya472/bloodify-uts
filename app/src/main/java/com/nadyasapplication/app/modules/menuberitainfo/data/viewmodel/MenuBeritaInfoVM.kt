package com.nadyasapplication.app.modules.menuberitainfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListbrucemarsgjtdRowModel
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListfoodoneOneRowModel
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.MenuBeritaInfoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuBeritaInfoVM : ViewModel(), KoinComponent {
  val menuBeritaInfoModel: MutableLiveData<MenuBeritaInfoModel> =
      MutableLiveData(MenuBeritaInfoModel())

  var navArguments: Bundle? = null

  val listbrucemarsgjtdList: MutableLiveData<MutableList<ListbrucemarsgjtdRowModel>> =
      MutableLiveData(mutableListOf())

  val listfoodoneOneList: MutableLiveData<MutableList<ListfoodoneOneRowModel>> =
      MutableLiveData(mutableListOf())
}
