package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.AutoStation
import io.reactivex.rxjava3.core.Observable

interface CaseRepo {
    fun getData (): Observable<List<AutoStation>>
}