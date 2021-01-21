package com.apptesting.ca.util

import org.junit.Test
import org.junit.jupiter.api.Assertions


class NotesTest{

    @Test
    fun `test if equals`(){
        val note1 = Notes("Gilson", 1)
        val note2 = Notes("Gilson", 2)

        Assertions.assertEquals(note1, note2)
    }
}