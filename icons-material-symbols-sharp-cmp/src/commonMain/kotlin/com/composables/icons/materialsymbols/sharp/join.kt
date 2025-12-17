package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Join: ImageVector
    get() {
        if (_Join != null) return _Join!!
        
        _Join = ImageVector.Builder(
            name = "join",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 680f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(-27f, 0f, -52.5f, 7f)
                reflectiveQuadTo(540f, 307f)
                quadToRelative(29f, 36f, 44.5f, 80f)
                reflectiveQuadToRelative(15.5f, 93f)
                quadToRelative(0f, 49f, -15.5f, 93f)
                reflectiveQuadTo(540f, 653f)
                quadToRelative(22f, 13f, 47.5f, 20f)
                reflectiveQuadToRelative(52.5f, 7f)
                close()
                moveToRelative(-160f, -80f)
                quadToRelative(19f, -25f, 29.5f, -55.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -34f, -10.5f, -64.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-19f, 25f, -29.5f, 55.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 34f, 10.5f, 64.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(-160f, 80f)
                quadToRelative(27f, 0f, 52.5f, -7f)
                reflectiveQuadToRelative(47.5f, -20f)
                quadToRelative(-29f, -36f, -44.5f, -80f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -49f, 15.5f, -93f)
                reflectiveQuadToRelative(44.5f, -80f)
                quadToRelative(-22f, -13f, -47.5f, -20f)
                reflectiveQuadToRelative(-52.5f, -7f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(320f, 680f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(45f, 0f, 85.5f, 13f)
                reflectiveQuadToRelative(74.5f, 37f)
                quadToRelative(34f, -24f, 74.5f, -37f)
                reflectiveQuadToRelative(85.5f, -13f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(-45f, 0f, -85.5f, -13f)
                reflectiveQuadTo(480f, 710f)
                quadToRelative(-34f, 24f, -74.5f, 37f)
                reflectiveQuadTo(320f, 760f)
                close()
            }
        }.build()
        
        return _Join!!
    }

private var _Join: ImageVector? = null

