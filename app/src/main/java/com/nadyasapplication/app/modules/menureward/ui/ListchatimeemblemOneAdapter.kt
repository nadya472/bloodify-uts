package com.nadyasapplication.app.modules.menureward.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadyasapplication.app.R
import com.nadyasapplication.app.databinding.RowListchatimeemblemOneBinding
import com.nadyasapplication.app.modules.menureward.`data`.model.ListchatimeemblemOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListchatimeemblemOneAdapter(
  var list: List<ListchatimeemblemOneRowModel>
) : RecyclerView.Adapter<ListchatimeemblemOneAdapter.RowListchatimeemblemOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListchatimeemblemOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listchatimeemblem_one,parent,false)
    return RowListchatimeemblemOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListchatimeemblemOneVH, position: Int) {
    val listchatimeemblemOneRowModel = ListchatimeemblemOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listchatimeemblemOneRowModel = list[position]
    holder.binding.listchatimeemblemOneRowModel = listchatimeemblemOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListchatimeemblemOneRowModel>) {
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
      item: ListchatimeemblemOneRowModel
    ) {
    }
  }

  inner class RowListchatimeemblemOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListchatimeemblemOneBinding = RowListchatimeemblemOneBinding.bind(itemView)
  }
}
