package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Animated_images: ImageVector
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
                moveTo(229f, 875f)
                quadToRelative(-33f, 5f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -54f)
                lineTo(86f, 368f)
                quadToRelative(-4f, -33f, 16.5f, -59f)
                reflectiveQuadToRelative(53.5f, -30f)
                lineToRelative(45f, -5f)
                verticalLineToRelative(366f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(411f)
                quadToRelative(-6f, 24f, -24f, 41.5f)
                reflectiveQuadTo(664f, 822f)
                lineTo(229f, 875f)
                close()
            }
        }.build()
        
        return _Animated_images!!
    }

private var _Animated_images: ImageVector? = null

