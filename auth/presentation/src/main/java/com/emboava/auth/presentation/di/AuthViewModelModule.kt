package com.emboava.auth.presentation.di


import com.emboava.auth.presentation.login.LoginViewModel
import com.emboava.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}