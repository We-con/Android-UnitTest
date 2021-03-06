package com.wecon.unitl.unittest

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import io.realm.Realm
import org.junit.After

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class UserDaoTest {

    lateinit var realm: Realm

    @Before
    fun setUp() {
        Realm.init(InstrumentationRegistry.getTargetContext())
        realm = Realm.getDefaultInstance()
    }

    @After
    fun tearDown() {
        realm.close()
    }

    @Test
    fun useRealmInit() {

    }
}
