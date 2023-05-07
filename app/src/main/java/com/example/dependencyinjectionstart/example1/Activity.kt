package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}
