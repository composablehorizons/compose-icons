# Compose Icons

A massive collection of icon libraries for Android and Compose Multiplatform projects in Android Vector Drawables and Compose
Image Vector format.

## Android vs Compose Multiplatform

The reason for this split is that some libraries are huge. The Material Icons library alone contains over 2,000 icons.
Multiply this by 5 styles. You already have 10,000 Kotlin files added to your build.

This can significantly affect your build setup. This is the reason why Google decided to discontinue the original
Material Icons library.

I have been personally using a library with a single style (Lucide – 1.6k icons) in my Compose Multiplatform apps for
months now. I haven't noticed any performance hits while using the JVM target on my M3 Pro Max.

Every library also comes in two variants: Android and Compose Multiplatform.

The Android variant bundles icons as Android Vector Drawables (XML) which you can access via the `R.drawable` class. The
CMP variant adds icons as Compose Image Vectors, as extension to the respective object (i.e. `Lucide.Icon`).

This is more for a preference perspective, than performance. Android Studio gives you XML previews out of the box in the
autocomplete, while the Image Vectors don't.
   

## Basic Usage

### Android

After adding the desired icon library dependency to your `build.gradle.kts`, you can use the icons in your Android app via `R`:

```kotlin
Icon(
    painterResource(R.drawable.library_ic_icon),
    contentDescription = null
)
```

Replace `library_ic_icon` with the specific drawable resource name from the library.

### Compose Multiplatform

After adding the desired icon library dependency, you can use the icons in your Compose Multiplatform app:

```kotlin
Image(Library.Icon, contentDescription = null)
```

Replace `Library` with the specific object name from the library.

## Icon Library Index

| Icon Library | Dependency | Preview |
|--------------|------------|---------|
| Bootstrap | [Link](#bootstrap) | [🔍](https://composables.com/icons/icon-libraries/bootstrap) |
| Codicons | [Link](#codicons) | [🔍](https://composables.com/icons/icon-libraries/vscode-codicons) |
| Feather | [Link](#feather) | [🔍](https://composables.com/icons/icon-libraries/feather) |
| Font Awesome | [Link](#font-awesome) | [🔍](https://composables.com/icons/icon-libraries/font-awesome) |
| Heroicons | [Link](#heroicons) | [🔍](https://composables.com/icons/icon-libraries/heroicons) |
| Lucide | [Link](#lucide) | [🔍](https://composables.com/icons/icon-libraries/lucide) |
| Material Icons | [Link](#material-icons) | [🔍](https://composables.com/icons/icon-libraries/material-icons) |
| Material Symbols | [Link](#material-symbols) | [🔍](https://composables.com/icons/icon-libraries/material-symbols) |
| Radix | [Link](#radix) | [🔍](https://composables.com/icons/icon-libraries/radix) |
| Tabler | [Link](#tabler) | [🔍](https://composables.com/icons/icon-libraries/tabler) |

## Bootstrap

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-bootstrap-fill-android:2.2.1")
    implementation("com.composables:icons-bootstrap-outline-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-bootstrap-fill-cmp:2.2.1")
    implementation("com.composables:icons-bootstrap-outline-cmp:2.2.1")
}
```

## Codicons

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-codicons-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-codicons-cmp:2.2.1")
}
```

## Feather

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-feather-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-feather-cmp:2.2.1")
}
```

## Font Awesome

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-font-awesome-solid-android:2.2.1")
    implementation("com.composables:icons-font-awesome-regular-android:2.2.1")
    implementation("com.composables:icons-font-awesome-brands-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-font-awesome-solid-cmp:2.2.1")
    implementation("com.composables:icons-font-awesome-regular-cmp:2.2.1")
    implementation("com.composables:icons-font-awesome-brands-cmp:2.2.1")
}
```

## Heroicons

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-heroicons-outline-android:2.2.1")
    implementation("com.composables:icons-heroicons-solid-android:2.2.1")
    implementation("com.composables:icons-heroicons-mini-android:2.2.1")
    implementation("com.composables:icons-heroicons-micro-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-heroicons-outline-cmp:2.2.1")
    implementation("com.composables:icons-heroicons-solid-cmp:2.2.1")
    implementation("com.composables:icons-heroicons-mini-cmp:2.2.1")
    implementation("com.composables:icons-heroicons-micro-cmp:2.2.1")
}
```

## Lucide

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-lucide-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-lucide-cmp:2.2.1")
}
```

## Material Icons

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-material-icons-filled-android:2.2.1")
    implementation("com.composables:icons-material-icons-outlined-android:2.2.1")
    implementation("com.composables:icons-material-icons-rounded-android:2.2.1")
    implementation("com.composables:icons-material-icons-sharp-android:2.2.1")
    implementation("com.composables:icons-material-icons-twotone-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-material-icons-filled-cmp:2.2.1")
    implementation("com.composables:icons-material-icons-outlined-cmp:2.2.1")
    implementation("com.composables:icons-material-icons-rounded-cmp:2.2.1")
    implementation("com.composables:icons-material-icons-sharp-cmp:2.2.1")
    implementation("com.composables:icons-material-icons-twotone-cmp:2.2.1")
}
```

## Material Symbols

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-material-symbols-outlined-android:2.2.1")
    implementation("com.composables:icons-material-symbols-rounded-android:2.2.1")
    implementation("com.composables:icons-material-symbols-sharp-android:2.2.1")
    implementation("com.composables:icons-material-symbols-outlined-filled-android:2.2.1")
    implementation("com.composables:icons-material-symbols-rounded-filled-android:2.2.1")
    implementation("com.composables:icons-material-symbols-sharp-filled-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-material-symbols-outlined-cmp:2.2.1")
    implementation("com.composables:icons-material-symbols-rounded-cmp:2.2.1")
    implementation("com.composables:icons-material-symbols-sharp-cmp:2.2.1")
    implementation("com.composables:icons-material-symbols-outlined-filled-cmp:2.2.1")
    implementation("com.composables:icons-material-symbols-rounded-filled-cmp:2.2.1")
    implementation("com.composables:icons-material-symbols-sharp-filled-cmp:2.2.1")
}
```

## Radix

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-radix-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-radix-cmp:2.2.1")
}
```

## Tabler

**Android**

```kotlin
dependencies {
    implementation("com.composables:icons-tabler-outline-android:2.2.1")
    implementation("com.composables:icons-tabler-filled-android:2.2.1")
}
```

**Compose Multiplatform**

```kotlin
dependencies {
    implementation("com.composables:icons-tabler-outline-cmp:2.2.1")
    implementation("com.composables:icons-tabler-filled-cmp:2.2.1")
}
```

## Browse over 17,000+ icons for Compose Multiplatform

Visit [Composables.com](https://composables.com/icons) to pick from over 17,000 free icons in Vector
Drawable, Image
Vector or SVG format.

## Contributing

We are currently accepting contributions in the form of bug reports and feature & icons requests, in
the form of Github
issues.
