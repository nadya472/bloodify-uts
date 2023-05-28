package com.nadyasapplication.app.modules.detailreward.ui

import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityDetailRewardBinding
import com.nadyasapplication.app.modules.detailreward.`data`.viewmodel.DetailRewardVM
import kotlin.String
import kotlin.Unit

class DetailRewardActivity :
    BaseActivity<ActivityDetailRewardBinding>(R.layout.activity_detail_reward) {
  private val viewModel: DetailRewardVM by viewModels<DetailRewardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailRewardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DETAIL_REWARD_ACTIVITY"

  }
}
