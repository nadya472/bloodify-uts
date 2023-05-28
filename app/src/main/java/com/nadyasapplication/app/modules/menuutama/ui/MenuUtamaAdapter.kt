package com.nadyasapplication.app.modules.menuutama.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadyasapplication.app.R
import com.nadyasapplication.app.databinding.RowMenuUtamaBinding
import com.nadyasapplication.app.modules.menuutama.`data`.model.MenuUtamaRowModel
import kotlin.Int
import kotlin.collections.List

class MenuUtamaAdapter(
  var list: List<MenuUtamaRowModel>
) : RecyclerView.Adapter<MenuUtamaAdapter.RowMenuUtamaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMenuUtamaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_menu_utama,parent,false)
    return RowMenuUtamaVH(view)
  }

  override fun onBindViewHolder(holder: RowMenuUtamaVH, position: Int) {
    val menuUtamaRowModel = MenuUtamaRowModel()
    // TODO uncomment following line after integration with data source
    // val menuUtamaRowModel = list[position]
    holder.binding.menuUtamaRowModel = menuUtamaRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MenuUtamaRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MenuUtamaRowModel
    ) {
    }
  }

  inner class RowMenuUtamaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMenuUtamaBinding = RowMenuUtamaBinding.bind(itemView)
  }
}
