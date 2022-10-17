package com.ict.bottomnavigation.ui.pincode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ict.bottomnavigation.data.model.PincodeData.Pincode
import com.ict.bottomnavigation.databinding.FragmentPincodeBinding

class PincodeFragment : Fragment() {

    private lateinit var _binding: FragmentPincodeBinding
    private val viewModel by activityViewModels<PincodeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPincodeBinding.inflate(inflater)
        // observe the changes in viewmodel liveData
        viewModel.pincode.observe(viewLifecycleOwner) {
            setupUI(it)
        }
        viewModel.getPincode()
        return _binding.root
    }

    private fun setupUI(pincodeList: Pincode) {
        _binding.pincodeList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PincodeAdapter(
                pincodeList
            )
        }
    }
}