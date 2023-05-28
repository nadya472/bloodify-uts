package com.nadyasapplication.app.modules.detailprofil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityDetailProfilBinding
import com.nadyasapplication.app.modules.detailprofil.`data`.viewmodel.DetailProfilVM
import com.nadyasapplication.app.modules.detailprofilone.ui.DetailProfilOneActivity
import kotlin.String
import kotlin.Unit

class DetailProfilActivity :
    BaseActivity<ActivityDetailProfilBinding>(R.layout.activity_detail_profil) {
  private val viewModel: DetailProfilVM by viewModels<DetailProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailProfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSimpan.setOnClickListener {
      val destIntent = DetailProfilOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PROFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailProfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
