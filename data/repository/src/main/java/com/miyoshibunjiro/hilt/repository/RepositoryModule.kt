package com.miyoshibunjiro.hilt.repository

import com.miyoshibunjiro.hilt.api.github.GitHubApi
import com.miyoshibunjiro.hilt.repository.github.GitHubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideGitHubRepository(gitHubApi: GitHubApi) = GitHubRepository(gitHubApi)
}
