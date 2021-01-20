package com.apptesting.ca

import com.apptesting.ca.util.Homework
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `check fib`(){
        val result = Homework.fib(9)

        var res = result == 34L
        assertThat(res).isTrue()
    }
}