package com.nadyasapplication.app.modules.detailprofilone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.detailprofilone.`data`.model.DetailProfilOneModel
import org.koin.core.KoinComponent

class DetailProfilOneVM : ViewModel(), KoinComponent {
  val detailProfilOneModel: MutableLiveData<DetailProfilOneModel> =
      MutableLiveData(DetailProfilOneModel())

  var navArguments: Bundle? = null
}
