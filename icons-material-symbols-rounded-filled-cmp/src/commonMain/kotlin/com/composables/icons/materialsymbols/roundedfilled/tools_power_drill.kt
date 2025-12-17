package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tools_power_drill: ImageVector
    get() {
        if (_Tools_power_drill != null) return _Tools_power_drill!!
        
        _Tools_power_drill = ImageVector.Builder(
            name = "tools_power_drill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(270f, 400f)
                horizontalLineToRelative(180f)
                quadToRelative(12f, 0f, 21f, -9f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                horizontalLineTo(270f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(180f)
                quadToRelative(12f, 0f, 21f, -9f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                horizontalLineTo(270f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveToRelative(410f, 140f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 280f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 360f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(480f, 620f)
                horizontalLineTo(240f)
                verticalLineToRelative(-100f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                close()
                moveTo(220f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(160f, 780f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(220f, 660f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(560f, 720f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(500f, 840f)
                horizontalLineTo(220f)
                close()
            }
        }.build()
        
        return _Tools_power_drill!!
    }

private var _Tools_power_drill: ImageVector? = null

