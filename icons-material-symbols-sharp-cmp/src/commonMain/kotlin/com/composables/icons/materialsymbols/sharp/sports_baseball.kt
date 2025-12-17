package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_baseball: ImageVector
    get() {
        if (_Sports_baseball != null) return _Sports_baseball!!
        
        _Sports_baseball = ImageVector.Builder(
            name = "sports_baseball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 672f)
                quadToRelative(45f, -35f, 70.5f, -85f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -57f, -25.5f, -107f)
                reflectiveQuadTo(224f, 288f)
                quadToRelative(-31f, 42f, -47.5f, 91f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 52f, 16.5f, 101f)
                reflectiveQuadToRelative(47.5f, 91f)
                close()
                moveToRelative(256f, 128f)
                quadToRelative(55f, 0f, 106.5f, -17.5f)
                reflectiveQuadTo(680f, 730f)
                quadToRelative(-57f, -46f, -88.5f, -111.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -73f, 31.5f, -138.5f)
                reflectiveQuadTo(680f, 230f)
                quadToRelative(-42f, -35f, -93.5f, -52.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-55f, 0f, -106.5f, 17.5f)
                reflectiveQuadTo(280f, 230f)
                quadToRelative(57f, 46f, 88.5f, 111.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 73f, -31.5f, 138.5f)
                reflectiveQuadTo(280f, 730f)
                quadToRelative(42f, 35f, 93.5f, 52.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(256f, -128f)
                quadToRelative(31f, -42f, 47.5f, -91f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -52f, -16.5f, -101f)
                reflectiveQuadTo(736f, 288f)
                quadToRelative(-45f, 35f, -70.5f, 85f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 57f, 25.5f, 107f)
                reflectiveQuadToRelative(70.5f, 85f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Sports_baseball!!
    }

private var _Sports_baseball: ImageVector? = null

