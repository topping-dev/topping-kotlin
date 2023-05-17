import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("native.cocoapods")
    id("maven-publish")
    id("convention.publication")
    id("org.jetbrains.dokka")
}

group = "dev.topping"
version = "0.5.1"

kotlin {
    android {
        publishLibraryVariants("release")
    }
    
    val xcf = XCFramework()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "toppingkotlin"
            embedBitcode = org.jetbrains.kotlin.gradle.plugin.mpp.Framework.BitcodeEmbeddingMode.DISABLE
            xcf.add(this)
        }
    }

    cocoapods {
        version = "1.11.0"
        /*specRepos {
            url("https://github.com/Deadknight/dk-specs.git")
        }*/
        pod("Topping", "0.5.1")
        framework {
            // ---> HERE: If true (or omitted) linking fails, missing symbols are from "Topping" dependency
            // if false, then linking succeeds as per Kotlin 1.7 behaviour
            isStatic = false
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("reflect"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation ("androidx.appcompat:appcompat:1.3.0")
                implementation ("androidx.recyclerview:recyclerview:1.2.1")
                implementation ("androidx.fragment:fragment:1.3.5")
                implementation ("androidx.fragment:fragment-ktx:1.3.5")
                implementation ("androidx.lifecycle:lifecycle-common-java8:2.3.1")
                implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
                implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")
                implementation ("androidx.navigation:navigation-dynamic-features-fragment:2.3.5")
                implementation ("com.google.android.material:material:1.4.0")
                implementation("dev.topping:toppingandroid:0.5.1")
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        iosSimulatorArm64Main.dependsOn(iosArm64Main)
        iosX64Main.dependsOn(iosArm64Main)
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "dev.topping.kotlin"
    compileSdk = 31
    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }
}

ext["version"] = version.toString()
