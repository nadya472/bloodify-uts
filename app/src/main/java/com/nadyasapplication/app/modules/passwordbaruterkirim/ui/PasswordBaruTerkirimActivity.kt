package com.nadyasapplication.app.modules.passwordbaruterkirim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityPasswordBaruTerkirimBinding
import com.nadyasapplication.app.modules.halamanlogin.ui.HalamanLoginActivity
import com.nadyasapplication.app.modules.passwordbaruterkirim.`data`.viewmodel.PasswordBaruTerkirimVM
import kotlin.String
import kotlin.Unit

class PasswordBaruTerkirimActivity :
    BaseActivity<ActivityPasswordBaruTerkirimBinding>(R.layout.activity_password_baru_terkirim) {
  private val viewModel: PasswordBaruTerkirimVM by viewModels<PasswordBaruTerkirimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordBaruTerkirimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLoginkembali.setOnClickListener {
      val destIntent = HalamanLoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PASSWORD_BARU_TERKIRIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PasswordBaruTerkirimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
