package com.nadyasapplication.app.modules.menuberitainfo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadyasapplication.app.R
import com.nadyasapplication.app.databinding.RowListfoodoneOneBinding
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListfoodoneOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodoneOneAdapter(
  var list: List<ListfoodoneOneRowModel>
) : RecyclerView.Adapter<ListfoodoneOneAdapter.RowListfoodoneOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfoodoneOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfoodone_one,parent,false)
    return RowListfoodoneOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListfoodoneOneVH, position: Int) {
    val listfoodoneOneRowModel = ListfoodoneOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listfoodoneOneRowModel = list[position]
    holder.binding.listfoodoneOneRowModel = listfoodoneOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfoodoneOneRowModel>) {
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
      item: ListfoodoneOneRowModel
    ) {
    }
  }

  inner class RowListfoodoneOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfoodoneOneBinding = RowListfoodoneOneBinding.bind(itemView)
  }
}
