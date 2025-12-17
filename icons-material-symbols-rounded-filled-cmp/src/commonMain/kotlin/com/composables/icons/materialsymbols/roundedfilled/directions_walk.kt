package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directions_walk: ImageVector
    get() {
        if (_Directions_walk != null) return _Directions_walk!!
        
        _Directions_walk = ImageVector.Builder(
            name = "directions_walk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(436f, 596f)
                lineTo(371f, 888f)
                quadToRelative(-3f, 14f, -14.5f, 23f)
                reflectiveQuadTo(330f, 920f)
                quadToRelative(-20f, 0f, -32f, -15f)
                reflectiveQuadToRelative(-8f, -34f)
                lineToRelative(102f, -515f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(96f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(-122f)
                quadToRelative(0f, -12f, 6.5f, -21.5f)
                reflectiveQuadTo(264f, 322f)
                lineToRelative(178f, -76f)
                quadToRelative(14f, -6f, 29.5f, -7f)
                reflectiveQuadToRelative(29.5f, 4f)
                quadToRelative(14f, 5f, 26.5f, 14f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(40f, 64f)
                quadToRelative(13f, 20f, 30.5f, 38f)
                reflectiveQuadToRelative(39.5f, 31f)
                quadToRelative(14f, 8f, 31f, 14.5f)
                reflectiveQuadToRelative(34f, 9.5f)
                quadToRelative(16f, 3f, 26.5f, 14.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 17f, -12f, 28f)
                reflectiveQuadToRelative(-29f, 9f)
                quadToRelative(-56f, -8f, -100.5f, -35f)
                reflectiveQuadTo(541f, 417f)
                lineToRelative(-25f, 123f)
                lineToRelative(72f, 68f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(243f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 880f)
                verticalLineToRelative(-220f)
                lineToRelative(-84f, -64f)
                close()
                moveToRelative(104f, -376f)
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
        
        return _Directions_walk!!
    }

private var _Directions_walk: ImageVector? = null

