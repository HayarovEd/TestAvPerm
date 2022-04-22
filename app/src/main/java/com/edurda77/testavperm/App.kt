package com.edurda77.testavperm

import android.app.Application
import com.edurda77.testavperm.coin.apiModule
import com.edurda77.testavperm.coin.mainViewModelModule
import com.edurda77.testavperm.coin.netModule
import com.edurda77.testavperm.coin.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    mainViewModelModule,
                    apiModule,
                    netModule,
                    repositoryModule
                )
            )
        }
    }

}