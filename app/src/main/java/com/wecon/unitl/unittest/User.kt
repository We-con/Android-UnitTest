package com.wecon.unitl.unittest

import io.realm.RealmObject

/**
 * Created by octav on 2017-09-30.
 */
open class User(
        var name: String,
        var age: Int,
        var country: String,
        var job: String
): RealmObject()