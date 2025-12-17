plugins {
    alias(libs.plugins.android.library)
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.maven.publish)
}

android {
    namespace = "com.composables.icons.materialicons.sharp"
    compileSdk = 36
    defaultConfig {
        minSdk = libs.versions.android.minSDK.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.foundation)
}

val publishGroupId = "com.composables"
val publishArtifactId = "icons-material-icons-sharp-android"
val publishVersion = libs.versions.icons.get()
val githubUrl = "github.com/composablehorizons/composeicons"

group = publishGroupId
version = publishVersion

val projectUrl = "https://github.com/composablehorizons/composeicons"

mavenPublishing {
    publishToMavenCentral(automaticRelease = true, validateDeployment = false)
    if (project.hasProperty("SIGNING_KEY_ID")) {
        signAllPublications()
    }
    coordinates(publishGroupId, publishArtifactId, publishVersion)

    pom {
        name.set("Compose Icons Material Icons Sharp Android")
        description.set("Compose Icons Material Icons Sharp for Android.")
        url.set(projectUrl)

        licenses {
            license {
                name.set("MIT License")
                url.set("https://${githubUrl}/blob/main/LICENSE")
            }
        }

        issueManagement {
            system.set("GitHub Issues")
            url.set("https://${githubUrl}/issues")
        }

        developers {
            developer {
                id.set("composablehorizons")
                name.set("Composable Horizons")
                email.set("support@composables.com")
            }
        }

        scm {
            connection.set("scm:git:${githubUrl}.git")
            developerConnection.set("scm:git:ssh://${githubUrl}.git")
            url.set("https://${githubUrl}/tree/main")
        }
    }
}
