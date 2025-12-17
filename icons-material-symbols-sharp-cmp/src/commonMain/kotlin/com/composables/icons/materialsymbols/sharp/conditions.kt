package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Conditions: ImageVector
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
                moveTo(864f, 880f)
                lineTo(756f, 772f)
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
                lineToRelative(108f, 108f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-424f, 0f)
                verticalLineToRelative(-121f)
                quadToRelative(15f, 24f, 35.5f, 44f)
                reflectiveQuadToRelative(44.5f, 36f)
                verticalLineToRelative(41f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-160f, 0f)
                verticalLineToRelative(-520f)
                quadToRelative(-61f, -5f, -121f, -14.5f)
                reflectiveQuadTo(40f, 320f)
                lineToRelative(20f, -80f)
                quadToRelative(84f, 23f, 168.5f, 31.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(87f, 0f, 171.5f, -8.5f)
                reflectiveQuadTo(740f, 240f)
                lineToRelative(20f, 80f)
                quadToRelative(-59f, 16f, -119f, 25.5f)
                reflectiveQuadTo(520f, 360f)
                verticalLineToRelative(41f)
                quadToRelative(-54f, 35f, -87f, 92.5f)
                reflectiveQuadTo(400f, 620f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 5f, 1f, 10f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Conditions!!
    }

private var _Conditions: ImageVector? = null

