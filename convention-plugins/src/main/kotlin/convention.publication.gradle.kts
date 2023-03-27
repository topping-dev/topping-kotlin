import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`
import org.gradle.kotlin.dsl.signing
import java.util.*

plugins {
    `maven-publish`
    signing
}

//Maven publish
val PUBLISH_GROUP_ID = "dev.topping"
val PUBLISH_ARTIFACT_ID = "toppingkotlin"
val PUBLISH_VERSION = "0.5.0"

ext["signing.keyId"] = ""
ext["signing.password"] = ""
ext["signing.secretKeyRingFile"] = ""
ext["ossrhUsername"] = ""
ext["ossrhPassword"] = ""
ext["sonatypeStagingProfileId"] = ""

val secretPropsFile = project.rootProject.file("local.properties")
if (secretPropsFile.exists()) {
    secretPropsFile.reader().use {
        Properties().apply {
            load(it)
        }
    }.onEach { (name, value) ->
        ext[name.toString()] = value
    }
} else {
    println("No props file, loading env vars")
    ext["signing.keyId"] = System.getenv("SIGNING_KEY_ID")
    ext["signing.password"] = System.getenv("SIGNING_PASSWORD")
    ext["signing.secretKeyRingFile"] = System.getenv("SIGNING_SECRET_KEY_RING_FILE")
    ext["ossrhUsername"] = System.getenv("OSSRH_USERNAME")
    ext["ossrhPassword"] = System.getenv("OSSRH_PASSWORD")
    ext["sonatypeStagingProfileId"] = System.getenv("SONATYPE_STAGING_PROFILE_ID")
}

/*nexusStaging {
    packageGroup = PUBLISH_GROUP_ID
    stagingProfileId = sonatypeStagingProfileId
    username = ext["ossrhUsername"]?.toString()
    password = ext["ossrhPassword"]?.toString()
}*/

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

fun getExtraString(name: String) = ext[name]?.toString()

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {
        // Stub javadoc.jar artifact
        artifact(javadocJar.get())

        pom {
            name.set(PUBLISH_ARTIFACT_ID)
            description.set("ToppingEngine is a library helps you create mobile applications using one type of layout code and one type of backend code.")
            url.set("https://topping.dev")
            licenses {
                license {
                    name.set("Creative Commons, Attribution-NoDerivatives 4.0 International")
                    url.set("https://creativecommons.org/licenses/by-nd/4.0/")
                }
            }
            developers {
                developer {
                    id.set("toppingdev")
                    name.set("Topping Dev")
                    email.set("toppingdev@gmail.com")
                    organization.set("Topping Dev")
                    organizationUrl.set("https://topping.dev")
                }
            }
            scm {
                connection.set("scm:git:github.com/topping-dev/topping-android.git")
                developerConnection.set("scm:git:ssh://github.com/topping-dev/topping-android.git")
                url.set("https://github.com/topping-dev/topping-android/tree/main")
            }
        }
    }

    repositories {
        maven {
            name = "sonatype"
            setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = getExtraString("ossrhUsername")
                password = getExtraString("ossrhPassword")
            }
        }
    }
}

signing {
    sign(publishing.publications)
}
