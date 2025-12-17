package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineTo(640f, 752f)
                lineTo(536f, 856f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 856f)
                lineTo(104f, 536f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(104f, -104f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(56f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(584f, 696f)
                lineTo(264f, 376f)
                lineTo(160f, 480f)
                lineToRelative(320f, 320f)
                lineToRelative(104f, -104f)
                close()
                moveToRelative(296f, -216f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(856f, 536f)
                lineToRelative(-74f, 74f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(74f, -74f)
                lineToRelative(-320f, -320f)
                lineToRelative(-74f, 74f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(74f, -74f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(320f, 320f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                close()
                moveToRelative(-342f, -58f)
                close()
                moveTo(424f, 536f)
                close()
                moveToRelative(-104f, 24f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 400f)
                horizontalLineToRelative(41f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-81f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 560f)
                close()
                moveToRelative(298f, -58f)
                lineToRelative(34f, -34f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-78f, -78f)
                quadToRelative(-10f, -10f, -22f, -5f)
                reflectiveQuadToRelative(-12f, 19f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(-24f)
                lineToRelative(102f, 102f)
                close()
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

