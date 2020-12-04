package com.tazkiyatech.espresso.experiments.app1

import android.app.Application
import android.content.res.Resources
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private val resources: Resources
        get() = ApplicationProvider.getApplicationContext<Application>().resources

    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @Test
    fun text_after_activity_is_launched() {
        // Given.
        val expected = resources.getQuantityString(R.plurals.onResume_called_xx_times, 1, 1)

        // When.
        activityScenario = launch(MainActivity::class.java)

        // Then.
        onView(withId(R.id.textView)).check(matches(withText(expected)))
    }
}