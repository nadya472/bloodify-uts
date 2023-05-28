package com.nadyasapplication.app.modules.menureward.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityMenuRewardBinding
import com.nadyasapplication.app.modules.menujadwalcontainer.ui.MenuJadwalContainerActivity
import com.nadyasapplication.app.modules.menureward.`data`.model.List1200pxdominosRowModel
import com.nadyasapplication.app.modules.menureward.`data`.model.ListchatimeemblemOneRowModel
import com.nadyasapplication.app.modules.menureward.`data`.viewmodel.MenuRewardVM
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuRewardActivity : BaseActivity<ActivityMenuRewardBinding>(R.layout.activity_menu_reward) {
  private val viewModel: MenuRewardVM by viewModels<MenuRewardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val list1200pxdominosAdapter =
    List1200pxdominosAdapter(viewModel.list1200pxdominosList.value?:mutableListOf())
    binding.recyclerList1200pxdominos.adapter = list1200pxdominosAdapter
    list1200pxdominosAdapter.setOnItemClickListener(
    object : List1200pxdominosAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : List1200pxdominosRowModel) {
        onClickRecyclerList1200pxdominos(view, position, item)
      }
    }
    )
    viewModel.list1200pxdominosList.observe(this) {
      list1200pxdominosAdapter.updateData(it)
    }
    val listchatimeemblemOneAdapter =
    ListchatimeemblemOneAdapter(viewModel.listchatimeemblemOneList.value?:mutableListOf())
    binding.recyclerListchatimeemblemOne.adapter = listchatimeemblemOneAdapter
    listchatimeemblemOneAdapter.setOnItemClickListener(
    object : ListchatimeemblemOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListchatimeemblemOneRowModel) {
        onClickRecyclerListchatimeemblemOne(view, position, item)
      }
    }
    )
    viewModel.listchatimeemblemOneList.observe(this) {
      listchatimeemblemOneAdapter.updateData(it)
    }
    binding.menuRewardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBackOne.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCalendar.setOnClickListener {
      val destIntent = MenuJadwalContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerList1200pxdominos(
    view: View,
    position: Int,
    item: List1200pxdominosRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListchatimeemblemOne(
    view: View,
    position: Int,
    item: ListchatimeemblemOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_REWARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuRewardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
