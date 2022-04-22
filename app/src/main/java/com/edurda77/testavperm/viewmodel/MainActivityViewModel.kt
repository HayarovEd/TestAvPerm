package com.edurda77.testavperm.viewmodel

import androidx.lifecycle.MutableLiveData
import com.edurda77.testavperm.model.data.AutoStation
import com.edurda77.testavperm.model.repository.CaseRepoImpl
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivityViewModel (private val caseRepoImpl: CaseRepoImpl):
    MainActivityViewModelContract.ViewModel() {
    override val liveData: MutableLiveData<List<AutoStation>> =
        MutableLiveData<List<AutoStation>>()



    override fun getLiveData() {
        val loadingData = caseRepoImpl.getData()
        loadingData.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(getObserver())

    }

    private fun getObserver(): DisposableObserver<List<AutoStation>> {
        return object : DisposableObserver<List<AutoStation>>() {
            override fun onNext(autoStation: List<AutoStation>) {
                liveData.postValue(autoStation)
            }

            override fun onError(error: Throwable) {
                error.message
            }

            override fun onComplete() {
            }
        }
    }
}