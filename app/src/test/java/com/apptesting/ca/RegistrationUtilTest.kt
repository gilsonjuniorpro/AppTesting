package com.apptesting.ca

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty fields returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Rafael",
            "1234",
            "1234"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `user already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Gilson",
            "1234",
            "1234"
        )
        assertThat(result).isFalse()
    }


    // empty password
    // password repeated incorrectly
    // password contains less than 3 digits

    @Test
    fun `password was repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "jair",
            "12345",
            "23456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `user or password or confirmed password are empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 3 digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "abcde5",
            "abcde5"
        )
        assertThat(result).isFalse()
    }
}