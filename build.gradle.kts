plugins {
    id("com.android.application") version "8.1.0" apply false
    kotlin("android") version "1.8.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath(kotlin("gradle-plugin", version = "1.8.0"))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
