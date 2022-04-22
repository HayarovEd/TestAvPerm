package com.edurda77.testavperm.viewmodel

import androidx.lifecycle.MutableLiveData
import com.edurda77.testavperm.model.data.Autostation
import com.edurda77.testavperm.model.repository.CaseRepoImpl
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivityViewModel :
    MainActivityViewModelContract.ViewModel() {
    override val liveData: MutableLiveData<List<Autostation>> =
        MutableLiveData<List<Autostation>>()

    private val caseRepoImpl =  CaseRepoImpl()

    override fun getLiveData() {
        val loadingData = caseRepoImpl.getData()
        loadingData.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(getObserver())

    }

    private fun getObserver(): DisposableObserver<List<Autostation>> {
        return object : DisposableObserver<List<Autostation>>() {
            override fun onNext(autostation: List<Autostation>) {
                liveData.postValue(autostation)
            }

            override fun onError(error: Throwable) {
                error.message
            }

            override fun onComplete() {
            }
        }
    }
}