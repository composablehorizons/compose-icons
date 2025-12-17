package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Animated_images: ImageVector
    get() {
        if (_Animated_images != null) return _Animated_images!!
        
        _Animated_images = ImageVector.Builder(
            name = "animated_images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(542f, 499f)
                lineToRelative(128f, -86f)
                quadToRelative(18f, -12f, 18f, -33f)
                reflectiveQuadToRelative(-18f, -33f)
                lineToRelative(-128f, -86f)
                quadToRelative(-20f, -14f, -41f, -2f)
                reflectiveQuadToRelative(-21f, 36f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 24f, 21f, 36f)
                reflectiveQuadToRelative(41f, -2f)
                close()
                moveTo(361f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(281f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(361f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(881f, 160f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(801f, 680f)
                horizontalLineTo(361f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-440f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(220f, -220f)
                close()
                moveTo(228f, 875f)
                quadToRelative(-33f, 4f, -59.5f, -16f)
                reflectiveQuadTo(138f, 806f)
                lineTo(86f, 368f)
                quadToRelative(-4f, -33f, 16.5f, -58.5f)
                reflectiveQuadTo(156f, 279f)
                horizontalLineToRelative(2f)
                quadToRelative(17f, -3f, 30.5f, 9f)
                reflectiveQuadToRelative(13.5f, 30f)
                quadToRelative(0f, 15f, -10.5f, 26f)
                reflectiveQuadTo(166f, 358f)
                horizontalLineToRelative(-1f)
                lineToRelative(54f, 438f)
                lineToRelative(474f, -58f)
                quadToRelative(17f, -2f, 30f, 8f)
                reflectiveQuadToRelative(15f, 27f)
                quadToRelative(2f, 17f, -8f, 29.5f)
                reflectiveQuadTo(703f, 817f)
                lineTo(228f, 875f)
                close()
                moveToRelative(-9f, -79f)
                close()
            }
        }.build()
        
        return _Animated_images!!
    }

private var _Animated_images: ImageVector? = null

