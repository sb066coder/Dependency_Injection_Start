package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse
//    private val daggerNewComponent = DaggerNewComponent.create()
//    val keyboard: Keyboard = daggerNewComponent.getKeyboard()
//    val monitor: Monitor = daggerNewComponent.getMonitor()
//    val mouse: Mouse = daggerNewComponent.getMouse()

    init {
        DaggerNewComponent.create().inject(this)
    }
}
