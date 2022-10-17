package com.ict.bottomnavigation.ui.pincode

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ict.bottomnavigation.R
import com.ict.bottomnavigation.data.model.PincodeData.PostOffice
import com.ict.bottomnavigation.data.model.PincodeData.Pincode
import com.ict.bottomnavigation.data.model.PincodeData.PincodeItem
import com.ict.bottomnavigation.databinding.ItemPincodeBinding

class PincodeAdapter(
    private val pincode: Pincode
): RecyclerView.Adapter<PincodeAdapter.PincodeViewHolder>() {


    class PincodeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemPincodeBinding.bind(itemView)
        //val rootItem=binding.cItemView
        fun setupUI(pincode: PincodeItem) {
            binding.postoffice.text = "Title : ${pincode.postOfficeModel}"

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PincodeAdapter.PincodeViewHolder {
        return PincodeAdapter.PincodeViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_pincode, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PincodeAdapter.PincodeViewHolder, position: Int) {
        holder.setupUI(pincode[position])

        }

    override fun getItemCount()=pincode.size

}