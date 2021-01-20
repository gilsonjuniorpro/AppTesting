package com.apptesting.ca.util

object RegistrationUtil {

    private val existingUsers = listOf("Gilson", "Junior")

    /*
    * the input is not valid if...
    * ...the username/password/confirmedPassword is empty
    * ...the username already taken
    * ...the confirmed password is not the same as the real password
    * ...the password contais less than 3 digits
    */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
        if(userName.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }

        if(userName in existingUsers){
            return false
        }

        if(password != confirmedPassword){
            return false
        }

        if(password.count { it.isDigit() } < 3 ) {
            return false
        }

        return true
    }
}