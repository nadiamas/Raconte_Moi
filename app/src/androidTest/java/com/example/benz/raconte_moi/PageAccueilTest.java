package com.example.benz.raconte_moi;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by BENZ on 15/02/2017.
 */
@RunWith(AndroidJUnit4.class)
public class PageAccueilTest {
    @Rule
    public ActivityTestRule<PageAccueil> m = new ActivityTestRule<PageAccueil>(PageAccueil.class);
    @Test
    public void useAppContext() throws  Exception {
        onView(withId(R.id.bActivites)).perform(click());
        onView(withId(R.id.writingBtn)).check(matches(isDisplayed()));



    }
}
