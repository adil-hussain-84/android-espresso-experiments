# ActivityScenario.moveToState examples

This Android application module demonstrates how the [ActivityScenario.moveToState(newState:)](https://developer.android.com/reference/androidx/test/core/app/ActivityScenario#movetostate) method offered by Espresso can be used in UI tests to drive an activity forwards or backwards to particular lifecycle states.

The application consists of a single activity named [MainActivity](src/main/java/com/tazkiyatech/espresso/experiments/app1/MainActivity.kt) which contains a single [TextView](https://developer.android.com/reference/android/widget/TextView) and accumulates the name of each of the activity's lifecycle methods that are called during its lifetime inside of this [TextView](https://developer.android.com/reference/android/widget/TextView).

The [MainActivityTest](src/androidTest/java/com/tazkiyatech/espresso/experiments/app1/MainActivityTest.kt) class uses this [MainActivity](src/main/java/com/tazkiyatech/espresso/experiments/app1/MainActivity.kt) class and the [TextView](https://developer.android.com/reference/android/widget/TextView) which it contains to demonstrate and confirm the behaviour of the [ActivityScenario.moveToState(newState:)](https://developer.android.com/reference/androidx/test/core/app/ActivityScenario#movetostate) method.
