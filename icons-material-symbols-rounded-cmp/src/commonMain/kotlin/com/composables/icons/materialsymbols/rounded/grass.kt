package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Grass: ImageVector
    get() {
        if (_Grass != null) return _Grass!!
        
        _Grass = ImageVector.Builder(
            name = "grass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 720f)
                horizontalLineToRelative(190f)
                quadToRelative(-17f, -63f, -56f, -114f)
                reflectiveQuadToRelative(-94f, -83f)
                quadToRelative(-22f, -13f, -21f, -28.5f)
                reflectiveQuadToRelative(27f, -14.5f)
                quadToRelative(131f, 2f, 222.5f, 95f)
                reflectiveQuadTo(480f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(0f, -42f, -9f, -83.5f)
                reflectiveQuadTo(525f, 637f)
                quadToRelative(42f, -69f, 112.5f, -112f)
                reflectiveQuadTo(794f, 480f)
                quadToRelative(24f, -1f, 25f, 15.5f)
                reflectiveQuadTo(800f, 523f)
                quadToRelative(-55f, 32f, -94f, 83f)
                reflectiveQuadToRelative(-56f, 114f)
                horizontalLineToRelative(190f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-80f, -239f)
                quadToRelative(0f, -106f, 60.5f, -188.5f)
                reflectiveQuadTo(696f, 258f)
                quadToRelative(23f, -8f, 34f, 5f)
                reflectiveQuadToRelative(-9f, 32f)
                quadToRelative(-32f, 30f, -55.5f, 67f)
                reflectiveQuadTo(626f, 441f)
                quadToRelative(-44f, 21f, -80.5f, 51.5f)
                reflectiveQuadTo(480f, 561f)
                close()
                moveToRelative(-73f, -75f)
                quadToRelative(-12f, -9f, -24f, -17f)
                reflectiveQuadToRelative(-25f, -16f)
                quadToRelative(0f, -6f, 1f, -12.5f)
                reflectiveQuadToRelative(1f, -12.5f)
                quadToRelative(0f, -53f, -11.5f, -101f)
                reflectiveQuadTo(315f, 234f)
                quadToRelative(-11f, -22f, 1.5f, -32.5f)
                reflectiveQuadTo(349f, 207f)
                quadToRelative(36f, 29f, 63.5f, 66f)
                reflectiveQuadToRelative(44.5f, 81f)
                quadToRelative(-18f, 30f, -31f, 63.5f)
                reflectiveQuadTo(407f, 486f)
                close()
            }
        }.build()
        
        return _Grass!!
    }

private var _Grass: ImageVector? = null

