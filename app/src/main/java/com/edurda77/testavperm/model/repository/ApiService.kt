package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.API_REQUEST
import com.edurda77.testavperm.model.data.Autostation
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET(API_REQUEST)
    fun getAutoStation (@Header("Authorization") token:String): Observable<List<Autostation>>
}