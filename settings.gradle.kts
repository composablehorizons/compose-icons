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
include(":icons-heroicons-cmp")
include(":icons-heroicons-outline-cmp")
include(":icons-heroicons-solid-cmp")
include(":icons-heroicons-mini-cmp")
include(":icons-heroicons-micro-cmp")
include(":icons-heroicons-outline-android")
include(":icons-heroicons-solid-android")
include(":icons-heroicons-mini-android")
include(":icons-heroicons-micro-android")

//include(":icons-material-icons-cmp")
//include(":icons-material-icons-filled-cmp")
//include(":icons-material-icons-outlined-cmp")
//include(":icons-material-icons-rounded-cmp")
//include(":icons-material-icons-sharp-cmp")
//include(":icons-material-icons-twotone-cmp")
//include(":icons-material-icons-filled-android")
//include(":icons-material-icons-outlined-android")
//include(":icons-material-icons-rounded-android")
//include(":icons-material-icons-sharp-android")
//include(":icons-material-icons-twotone-android")
//
//include(":icons-material-symbols-cmp")
//include(":icons-material-symbols-outlined-cmp")
//include(":icons-material-symbols-rounded-cmp")
//include(":icons-material-symbols-sharp-cmp")
//include(":icons-material-symbols-outlined-filled-cmp")
//include(":icons-material-symbols-rounded-filled-cmp")
//include(":icons-material-symbols-sharp-filled-cmp")
//include(":icons-material-symbols-outlined-android")
//include(":icons-material-symbols-rounded-android")
//include(":icons-material-symbols-sharp-android")
//include(":icons-material-symbols-outlined-filled-android")
//include(":icons-material-symbols-rounded-filled-android")
//include(":icons-material-symbols-sharp-filled-android")
