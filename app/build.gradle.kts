plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.HILT_ANDROID)
    id(Plugins.KAPT)
    id("com.google.relay") version "0.3.02"
}

android {
    namespace = "com.nyang.weathercaminsights"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.nyang.weathercaminsights"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_UI
    }
    packagingOptions {
        packagingOptions {
            resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.lifecycleRuntimeCompose)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeUIToolingPreview)
    implementation("androidx.compose.ui:ui-tooling:1.1.1")
    implementation(Dependencies.material)
    implementation(Dependencies.composeMaterialWindowSize)
    implementation(Dependencies.composeNavigation)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.media3:media3-exoplayer:1.1.0")
    testImplementation(Testing.composeUiTooling)
    testImplementation(Testing.composeUiTestJunit)
    testImplementation(Testing.composeUiTestManifest)
    testImplementation(Testing.junit)
    testImplementation(Testing.testExtJunit)
    testImplementation(Testing.espressoCore)
    implementation(Dependencies.gson)
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
    implementation(Dependencies.hiltNavigationCompose)
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.compose.animation:animation:1.3.3")
    implementation("androidx.compose.material:material-icons-extended:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    implementation("com.naver.maps:map-sdk:3.17.0")

    // Accompanist
    implementation("com.google.accompanist:accompanist-permissions:0.23.1")
    implementation("com.google.android.exoplayer:exoplayer:2.18.1")

    //implementation(project(mapOf("path" to ":rsp-module:data")))
    // jetpack compose drawblepainter
    implementation(Dependencies.accompanist_drawablepainter)
    implementation(Dependencies.splashScreen)
    implementation("com.google.accompanist:accompanist-drawablepainter:0.28.0")
    implementation("androidx.core:core-splashscreen:1.0.0-alpha01")
    implementation("androidx.compose.material:material-icons-extended:1.2.0")

    implementation(Dependencies.gson)
    implementation(Dependencies.retrofit2)
    implementation(Dependencies.convertGson)
}