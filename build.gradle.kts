import korlibs.korge.gradle.*

plugins {
    //alias(libs.plugins.korge)
    //id("com.soywiz.korge") version "999.0.0.999"
    //id("com.soywiz.korge") version "4.0.0-alpha-6"
    id("com.soywiz.korge") version "4.0.7"
}

korge {
    id = "org.korge.samples.mymodule"

// To enable all targets at once

    //targetAll()

// To enable targets based on properties/environment variables
    //targetDefault()

// To selectively enable targets

    targetJvm()
    targetJs()
    targetDesktop()
    //targetDesktopCross()
    targetIos()
    targetAndroid()
    //targetAndroidDirect()
    serializationJson()
}

dependencies {
    add("commonMainApi", project(":deps"))
}
