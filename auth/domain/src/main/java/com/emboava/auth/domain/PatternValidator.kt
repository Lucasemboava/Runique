package com.emboava.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}
