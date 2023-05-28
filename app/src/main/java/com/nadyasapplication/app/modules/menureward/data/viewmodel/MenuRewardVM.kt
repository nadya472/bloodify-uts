package com.nadyasapplication.app.modules.menureward.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.menureward.`data`.model.List1200pxdominosRowModel
import com.nadyasapplication.app.modules.menureward.`data`.model.ListchatimeemblemOneRowModel
import com.nadyasapplication.app.modules.menureward.`data`.model.MenuRewardModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuRewardVM : ViewModel(), KoinComponent {
  val menuRewardModel: MutableLiveData<MenuRewardModel> = MutableLiveData(MenuRewardModel())

  var navArguments: Bundle? = null

  val list1200pxdominosList: MutableLiveData<MutableList<List1200pxdominosRowModel>> =
      MutableLiveData(mutableListOf())

  val listchatimeemblemOneList: MutableLiveData<MutableList<ListchatimeemblemOneRowModel>> =
      MutableLiveData(mutableListOf())
}
