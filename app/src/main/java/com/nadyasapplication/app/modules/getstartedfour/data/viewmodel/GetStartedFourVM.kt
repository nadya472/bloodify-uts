package com.nadyasapplication.app.modules.getstartedfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.getstartedfour.`data`.model.GetStartedFourModel
import org.koin.core.KoinComponent

class GetStartedFourVM : ViewModel(), KoinComponent {
  val getStartedFourModel: MutableLiveData<GetStartedFourModel> =
      MutableLiveData(GetStartedFourModel())

  var navArguments: Bundle? = null
}
