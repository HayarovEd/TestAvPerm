package com.edurda77.testavperm.model.repository

import com.edurda77.testavperm.model.data.Autostation
import io.reactivex.rxjava3.core.Observable

interface CaseRepo {
    fun getData (): Observable<List<Autostation>>
}