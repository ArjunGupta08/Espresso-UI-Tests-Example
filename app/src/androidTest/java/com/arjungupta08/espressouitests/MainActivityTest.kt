package com.arjungupta08.espressouitests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get : Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testSubmitButton_expectedCorrectValues() {
        onView(withId(R.id.title)).perform(typeText("Hello"))
        onView(withId(R.id.desc)).perform(typeText("This is Description"), closeSoftKeyboard())

        onView(withId(R.id.next)).perform(click())
        onView(withId(R.id.text)).check(matches(withText("Hello : This is Description")))
    }

}