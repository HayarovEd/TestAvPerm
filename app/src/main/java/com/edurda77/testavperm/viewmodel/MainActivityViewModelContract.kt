package com.edurda77.testavperm.viewmodel

import androidx.lifecycle.LiveData
import com.edurda77.testavperm.model.data.Autostation

interface MainActivityViewModelContract {
    abstract class ViewModel :androidx.lifecycle.ViewModel(){
        abstract val liveData: LiveData<List<Autostation>>
        abstract fun getLiveData()
    }
}