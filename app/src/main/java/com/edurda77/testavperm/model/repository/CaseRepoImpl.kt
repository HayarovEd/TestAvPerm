package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.Autostation
import com.edurda77.testavperm.model.data.BASE_URL
import com.edurda77.testavperm.model.data.TOKEN
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import io.reactivex.rxjava3.core.Observable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CaseRepoImpl :CaseRepo {
    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()
    private var api = retrofit.create(ApiService::class.java)
    override fun getData(): Observable<List<Autostation>> {
        return api.getAutoStation(TOKEN)
    }
}