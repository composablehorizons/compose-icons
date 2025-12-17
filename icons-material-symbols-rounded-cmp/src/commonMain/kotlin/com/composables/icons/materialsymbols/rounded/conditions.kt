package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Conditions: ImageVector
    get() {
        if (_Conditions != null) return _Conditions!!
        
        _Conditions = ImageVector.Builder(
            name = "conditions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 240f)
                close()
                moveToRelative(260f, 480f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(96f, 52f)
                quadToRelative(-22f, 14f, -46f, 21f)
                reflectiveQuadToRelative(-50f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 26f, -7f, 50f)
                reflectiveQuadToRelative(-21f, 46f)
                lineToRelative(80f, 80f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(-316f, -13f)
                quadToRelative(15f, 24f, 35.5f, 44f)
                reflectiveQuadToRelative(44.5f, 36f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-81f)
                close()
                moveToRelative(-80f, -119f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-480f)
                quadToRelative(-50f, -4f, -99f, -11f)
                reflectiveQuadToRelative(-98f, -18f)
                quadToRelative(-17f, -4f, -27.5f, -19f)
                reflectiveQuadTo(50f, 280f)
                quadToRelative(5f, -17f, 20.5f, -25f)
                reflectiveQuadToRelative(32.5f, -4f)
                quadToRelative(73f, 17f, 147.5f, 23f)
                reflectiveQuadToRelative(149.5f, 6f)
                quadToRelative(75f, 0f, 149.5f, -6f)
                reflectiveQuadTo(697f, 251f)
                quadToRelative(17f, -4f, 32.5f, 4f)
                reflectiveQuadToRelative(20.5f, 25f)
                quadToRelative(5f, 17f, -5.5f, 32f)
                reflectiveQuadTo(717f, 331f)
                quadToRelative(-49f, 11f, -98f, 18f)
                reflectiveQuadToRelative(-99f, 11f)
                verticalLineToRelative(41f)
                quadToRelative(-54f, 35f, -87f, 92.5f)
                reflectiveQuadTo(400f, 620f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 5f, 1f, 10f)
                horizontalLineToRelative(-41f)
                close()
            }
        }.build()
        
        return _Conditions!!
    }

private var _Conditions: ImageVector? = null

