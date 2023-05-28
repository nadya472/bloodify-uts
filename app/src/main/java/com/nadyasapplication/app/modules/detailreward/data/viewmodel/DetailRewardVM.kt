package com.nadyasapplication.app.modules.detailreward.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.detailreward.`data`.model.DetailRewardModel
import org.koin.core.KoinComponent

class DetailRewardVM : ViewModel(), KoinComponent {
  val detailRewardModel: MutableLiveData<DetailRewardModel> = MutableLiveData(DetailRewardModel())

  var navArguments: Bundle? = null
}
