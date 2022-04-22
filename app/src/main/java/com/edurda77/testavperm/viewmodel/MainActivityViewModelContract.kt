package com.edurda77.testavperm.viewmodel

import androidx.lifecycle.LiveData
import com.edurda77.testavperm.model.data.AutoStation

interface MainActivityViewModelContract {
    abstract class ViewModel :androidx.lifecycle.ViewModel(){
        abstract val liveData: LiveData<List<AutoStation>>
        abstract fun getLiveData()
    }
}