package com.emboava.auth.data.di

import com.emboava.auth.data.EmailPatternValidator
import com.emboava.auth.domain.PatternValidator
import com.emboava.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}