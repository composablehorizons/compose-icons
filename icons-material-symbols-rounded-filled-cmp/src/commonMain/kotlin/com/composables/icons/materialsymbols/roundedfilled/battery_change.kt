package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_change: ImageVector
    get() {
        if (_Battery_change != null) return _Battery_change!!
        
        _Battery_change = ImageVector.Builder(
            name = "battery_change",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -291f)
                quadToRelative(0f, 23f, 8.5f, 43.5f)
                reflectiveQuadTo(433f, 669f)
                lineToRelative(9f, 9f)
                quadToRelative(11f, 11f, 27.5f, 11f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(498f, 621f)
                lineToRelative(-9f, -9f)
                quadToRelative(-5f, -5f, -7f, -10.5f)
                reflectiveQuadToRelative(-2f, -11.5f)
                quadToRelative(0f, -7f, 2f, -12.5f)
                reflectiveQuadToRelative(7f, -10.5f)
                lineToRelative(38f, -38f)
                quadToRelative(16f, -16f, 24.5f, -36f)
                reflectiveQuadToRelative(8.5f, -42f)
                quadToRelative(0f, -23f, -8.5f, -43.5f)
                reflectiveQuadTo(527f, 371f)
                lineToRelative(-10f, -10f)
                quadToRelative(-12f, -12f, -28f, -11.5f)
                reflectiveQuadTo(461f, 362f)
                quadToRelative(-11f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(9f, 9f)
                quadToRelative(5f, 5f, 7.5f, 10.5f)
                reflectiveQuadTo(480f, 450f)
                quadToRelative(0f, 6f, -2.5f, 11.5f)
                reflectiveQuadTo(470f, 472f)
                lineToRelative(-37f, 38f)
                quadToRelative(-16f, 16f, -24.5f, 36f)
                reflectiveQuadToRelative(-8.5f, 43f)
                close()
            }
        }.build()
        
        return _Battery_change!!
    }

private var _Battery_change: ImageVector? = null

