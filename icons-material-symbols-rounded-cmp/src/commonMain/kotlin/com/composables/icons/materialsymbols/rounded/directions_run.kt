package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Directions_run: ImageVector
    get() {
        if (_Directions_run != null) return _Directions_run!!
        
        _Directions_run = ImageVector.Builder(
            name = "directions_run",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 880f)
                verticalLineToRelative(-200f)
                lineToRelative(-84f, -80f)
                lineToRelative(-31f, 138f)
                quadToRelative(-4f, 16f, -17.5f, 24.5f)
                reflectiveQuadTo(358f, 768f)
                lineToRelative(-198f, -40f)
                quadToRelative(-17f, -3f, -26f, -17f)
                reflectiveQuadToRelative(-6f, -31f)
                quadToRelative(3f, -17f, 17f, -26.5f)
                reflectiveQuadToRelative(31f, -5.5f)
                lineToRelative(152f, 32f)
                lineToRelative(64f, -324f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(96f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(-122f)
                quadToRelative(0f, -12f, 6.5f, -21.5f)
                reflectiveQuadTo(264f, 322f)
                lineToRelative(134f, -58f)
                quadToRelative(35f, -15f, 51.5f, -19.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(21f, 0f, 39f, 11f)
                reflectiveQuadToRelative(29f, 29f)
                lineToRelative(40f, 64f)
                quadToRelative(21f, 34f, 54.5f, 59f)
                reflectiveQuadToRelative(77.5f, 33f)
                quadToRelative(17f, 3f, 28.5f, 15f)
                reflectiveQuadToRelative(11.5f, 29f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadToRelative(-27.5f, 9f)
                quadToRelative(-54f, -8f, -101f, -33.5f)
                reflectiveQuadTo(540f, 420f)
                lineToRelative(-24f, 120f)
                lineToRelative(72f, 68f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(243f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 880f)
                close()
                moveToRelative(20f, -660f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
            }
        }.build()
        
        return _Directions_run!!
    }

private var _Directions_run: ImageVector? = null

