plugins {
    `kotlin-dsl`
    id("io.codearte.nexus-staging").version("0.21.0").apply(true)
}

repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
    mavenLocal()
}