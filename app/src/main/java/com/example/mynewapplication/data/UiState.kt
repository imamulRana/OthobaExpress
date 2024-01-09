package com.example.mynewapplication.data

data class UiState<T>(
    val listType: List<T> = listOf(),
    val anyType: Any
)