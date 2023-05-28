package com.nadyasapplication.app.modules.tipegoldar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityTipeGoldarBinding
import com.nadyasapplication.app.modules.halamanregistrasi.ui.HalamanRegistrasiActivity
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import com.nadyasapplication.app.modules.tipegoldar.`data`.viewmodel.TipeGoldarVM
import kotlin.String
import kotlin.Unit

class TipeGoldarActivity : BaseActivity<ActivityTipeGoldarBinding>(R.layout.activity_tipe_goldar) {
  private val viewModel: TipeGoldarVM by viewModels<TipeGoldarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tipeGoldarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBackOne.setOnClickListener {
      val destIntent = HalamanRegistrasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLanjut.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TIPE_GOLDAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TipeGoldarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
