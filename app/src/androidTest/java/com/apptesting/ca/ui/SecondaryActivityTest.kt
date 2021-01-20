package com.apptesting.ca.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.apptesting.ca.R
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    lateinit var activityScenario: ActivityScenario<SecondaryActivity>

    @Before
    fun setup() {
        activityScenario = ActivityScenario.launch(SecondaryActivity::class.java)
    }


    @Test
    fun test_visibility_title_backButton() {
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))

        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }

}