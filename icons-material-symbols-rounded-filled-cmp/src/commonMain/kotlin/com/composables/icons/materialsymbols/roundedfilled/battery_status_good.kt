package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_status_good: ImageVector
    get() {
        if (_Battery_status_good != null) return _Battery_status_good!!
        
        _Battery_status_good = ImageVector.Builder(
            name = "battery_status_good",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(638f, 734f)
                lineToRelative(113f, -113f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(807f, 678f)
                lineTo(666f, 819f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(609f, 819f)
                lineToRelative(-56f, -57f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(29f, 28f)
                close()
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
                verticalLineToRelative(253f)
                quadToRelative(0f, 11f, -8f, 19.5f)
                reflectiveQuadToRelative(-19f, 9.5f)
                quadToRelative(-42f, 5f, -78f, 22.5f)
                reflectiveQuadTo(511f, 550f)
                quadToRelative(-32f, 32f, -51.5f, 75.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 30f, 7f, 58f)
                reflectiveQuadToRelative(21f, 54f)
                quadToRelative(8f, 17f, 0f, 32.5f)
                reflectiveQuadTo(443f, 880f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_status_good!!
    }

private var _Battery_status_good: ImageVector? = null

