package com.apptesting.ca

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown(){

    }

    @Test
    fun stringResourceSameAsGivenStringReturnsTrue(){
        //resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "AppTesting")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenStringReturnsFalse(){
        //resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "AAAppTesting")

        assertThat(result).isFalse()
    }

}