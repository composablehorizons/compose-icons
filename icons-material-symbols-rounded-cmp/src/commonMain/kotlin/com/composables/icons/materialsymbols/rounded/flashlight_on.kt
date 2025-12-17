package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flashlight_on: ImageVector
    get() {
        if (_Flashlight_on != null) return _Flashlight_on!!
        
        _Flashlight_on = ImageVector.Builder(
            name = "flashlight_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-360f)
                lineToRelative(-67f, -100f)
                quadToRelative(-7f, -10f, -10f, -21f)
                reflectiveQuadToRelative(-3f, -23f)
                verticalLineToRelative(-136f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 160f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 12f, -3f, 23f)
                reflectiveQuadToRelative(-10f, 21f)
                lineToRelative(-67f, 100f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                close()
                moveToRelative(160f, -180f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 560f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 500f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 560f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 620f)
                close()
                moveTo(320f, 200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(320f, 80f)
                horizontalLineTo(320f)
                verticalLineToRelative(16f)
                lineToRelative(80f, 120f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-384f)
                lineToRelative(80f, -120f)
                verticalLineToRelative(-16f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Flashlight_on!!
    }

private var _Flashlight_on: ImageVector? = null

