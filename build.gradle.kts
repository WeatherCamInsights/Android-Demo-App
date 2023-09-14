// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.ANDROID_APPLICATION) version Versions.AGP apply false
    id(Plugins.ANDROID_LIBRARY) version Versions.AGP apply false
    id(Plugins.KOTLIN_ANDROID) version Versions.KOTLIN apply false
    id(Plugins.HILT_ANDROID) version Versions.HILT_ANDROID apply false
    id("org.jetbrains.kotlin.jvm") version Versions.KOTLIN apply false
    id("org.jetbrains.dokka") version "1.8.20"
}

buildscript {
    dependencies {
        classpath(Dependencies.hiltPlugin)
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.7.10")
    }
}


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}