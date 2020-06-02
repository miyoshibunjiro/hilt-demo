package com.miyoshibunjiro.hilt.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.miyoshibunjiro.hilt.repository.github.GitHubRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.ImplicitReflectionSerializer

class HomeViewModel @ViewModelInject constructor(
    gitHubRepository: GitHubRepository,
    @Assisted private val savedState: SavedStateHandle
) : ViewModel() {

    @ImplicitReflectionSerializer
    val repositories =
        gitHubRepository.getRepositoryList(null)
            .asLiveData(Dispatchers.Default + viewModelScope.coroutineContext)
}
