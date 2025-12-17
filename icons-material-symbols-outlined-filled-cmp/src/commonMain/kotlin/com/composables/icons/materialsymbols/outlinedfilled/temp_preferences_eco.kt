package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Temp_preferences_eco: ImageVector
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
                reflectiveQuadTo(640f, 390f)
                horizontalLineToRelative(239f)
                verticalLineToRelative(240f)
                quadToRelative(2f, 100f, -68.5f, 170f)
                reflectiveQuadTo(640f, 870f)
                close()
                moveTo(532f, 738f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(80f, -80f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-80f, 80f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                close()
                moveTo(220f, 510f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(140f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(140f)
                horizontalLineTo(220f)
                close()
                moveToRelative(220f, -240f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Temp_preferences_eco!!
    }

private var _Temp_preferences_eco: ImageVector? = null

