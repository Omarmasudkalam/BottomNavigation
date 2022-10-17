package com.ict.bottomnavigation.ui.pincode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ict.bottomnavigation.data.ApiSource
import com.ict.bottomnavigation.data.model.PincodeData.Pincode
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PincodeViewModel @Inject constructor(

    private val repository: ApiSource
): ViewModel() {

    private val _pincode = MutableLiveData<Pincode>()
    val pincode: LiveData<Pincode> = _pincode
    // API call to fetch the data


    fun getPincode() {
        CoroutineScope(Dispatchers.Main).launch {
            val pincodeList = repository.getPincode()
            // verify if the response was successful
            if (pincodeList.isSuccessful) {
                _pincode.postValue(pincodeList.body())
            } else {
                _pincode.postValue(Pincode())
            }
        }
    }

}