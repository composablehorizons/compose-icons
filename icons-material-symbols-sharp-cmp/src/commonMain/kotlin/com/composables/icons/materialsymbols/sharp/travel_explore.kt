package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Travel_explore: ImageVector
    get() {
        if (_Travel_explore != null) return _Travel_explore!!
        
        _Travel_explore = ImageVector.Builder(
            name = "travel_explore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(146f, 0f, 255.5f, 91.5f)
                reflectiveQuadTo(872f, 401f)
                horizontalLineToRelative(-82f)
                quadToRelative(-19f, -73f, -68.5f, -130.5f)
                reflectiveQuadTo(600f, 184f)
                verticalLineToRelative(16f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 131f, 92f, 225f)
                reflectiveQuadToRelative(228f, 95f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(364f, -20f)
                lineTo(716f, 732f)
                quadToRelative(-21f, 12f, -45f, 20f)
                reflectiveQuadToRelative(-51f, 8f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(440f, 580f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(800f, 580f)
                quadToRelative(0f, 27f, -8f, 51f)
                reflectiveQuadToRelative(-20f, 45f)
                lineToRelative(128f, 128f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(620f, 680f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
            }
        }.build()
        
        return _Travel_explore!!
    }

private var _Travel_explore: ImageVector? = null

