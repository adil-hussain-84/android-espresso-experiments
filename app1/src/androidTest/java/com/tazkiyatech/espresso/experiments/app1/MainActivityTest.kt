package com.tazkiyatech.espresso.experiments.app1

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun useAppContext() {
        // When.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext

        // Then.
        assertEquals("com.tazkiyatech.espresso.experiments.app1", appContext.packageName)
    }
}