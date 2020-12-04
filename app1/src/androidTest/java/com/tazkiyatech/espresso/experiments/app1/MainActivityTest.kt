package com.tazkiyatech.espresso.experiments.app1

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    private lateinit var activityScenario: ActivityScenario<MainActivity>

    @After
    fun tearDown() {
        activityScenario.close()
    }

    @Test
    fun text_after_activity_is_launched() {
        // When.
        activityScenario = launch(MainActivity::class.java)

        // Then.
        onView(withId(R.id.lifecycleEventsTextView)).check(matches(withText("onCreate,onStart,onResume")))
    }

    @Test
    fun text_after_activity_is_launched_then_moved_back_to_created_state_then_moved_forward_to_resumed_state() {
        // Given.
        activityScenario = launch(MainActivity::class.java)

        // When.
        activityScenario.moveToState(Lifecycle.State.CREATED)
        activityScenario.moveToState(Lifecycle.State.RESUMED)

        // Then.
        onView(withId(R.id.lifecycleEventsTextView)).check(matches(withText("onCreate,onStart,onResume,onPause,onStop,onStart,onResume")))
    }

    @Test
    fun text_after_activity_is_launched_then_moved_back_to_started_state_then_moved_forward_to_resumed_state() {
        // Given.
        activityScenario = launch(MainActivity::class.java)

        // When.
        activityScenario.moveToState(Lifecycle.State.STARTED)
        activityScenario.moveToState(Lifecycle.State.RESUMED)

        // Then.
        onView(withId(R.id.lifecycleEventsTextView)).check(matches(withText("onCreate,onStart,onResume,onPause,onResume")))
    }
}