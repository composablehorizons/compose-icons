package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Connecting_airports: ImageVector
    get() {
        if (_Connecting_airports != null) return _Connecting_airports!!
        
        _Connecting_airports = ImageVector.Builder(
            name = "connecting_airports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(776f, 640f)
                lineToRelative(18f, 60f)
                quadToRelative(2f, 8f, -2.5f, 14f)
                reflectiveQuadToRelative(-12.5f, 6f)
                horizontalLineToRelative(-11f)
                quadToRelative(-4f, 0f, -7.5f, -1.5f)
                reflectiveQuadTo(755f, 714f)
                lineToRelative(-25f, -34f)
                horizontalLineTo(616f)
                lineToRelative(45f, 152f)
                quadToRelative(3f, 9f, -2.5f, 16.5f)
                reflectiveQuadTo(643f, 856f)
                horizontalLineToRelative(-8f)
                quadToRelative(-5f, 0f, -9.5f, -2f)
                reflectiveQuadToRelative(-6.5f, -7f)
                lineToRelative(-99f, -167f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(120f)
                lineToRelative(98f, -166f)
                quadToRelative(3f, -5f, 8f, -7.5f)
                reflectiveQuadToRelative(10f, -2.5f)
                horizontalLineToRelative(4f)
                quadToRelative(11f, 0f, 17f, 8f)
                reflectiveQuadToRelative(3f, 19f)
                lineToRelative(-44f, 149f)
                horizontalLineToRelative(114f)
                lineToRelative(24f, -32f)
                quadToRelative(3f, -4f, 7f, -6f)
                reflectiveQuadToRelative(9f, -2f)
                horizontalLineToRelative(4f)
                quadToRelative(10f, 0f, 16f, 8f)
                reflectiveQuadToRelative(3f, 17f)
                lineToRelative(-17f, 55f)
                close()
                moveTo(184f, 320f)
                lineToRelative(-18f, -60f)
                quadToRelative(-2f, -8f, 2.5f, -14f)
                reflectiveQuadToRelative(12.5f, -6f)
                horizontalLineToRelative(11f)
                quadToRelative(4f, 0f, 7.5f, 1.5f)
                reflectiveQuadToRelative(5.5f, 4.5f)
                lineToRelative(25f, 34f)
                horizontalLineToRelative(114f)
                lineToRelative(-45f, -152f)
                quadToRelative(-3f, -9f, 2.5f, -16.5f)
                reflectiveQuadTo(317f, 104f)
                horizontalLineToRelative(8f)
                quadToRelative(5f, 0f, 9.5f, 2f)
                reflectiveQuadToRelative(6.5f, 7f)
                lineToRelative(99f, 167f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineTo(440f)
                lineToRelative(-98f, 166f)
                quadToRelative(-3f, 5f, -7.5f, 7.5f)
                reflectiveQuadTo(325f, 536f)
                horizontalLineToRelative(-8f)
                quadToRelative(-8f, 0f, -14f, -8f)
                reflectiveQuadToRelative(-3f, -19f)
                lineToRelative(44f, -149f)
                horizontalLineTo(230f)
                lineToRelative(-24f, 32f)
                quadToRelative(-3f, 4f, -7f, 6f)
                reflectiveQuadToRelative(-9f, 2f)
                horizontalLineToRelative(-4f)
                quadToRelative(-10f, 0f, -16f, -8f)
                reflectiveQuadToRelative(-3f, -17f)
                lineToRelative(17f, -55f)
                close()
            }
        }.build()
        
        return _Connecting_airports!!
    }

private var _Connecting_airports: ImageVector? = null

