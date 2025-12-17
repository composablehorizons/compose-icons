rootProject.name = "composeicons"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
    repositories {
        google()
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
}

include(":gallery-cmp")
include(":gallery-android")

include(":icons-lucide-cmp")
include(":icons-lucide-android")
include(":icons-feather-cmp")
include(":icons-feather-android")
include(":icons-radix-cmp")
include(":icons-radix-android")
include(":icons-codicons-cmp")
include(":icons-codicons-android")

include(":icons-bootstrap-fill-android")
include(":icons-bootstrap-outline-android")
include(":icons-bootstrap-cmp")
include(":icons-bootstrap-fill-cmp")
include(":icons-bootstrap-outline-cmp")
include(":icons-font-awesome-cmp")
include(":icons-font-awesome-solid-cmp")
include(":icons-font-awesome-regular-cmp")
include(":icons-font-awesome-brands-cmp")
include(":icons-font-awesome-solid-android")
include(":icons-font-awesome-regular-android")
include(":icons-font-awesome-brands-android")

include(":icons-tabler-cmp")
include(":icons-tabler-outline-cmp")
include(":icons-tabler-filled-cmp")
include(":icons-tabler-outline-android")
include(":icons-tabler-filled-android")