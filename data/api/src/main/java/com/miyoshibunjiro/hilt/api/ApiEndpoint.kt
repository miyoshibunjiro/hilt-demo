package com.miyoshibunjiro.hilt.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class ApiEndpoint

@Module
@InstallIn(ApplicationComponent::class)
object ApiEndPointModule {

    @Provides
    @ApiEndpoint
    fun provideApiEndpoint(): String = BuildConfig.API_ENDPOINT

}
