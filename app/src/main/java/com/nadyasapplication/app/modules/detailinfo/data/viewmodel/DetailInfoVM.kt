package com.nadyasapplication.app.modules.detailinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.detailinfo.`data`.model.DetailInfoModel
import org.koin.core.KoinComponent

class DetailInfoVM : ViewModel(), KoinComponent {
  val detailInfoModel: MutableLiveData<DetailInfoModel> = MutableLiveData(DetailInfoModel())

  var navArguments: Bundle? = null
}
