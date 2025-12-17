package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Water_heater: ImageVector
    get() {
        if (_Water_heater != null) return _Water_heater!!
        
        _Water_heater = ImageVector.Builder(
            name = "water_heater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(311f, 426f)
                quadToRelative(0f, 45f, 22f, 82f)
                reflectiveQuadToRelative(57f, 60f)
                quadToRelative(-10f, -14f, -15.5f, -30f)
                reflectiveQuadToRelative(-5.5f, -34f)
                quadToRelative(0f, -23f, 8.5f, -43f)
                reflectiveQuadToRelative(24.5f, -35f)
                lineToRelative(78f, -77f)
                lineToRelative(79f, 77f)
                quadToRelative(16f, 15f, 24f, 35f)
                reflectiveQuadToRelative(8f, 43f)
                quadToRelative(0f, 18f, -5.5f, 34f)
                reflectiveQuadTo(570f, 568f)
                quadToRelative(35f, -23f, 57f, -60f)
                reflectiveQuadToRelative(22f, -82f)
                quadToRelative(0f, -47f, -25f, -88f)
                reflectiveQuadToRelative(-67f, -64f)
                lineToRelative(-13f, 17f)
                quadToRelative(-5f, 5f, -11f, 8.5f)
                reflectiveQuadToRelative(-13f, 3.5f)
                quadToRelative(-13f, 0f, -22f, -9f)
                reflectiveQuadToRelative(-9f, -22f)
                verticalLineToRelative(-80f)
                lineToRelative(-28f, 16f)
                quadToRelative(-28f, 16f, -61f, 46.5f)
                reflectiveQuadToRelative(-61f, 74f)
                quadTo(311f, 372f, 311f, 426f)
                close()
                moveToRelative(169f, 7f)
                lineToRelative(-37f, 36f)
                quadToRelative(-8f, 8f, -11f, 16.5f)
                reflectiveQuadToRelative(-3f, 18.5f)
                quadToRelative(0f, 21f, 15f, 35.5f)
                reflectiveQuadToRelative(36f, 14.5f)
                quadToRelative(21f, 0f, 36f, -14.5f)
                reflectiveQuadToRelative(15f, -35.5f)
                quadToRelative(0f, -11f, -3f, -19f)
                reflectiveQuadToRelative(-11f, -16f)
                lineToRelative(-37f, -36f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(320f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(120f, -200f)
                quadToRelative(33f, 0f, 49.5f, -20f)
                reflectiveQuadToRelative(70.5f, -20f)
                quadToRelative(54f, 0f, 72f, 20f)
                reflectiveQuadToRelative(48f, 20f)
                quadToRelative(30f, 0f, 48f, -20f)
                reflectiveQuadToRelative(72f, -20f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 240f)
                verticalLineToRelative(400f)
                quadToRelative(54f, 0f, 70.5f, 20f)
                reflectiveQuadToRelative(49.5f, 20f)
                close()
            }
        }.build()
        
        return _Water_heater!!
    }

private var _Water_heater: ImageVector? = null

