package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Travel_explore: ImageVector
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
                moveTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 226.5f, 70f)
                reflectiveQuadTo(851f, 331f)
                quadToRelative(7f, 17f, 0.5f, 34f)
                reflectiveQuadTo(828f, 388f)
                quadToRelative(-16f, 5f, -30.5f, -3f)
                reflectiveQuadTo(777f, 361f)
                quadToRelative(-24f, -60f, -69f, -106f)
                reflectiveQuadToRelative(-108f, -71f)
                verticalLineToRelative(16f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 122f, 80.5f, 213f)
                reflectiveQuadTo(443f, 798f)
                quadToRelative(16f, 2f, 26.5f, 13.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(441f, 878f)
                quadTo(288f, 863f, 184f, 750f)
                reflectiveQuadTo(80f, 480f)
                close()
                moveToRelative(736f, 352f)
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
                lineToRelative(100f, 100f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
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

