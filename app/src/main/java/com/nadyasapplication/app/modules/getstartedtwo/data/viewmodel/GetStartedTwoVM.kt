package com.nadyasapplication.app.modules.getstartedtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.getstartedtwo.`data`.model.GetStartedTwoModel
import org.koin.core.KoinComponent

class GetStartedTwoVM : ViewModel(), KoinComponent {
  val getStartedTwoModel: MutableLiveData<GetStartedTwoModel> =
      MutableLiveData(GetStartedTwoModel())

  var navArguments: Bundle? = null
}
