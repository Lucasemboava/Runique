package com.emboava.auth.domain

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class UserDataValidatorTest {

    // In order to prepare for writing test cases we need to first create a reference of what we want to test
    // Which we call the subject under test
    private lateinit var userDataValidator: UserDataValidator


    // We also want a setup function. Every single test case should run with the same setup.
    // We want to avoid reusing the same instance across multiple tests.
    // So before each test we make we want to reinitialize all the instances that we are using in the test.
    @BeforeEach
    fun setUp() {
        userDataValidator = UserDataValidator(
            patternValidator = object : PatternValidator {
                override fun matches(value: String): Boolean {
                    return true
                }
            }
        )
    }

    @ParameterizedTest
    @CsvSource(
        "Test12345, true",
        "test12345, false",
        "12345, false",
        "Test-1234, true",
        "TEST12345, false",
    )
    fun testValidatePassword(password: String, expectedIsValid: Boolean) {
        val state = userDataValidator.validatePassword(password)

        assertThat(state.isValidPassword).isEqualTo(expectedIsValid)
    }
}
