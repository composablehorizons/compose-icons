package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flashlight_off: ImageVector
    get() {
        if (_Flashlight_off != null) return _Flashlight_off!!
        
        _Flashlight_off = ImageVector.Builder(
            name = "flashlight_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-368f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(640f, 752f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                close()
                moveToRelative(27f, -600f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(291f, 177f)
                lineToRelative(-21f, -21f)
                quadToRelative(-20f, -20f, -4f, -48f)
                reflectiveQuadToRelative(54f, -28f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 200f)
                horizontalLineTo(347f)
                close()
                moveToRelative(224f, 257f)
                lineTo(445f, 331f)
                quadToRelative(-14f, -14f, -6.5f, -32.5f)
                reflectiveQuadTo(466f, 280f)
                horizontalLineToRelative(213f)
                quadToRelative(24f, 0f, 33f, 20f)
                reflectiveQuadToRelative(-5f, 40f)
                lineToRelative(-74f, 111f)
                quadToRelative(-11f, 16f, -29.5f, 18f)
                reflectiveQuadTo(571f, 457f)
                close()
            }
        }.build()
        
        return _Flashlight_off!!
    }

private var _Flashlight_off: ImageVector? = null

