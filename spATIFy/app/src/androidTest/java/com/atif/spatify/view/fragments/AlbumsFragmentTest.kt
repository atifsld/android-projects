package com.atif.spatify.view.fragments

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.atif.spatify.entity.Album
import com.atif.spatify.R
import com.atif.spatify.service.SpatifyDataGenerator
import com.atif.spatify.view.activity.MainActivity
import com.atif.spatify.view.adapter.AlbumViewAdapter
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AlbumsFragmentTest {
    @get: Rule
    val activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    val LIST_ITEM_IN_TEST = 0
    val ALBUM_IN_TEST: Album = SpatifyDataGenerator.getAlbums()[LIST_ITEM_IN_TEST]

//    @Test
//    fun test_isListFragmentVisible_onAppLaunch() {
//        onView(withId(R.id.recycler_view_albums)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun test_selectListItem_isDetailFragmentVisible() {
//        onView(withId(R.id.recycler_view_albums)).perform(actionOnItemAtPosition<AlbumViewAdapter.RecyclerViewHolder>(LIST_ITEM_IN_TEST,
//            ViewActions.click()
//        ))
//        onView(withId(R.id.album_title)).check(matches(ViewMatchers.withText(ALBUM_IN_TEST.albumName)))
//    }
//
    @Test
    fun test_backNavigation_toAlbumListFragment() {
        onView(withId(R.id.recycler_view_albums)).perform(actionOnItemAtPosition<AlbumViewAdapter.RecyclerViewHolder>(LIST_ITEM_IN_TEST,
            ViewActions.click()
        ))
        onView(withId(R.id.album_title)).check(matches(ViewMatchers.withText(ALBUM_IN_TEST.albumName)))
        pressBack()
        onView(withId(R.id.recycler_view_albums)).check(matches(isDisplayed()))
    }
//

}