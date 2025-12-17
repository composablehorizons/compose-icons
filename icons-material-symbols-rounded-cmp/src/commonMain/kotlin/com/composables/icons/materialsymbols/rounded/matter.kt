package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Matter: ImageVector
    get() {
        if (_Matter != null) return _Matter!!
        
        _Matter = ImageVector.Builder(
            name = "matter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 420f)
                quadToRelative(-66f, 0f, -123f, -24.5f)
                reflectiveQuadTo(256f, 328f)
                lineToRelative(72f, -43f)
                quadToRelative(24f, 20f, 52f, 33f)
                reflectiveQuadToRelative(60f, 18f)
                verticalLineToRelative(-212f)
                lineToRelative(40f, -24f)
                lineToRelative(40f, 24f)
                verticalLineToRelative(212f)
                quadToRelative(32f, -5f, 60f, -18f)
                reflectiveQuadToRelative(52f, -33f)
                lineToRelative(72f, 43f)
                quadToRelative(-44f, 43f, -101f, 67.5f)
                reflectiveQuadTo(480f, 420f)
                close()
                moveToRelative(-49f, 375f)
                lineToRelative(-74f, -39f)
                quadToRelative(2f, -9f, 2.5f, -18f)
                reflectiveQuadToRelative(0.5f, -18f)
                quadToRelative(0f, -23f, -4f, -45.5f)
                reflectiveQuadTo(344f, 632f)
                lineTo(161f, 742f)
                lineToRelative(-41f, -22f)
                verticalLineToRelative(-47f)
                lineToRelative(182f, -109f)
                quadToRelative(-20f, -23f, -46f, -41f)
                reflectiveQuadToRelative(-56f, -29f)
                verticalLineToRelative(-84f)
                quadToRelative(104f, 27f, 172f, 112.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 20f, -2f, 38.5f)
                reflectiveQuadToRelative(-7f, 36.5f)
                close()
                moveToRelative(98f, 0f)
                quadToRelative(-5f, -18f, -7f, -36.5f)
                reflectiveQuadToRelative(-2f, -38.5f)
                quadToRelative(0f, -112f, 68f, -197.5f)
                reflectiveQuadTo(760f, 410f)
                verticalLineToRelative(84f)
                quadToRelative(-30f, 11f, -56f, 29f)
                reflectiveQuadToRelative(-46f, 41f)
                lineToRelative(182f, 109f)
                verticalLineToRelative(47f)
                lineToRelative(-41f, 22f)
                lineToRelative(-183f, -110f)
                quadToRelative(-8f, 20f, -12f, 42.5f)
                reflectiveQuadToRelative(-4f, 45.5f)
                quadToRelative(0f, 9f, 0.5f, 18f)
                reflectiveQuadToRelative(2.5f, 18f)
                lineToRelative(-74f, 39f)
                close()
            }
        }.build()
        
        return _Matter!!
    }

private var _Matter: ImageVector? = null

