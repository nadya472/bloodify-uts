package com.nadyasapplication.app.modules.getstartedthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nadyasapplication.app.modules.getstartedthree.`data`.model.GetStartedThreeModel
import org.koin.core.KoinComponent

class GetStartedThreeVM : ViewModel(), KoinComponent {
  val getStartedThreeModel: MutableLiveData<GetStartedThreeModel> =
      MutableLiveData(GetStartedThreeModel())

  var navArguments: Bundle? = null
}
