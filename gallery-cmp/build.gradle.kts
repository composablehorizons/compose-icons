@file:OptIn(ExperimentalKotlinGradlePluginApi::class)

import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.jetbrains.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.jetbrains.compose.compiler)
    alias(libs.plugins.jetbrains.compose.hotreload)
    alias(libs.plugins.android.application)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Gallery"
            isStatic = true
        }
    }

    jvm()

    js {
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName = "composeApp.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.composables.composeunstyled)
            implementation(projects.iconsLucideCmp)
            implementation(projects.iconsFeatherCmp)
            implementation(projects.iconsRadixCmp)
            implementation(projects.iconsCodiconsCmp)

            implementation(projects.iconsBootstrapFillCmp)
            implementation(projects.iconsBootstrapOutlineCmp)

            implementation(projects.iconsFontAwesomeBrandsCmp)
            implementation(projects.iconsFontAwesomeRegularCmp)
            implementation(projects.iconsFontAwesomeSolidCmp)

            implementation(projects.iconsTablerFilledCmp)
            implementation(projects.iconsTablerOutlineCmp)

            implementation(projects.iconsHeroiconsOutlineCmp)
            implementation(projects.iconsHeroiconsSolidCmp)
            implementation(projects.iconsHeroiconsMiniCmp)
            implementation(projects.iconsHeroiconsMicroCmp)

//            implementation(projects.iconsMaterialIconsTwotoneCmp)
//            implementation(projects.iconsMaterialIconsFilledCmp)
//            implementation(projects.iconsMaterialIconsOutlinedCmp)
//            implementation(projects.iconsMaterialIconsRoundedCmp)
//            implementation(projects.iconsMaterialIconsSharpCmp)

//            implementation(projects.iconsMaterialSymbolsOutlinedCmp)
//            implementation(projects.iconsMaterialSymbolsRoundedCmp)
//            implementation(projects.iconsMaterialSymbolsSharpCmp)
//            implementation(projects.iconsMaterialSymbolsOutlinedFilledCmp)
//            implementation(projects.iconsMaterialSymbolsRoundedFilledCmp)
//            implementation(projects.iconsMaterialSymbolsSharpFilledCmp)
        }

        androidMain.dependencies {
            implementation(libs.androidx.activity.compose)
        }

        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }
}

android {
    namespace = "com.composables.icons"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.composables.icons"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

compose.desktop {
    application {
        mainClass = "com.composables.icons.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.composables.icons"
            packageVersion = "1.0.0"
        }
    }
}
