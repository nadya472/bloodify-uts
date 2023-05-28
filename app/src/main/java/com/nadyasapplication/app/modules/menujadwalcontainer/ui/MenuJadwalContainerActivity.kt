package com.nadyasapplication.app.modules.menujadwalcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityMenuJadwalContainerBinding
import com.nadyasapplication.app.extensions.loadFragment
import com.nadyasapplication.app.modules.menuberitainfo.ui.MenuBeritaInfoFragment
import com.nadyasapplication.app.modules.menujadwal.ui.MenuJadwalFragment
import com.nadyasapplication.app.modules.menujadwalcontainer.`data`.viewmodel.MenuJadwalContainerVM
import com.nadyasapplication.app.modules.menuprofil.ui.MenuProfilFragment
import kotlin.String
import kotlin.Unit

class MenuJadwalContainerActivity :
    BaseActivity<ActivityMenuJadwalContainerBinding>(R.layout.activity_menu_jadwal_container) {
  private val viewModel: MenuJadwalContainerVM by viewModels<MenuJadwalContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuJadwalContainerVM = viewModel
    val destFragment = MenuJadwalFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = MenuJadwalFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.imageComputer.setOnClickListener {
      val destFragment = MenuBeritaInfoFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = MenuBeritaInfoFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageCalendar.setOnClickListener {
      val destFragment = MenuJadwalFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = MenuJadwalFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageUser.setOnClickListener {
      val destFragment = MenuProfilFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = MenuProfilFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "MENU_JADWAL_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuJadwalContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
