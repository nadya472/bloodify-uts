package com.nadyasapplication.app.modules.detailjadwal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.detailjadwal.`data`.model.DetailJadwalModel
import org.koin.core.KoinComponent

class DetailJadwalVM : ViewModel(), KoinComponent {
  val detailJadwalModel: MutableLiveData<DetailJadwalModel> = MutableLiveData(DetailJadwalModel())

  var navArguments: Bundle? = null
}
