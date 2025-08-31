plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.services)

    alias(libs.plugins.hilt.android)
    alias(libs.plugins.ksp)

    //id("com.google.devtools.ksp") version "2.0.21-1.0.27"

   // alias(libs.plugins.kotlin.kap)
   // alias(libs.plugins.dagger) apply false
   // id("com.google.devtools.ksp") version "2.0.21-1.0.25"
}

android {
    namespace = "com.eparedez.firebasealltools"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.eparedez.firebasealltools"
        minSdk = 35
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    // implementation(libs.hilt.android)
    // kapt(libs.hilt.compiler)
    // kapt("androidx.hilt:hilt-compiler:1.0.0")
   // ksp("com.squareup:javapoet:1.13.0")
   // ksp(libs.hilt.compiler)

    // ksp(libs.hilt.compiler)


    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth)
    implementation(libs.play.services.auth)
    implementation(libs.facebook.login)
    implementation(libs.constraintlayout)
    implementation(libs.material3.xml)
    implementation(libs.pinview)
    implementation(libs.appcompat)


}