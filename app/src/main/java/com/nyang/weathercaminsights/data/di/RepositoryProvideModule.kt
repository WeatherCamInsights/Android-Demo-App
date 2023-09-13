package com.nyang.weathercaminsights.data.di

import com.nyang.weathercaminsights.data.repository.GetInfoCCTVRepositoryImpl
import com.nyang.weathercaminsights.domain.repository.GetInfoCCTVRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryProvideModule {
    @Provides
    fun bindGetInfoCCTVRepository(
    ): GetInfoCCTVRepository {
        return GetInfoCCTVRepositoryImpl()
    }
}