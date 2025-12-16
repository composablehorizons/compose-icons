# Lucide icons for Jetpack Compose

Adds all Lucide icons in your `R` as Android Vector Drawables.

## Installation

```kotlin
dependencies {
    implementation("com.composables:icons-lucide-android:1.0.0")
}
```

## Basic usage

All icons are accessible via the `R` object:

```kotlin
 Image(
    painter = painterResource(id = R.drawable.lucide_lucide_ic_activity),
    contentDescription = "Activity"
)
```

## APK Size Considerations
 
> [!IMPORTANT]  
> Enable `shrinkResources` in release builds in order to keep the final APK size to a minimum.


## Browse over 17,000+ icons for Compose Multiplatform

Visit [Composables.com](https://composables.com/icons) to choose from over 17,000 icons, along with their SVGs
