package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_disconnected: ImageVector
    get() {
        if (_Signal_disconnected != null) return _Signal_disconnected!!
        
        _Signal_disconnected = ImageVector.Builder(
            name = "signal_disconnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(748f, 400f)
                quadToRelative(0f, 38f, -11f, 75f)
                reflectiveQuadToRelative(-33f, 69f)
                quadToRelative(-8f, 11f, -21.5f, 11.5f)
                reflectiveQuadTo(658f, 545f)
                quadToRelative(-10f, -10f, -10f, -24f)
                reflectiveQuadToRelative(8f, -26f)
                quadToRelative(12f, -22f, 18f, -46f)
                reflectiveQuadToRelative(6f, -49f)
                quadToRelative(0f, -31f, -10f, -60f)
                reflectiveQuadToRelative(-28f, -54f)
                quadToRelative(-8f, -12f, -8f, -26f)
                reflectiveQuadToRelative(10f, -24f)
                quadToRelative(10f, -10f, 24f, -10f)
                reflectiveQuadToRelative(22f, 11f)
                quadToRelative(28f, 35f, 43f, 76.5f)
                reflectiveQuadToRelative(15f, 86.5f)
                close()
                moveTo(480f, 300f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 5f, -2f, 10f)
                quadToRelative(-3f, 12f, -15.5f, 14.5f)
                reflectiveQuadTo(541f, 428f)
                lineToRelative(-89f, -89f)
                quadToRelative(-9f, -9f, -6f, -21f)
                reflectiveQuadToRelative(14f, -16f)
                quadToRelative(5f, -2f, 10f, -2f)
                horizontalLineToRelative(10f)
                close()
                moveToRelative(400f, 100f)
                quadToRelative(0f, 66f, -20f, 127f)
                reflectiveQuadToRelative(-59f, 114f)
                quadToRelative(-8f, 11f, -22f, 11f)
                reflectiveQuadToRelative(-24f, -10f)
                quadToRelative(-10f, -10f, -10f, -24f)
                reflectiveQuadToRelative(8f, -26f)
                quadToRelative(29f, -42f, 44f, -91f)
                reflectiveQuadToRelative(15f, -101f)
                quadToRelative(0f, -58f, -18.5f, -112f)
                reflectiveQuadTo(739f, 189f)
                quadToRelative(-9f, -11f, -9f, -25f)
                reflectiveQuadToRelative(10f, -24f)
                quadToRelative(10f, -10f, 24f, -9.5f)
                reflectiveQuadToRelative(23f, 11.5f)
                quadToRelative(45f, 55f, 69f, 121f)
                reflectiveQuadToRelative(24f, 137f)
                close()
                moveTo(763f, 876f)
                lineTo(520f, 633f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-247f)
                lineTo(280f, 394f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 31f, 10f, 60f)
                reflectiveQuadToRelative(28f, 54f)
                quadToRelative(8f, 12f, 8f, 26f)
                reflectiveQuadToRelative(-10f, 24f)
                quadToRelative(-10f, 10f, -24f, 10f)
                reflectiveQuadToRelative(-22f, -11f)
                quadToRelative(-27f, -35f, -42.5f, -76.5f)
                reflectiveQuadTo(212f, 400f)
                quadToRelative(0f, -17f, 2f, -33f)
                reflectiveQuadToRelative(7f, -33f)
                lineToRelative(-51f, -51f)
                quadToRelative(-11f, 29f, -16.5f, 58f)
                reflectiveQuadToRelative(-5.5f, 59f)
                quadToRelative(0f, 58f, 18.5f, 112f)
                reflectiveQuadToRelative(54.5f, 99f)
                quadToRelative(9f, 11f, 9f, 25f)
                reflectiveQuadToRelative(-10f, 24f)
                quadToRelative(-10f, 10f, -24f, 9.5f)
                reflectiveQuadTo(173f, 658f)
                quadToRelative(-45f, -55f, -69f, -121f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -44f, 9.5f, -86.5f)
                reflectiveQuadTo(118f, 231f)
                lineToRelative(-34f, -34f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 876f)
                close()
            }
        }.build()
        
        return _Signal_disconnected!!
    }

private var _Signal_disconnected: ImageVector? = null

