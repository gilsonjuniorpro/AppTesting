package com.apptesting.ca.util

data class Notes(
        val name: String,
        val id: Int
) {
    override fun equals(other: Any?): Boolean {
        if(javaClass != other?.javaClass){
            return false
        }
        val note = other as Notes
        return note.id == id && note.name == name
    }
}