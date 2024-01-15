package com.example.androidapplication.presentation.screens.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.androidapplication.presentation.MainViewModel.MainViewModel

@Composable
fun SearchScreen(navController: NavController, vm: MainViewModel) {
    Text(text = "Search Screen")
    BottomNavigationMenu(selectedItem = BottomNavigationItem.SEARCH, navController = navController)
}