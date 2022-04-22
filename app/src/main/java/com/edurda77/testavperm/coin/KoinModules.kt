package com.edurda77.testavperm.coin

import com.edurda77.testavperm.model.data.BASE_URL
import com.edurda77.testavperm.model.repository.ApiService
import com.edurda77.testavperm.model.repository.CaseRepoImpl
import com.edurda77.testavperm.viewmodel.MainActivityViewModel
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val mainViewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
}

val apiModule = module {
    fun provideUserApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
    single { provideUserApi(get()) }
}
val netModule = module {
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
    single { provideRetrofit() }

}
val repositoryModule = module {
    fun provideUserRepository(api: ApiService): CaseRepoImpl {
        return CaseRepoImpl(api)
    }
    single { provideUserRepository(api=get()) }
}
