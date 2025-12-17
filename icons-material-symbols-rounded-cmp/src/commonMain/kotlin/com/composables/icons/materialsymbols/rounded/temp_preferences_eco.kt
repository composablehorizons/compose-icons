package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Temp_preferences_eco: ImageVector
    get() {
        if (_Temp_preferences_eco != null) return _Temp_preferences_eco!!
        
        _Temp_preferences_eco = ImageVector.Builder(
            name = "temp_preferences_eco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 270f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(220f, 510f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 230f)
                horizontalLineToRelative(100f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 510f)
                horizontalLineTo(220f)
                close()
                moveTo(640f, 870f)
                quadToRelative(-39f, 0f, -74.5f, -12f)
                reflectiveQuadTo(501f, 825f)
                lineToRelative(-33f, 33f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(33f, -33f)
                quadToRelative(-21f, -29f, -33f, -64.5f)
                reflectiveQuadTo(400f, 630f)
                quadToRelative(0f, -100f, 70f, -170.5f)
                reflectiveQuadTo(640f, 389f)
                horizontalLineToRelative(161f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(881f, 469f)
                verticalLineToRelative(161f)
                quadToRelative(0f, 100f, -70.5f, 170f)
                reflectiveQuadTo(640f, 870f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(67f, 0f, 113f, -47f)
                reflectiveQuadToRelative(46f, -113f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                quadToRelative(-66f, 0f, -113f, 46.5f)
                reflectiveQuadTo(480f, 630f)
                quadToRelative(0f, 23f, 5.5f, 43.5f)
                reflectiveQuadTo(502f, 712f)
                lineToRelative(110f, -110f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(558f, 768f)
                quadToRelative(18f, 11f, 38.5f, 16.5f)
                reflectiveQuadTo(640f, 790f)
                close()
                moveToRelative(1f, -161f)
                close()
            }
        }.build()
        
        return _Temp_preferences_eco!!
    }

private var _Temp_preferences_eco: ImageVector? = null

