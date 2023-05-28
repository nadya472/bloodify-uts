package com.nadyasapplication.app.modules.menuutama.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityMenuUtamaBinding
import com.nadyasapplication.app.modules.detailinfo.ui.DetailInfoDialog
import com.nadyasapplication.app.modules.kartudigital.ui.KartuDigitalActivity
import com.nadyasapplication.app.modules.menujadwalcontainer.ui.MenuJadwalContainerActivity
import com.nadyasapplication.app.modules.menureward.ui.MenuRewardActivity
import com.nadyasapplication.app.modules.menuutama.`data`.model.MenuUtamaRowModel
import com.nadyasapplication.app.modules.menuutama.`data`.viewmodel.MenuUtamaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuUtamaActivity : BaseActivity<ActivityMenuUtamaBinding>(R.layout.activity_menu_utama) {
  private val viewModel: MenuUtamaVM by viewModels<MenuUtamaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val menuUtamaAdapter = MenuUtamaAdapter(viewModel.menuUtamaList.value?:mutableListOf())
    binding.recyclerMenuUtama.adapter = menuUtamaAdapter
    menuUtamaAdapter.setOnItemClickListener(
    object : MenuUtamaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MenuUtamaRowModel) {
        onClickRecyclerMenuUtama(view, position, item)
      }
    }
    )
    viewModel.menuUtamaList.observe(this) {
      menuUtamaAdapter.updateData(it)
    }
    binding.menuUtamaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCalendar.setOnClickListener {
      val destIntent = MenuJadwalContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearKartudigital.setOnClickListener {
      val destIntent = KartuDigitalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearKartudigital1.setOnClickListener {
      val destIntent = MenuRewardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventyNine.setOnClickListener {
      val destFragment = DetailInfoDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, DetailInfoDialog.TAG)
    }
  }

  fun onClickRecyclerMenuUtama(
    view: View,
    position: Int,
    item: MenuUtamaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_UTAMA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuUtamaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
