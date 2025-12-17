package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sports_martial_arts: ImageVector
    get() {
        if (_Sports_martial_arts != null) return _Sports_martial_arts!!
        
        _Sports_martial_arts = ImageVector.Builder(
            name = "sports_martial_arts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 480f)
                lineToRelative(-18f, 362f)
                quadToRelative(-1f, 16f, -12.5f, 27f)
                reflectiveQuadTo(438f, 880f)
                quadToRelative(-16f, 0f, -27.5f, -11f)
                reflectiveQuadTo(398f, 842f)
                lineToRelative(-18f, -322f)
                lineToRelative(-127f, -73f)
                lineToRelative(-14f, 52f)
                lineToRelative(61f, 107f)
                quadToRelative(8f, 14f, 3.5f, 30f)
                reflectiveQuadTo(285f, 660f)
                quadToRelative(-14f, 8f, -30f, 4f)
                reflectiveQuadToRelative(-24f, -18f)
                lineToRelative(-70f, -121f)
                quadToRelative(-4f, -7f, -5f, -15f)
                reflectiveQuadToRelative(1f, -16f)
                lineToRelative(43f, -156f)
                lineToRelative(230f, -132f)
                lineToRelative(-82f, -82f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(348f, 68f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(119f, 118f)
                quadToRelative(14f, 14f, 11.5f, 33.5f)
                reflectiveQuadTo(515f, 249f)
                lineToRelative(-99f, 57f)
                lineToRelative(48f, 42f)
                lineToRelative(300f, -245f)
                quadToRelative(11f, -10f, 26.5f, -8.5f)
                reflectiveQuadTo(818f, 110f)
                quadToRelative(9f, 11f, 8.5f, 25f)
                reflectiveQuadTo(816f, 160f)
                lineTo(500f, 480f)
                close()
                moveTo(200f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 280f)
                close()
            }
        }.build()
        
        return _Sports_martial_arts!!
    }

private var _Sports_martial_arts: ImageVector? = null

