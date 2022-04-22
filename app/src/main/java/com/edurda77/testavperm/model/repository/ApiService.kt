package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.API_REQUEST
import com.edurda77.testavperm.model.data.AutoStation
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST(API_REQUEST)
    fun getAutoStation (@Header("Authorization") token:String): Observable<List<AutoStation>>
}