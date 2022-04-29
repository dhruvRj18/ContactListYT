package com.example.contactlistyt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlistyt.databinding.ItemContactBinding

class RCVAdapter(
    val contactList: ArrayList<ContactModel>
) : RecyclerView.Adapter<RCVAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nameTV = binding.nameTV
        val numberTV = binding.numberTV
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemContactBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = contactList[position]
        holder.binding.nameTV.text = item.displayName
        holder.binding.numberTV.text = item.number
    }

    override fun getItemCount(): Int = contactList.size
}
