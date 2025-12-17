package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ventilator: ImageVector
    get() {
        if (_Ventilator != null) return _Ventilator!!
        
        _Ventilator = ImageVector.Builder(
            name = "ventilator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-76f, 0f, -144f, -24f)
                reflectiveQuadToRelative(-125f, -67f)
                quadToRelative(-11f, 5f, -24f, 8f)
                reflectiveQuadToRelative(-27f, 3f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -23f, 8f, -43f)
                reflectiveQuadToRelative(22f, -36f)
                quadToRelative(-11f, -28f, -18f, -57f)
                reflectiveQuadToRelative(-10f, -60f)
                lineToRelative(80f, -8f)
                quadToRelative(2f, 23f, 6.5f, 44f)
                reflectiveQuadToRelative(12.5f, 41f)
                quadToRelative(5f, -1f, 9.5f, -1f)
                horizontalLineToRelative(9.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 14f, -3f, 26.5f)
                reflectiveQuadToRelative(-8f, 24.5f)
                quadToRelative(37f, 27f, 80f, 44.5f)
                reflectiveQuadToRelative(91f, 22.5f)
                verticalLineToRelative(-198f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(198f)
                quadToRelative(87f, -10f, 158f, -57f)
                reflectiveQuadToRelative(113f, -120f)
                lineToRelative(-49f, -25f)
                lineToRelative(36f, -71f)
                lineToRelative(46f, 23f)
                quadToRelative(5f, -17f, 8.5f, -35f)
                reflectiveQuadToRelative(5.5f, -37f)
                lineToRelative(80f, 8f)
                quadToRelative(-2f, 26f, -8f, 51f)
                reflectiveQuadToRelative(-14f, 49f)
                lineToRelative(42f, 21f)
                lineToRelative(-36f, 71f)
                lineToRelative(-38f, -19f)
                quadToRelative(-57f, 101f, -159f, 162f)
                reflectiveQuadToRelative(-225f, 61f)
                close()
            }
        }.build()
        
        return _Ventilator!!
    }

private var _Ventilator: ImageVector? = null

