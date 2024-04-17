//package com.example.rickandmorty.ui.location
//
//import androidx.hilt.lifecycle.ViewModelInject
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.rickandmorty.data.repository.CharacterRepository
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.withContext
//
//class LocationViewModel @ViewModelInject constructor(
//    private val repository: CharacterRepository
//) : ViewModel() {
//
//    val location = repository.getCharacters()
//}