package com.nadyasapplication.app.modules.getstartedfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.getstartedfive.`data`.model.GetStartedFiveModel
import org.koin.core.KoinComponent

class GetStartedFiveVM : ViewModel(), KoinComponent {
  val getStartedFiveModel: MutableLiveData<GetStartedFiveModel> =
      MutableLiveData(GetStartedFiveModel())

  var navArguments: Bundle? = null
}
