package com.nadyasapplication.app.modules.detailjadwal.ui

import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityDetailJadwalBinding
import com.nadyasapplication.app.modules.detailjadwal.`data`.viewmodel.DetailJadwalVM
import com.nadyasapplication.app.modules.menujadwalcontainer.ui.MenuJadwalContainerActivity
import kotlin.String
import kotlin.Unit

class DetailJadwalActivity :
    BaseActivity<ActivityDetailJadwalBinding>(R.layout.activity_detail_jadwal) {
  private val viewModel: DetailJadwalVM by viewModels<DetailJadwalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailJadwalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBackOne.setOnClickListener {
      val destIntent = MenuJadwalContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAIL_JADWAL_ACTIVITY"

  }
}
