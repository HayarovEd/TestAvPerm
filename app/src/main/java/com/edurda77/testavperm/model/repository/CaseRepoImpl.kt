package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.AutoStation
import com.edurda77.testavperm.model.data.TOKEN
import io.reactivex.rxjava3.core.Observable

class CaseRepoImpl(private val api: ApiService) :CaseRepo {

    override fun getData(): Observable<List<AutoStation>> {
        return api.getAutoStation(TOKEN)
    }
}