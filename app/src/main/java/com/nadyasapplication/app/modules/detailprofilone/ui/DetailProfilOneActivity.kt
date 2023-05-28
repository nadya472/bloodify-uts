package com.nadyasapplication.app.modules.detailprofilone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityDetailProfilOneBinding
import com.nadyasapplication.app.modules.detailprofil.ui.DetailProfilActivity
import com.nadyasapplication.app.modules.detailprofilone.`data`.viewmodel.DetailProfilOneVM
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class DetailProfilOneActivity :
    BaseActivity<ActivityDetailProfilOneBinding>(R.layout.activity_detail_profil_one) {
  private val viewModel: DetailProfilOneVM by viewModels<DetailProfilOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailProfilOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtYa.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTidak.setOnClickListener {
      val destIntent = DetailProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PROFIL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailProfilOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
