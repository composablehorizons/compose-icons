@file:Suppress("UnstableApiUsage")
@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl


plugins {
    alias(libs.plugins.compose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
}

val publishGroupId = "com.composables"
val publishArtifactId = "icons-heroicons-mini-cmp"
val publishVersion = libs.versions.icons.get()
val githubUrl = "github.com/composablehorizons/composeicons"

java {
    toolchain {
        vendor = JvmVendorSpec.JETBRAINS
        languageVersion = JavaLanguageVersion.of(17)
    }
}

kotlin {
    jvmToolchain {
        vendor = JvmVendorSpec.JETBRAINS
        languageVersion = JavaLanguageVersion.of(17)
    }

    androidTarget {
        publishLibraryVariants("release", "debug")
    }

    jvm()

    wasmJs {
        browser()
    }

    js(IR) {
        browser()
    }

    listOf(iosX64(), iosArm64(), iosSimulatorArm64()).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposablesHeroicons mini"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.foundation)
                api(project(":icons-heroicons-cmp"))
            }
        }
    }
}

android {
    namespace = "com.composables.icons.heroicons.mini"
    compileSdk = libs.versions.android.compileSDK.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSDK.get().toInt()
    }
}

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
        name.set("Compose Icons Heroicons mini")
        description.set("Compose Icons Heroicons mini for Compose Multiplatform.")
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
