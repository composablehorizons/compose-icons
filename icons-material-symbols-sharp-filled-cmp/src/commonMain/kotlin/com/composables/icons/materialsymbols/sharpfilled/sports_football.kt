package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sports_football: ImageVector
    get() {
        if (_Sports_football != null) return _Sports_football!!
        
        _Sports_football = ImageVector.Builder(
            name = "sports_football",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(363f, 839f)
                quadToRelative(-47f, 5f, -113.5f, -2.5f)
                reflectiveQuadTo(148f, 812f)
                quadToRelative(-14f, -32f, -23.5f, -100f)
                reflectiveQuadTo(120f, 596f)
                lineToRelative(243f, 243f)
                close()
                moveToRelative(95f, -16f)
                lineTo(136f, 501f)
                quadToRelative(17f, -75f, 49.5f, -136.5f)
                reflectiveQuadTo(261f, 259f)
                quadToRelative(43f, -43f, 104.5f, -74.5f)
                reflectiveQuadTo(498f, 137f)
                lineToRelative(324f, 324f)
                quadToRelative(-16f, 74f, -47f, 136f)
                reflectiveQuadToRelative(-74f, 105f)
                quadToRelative(-45f, 44f, -107.5f, 75.5f)
                reflectiveQuadTo(458f, 823f)
                close()
                moveToRelative(-82f, -183f)
                lineToRelative(264f, -264f)
                lineToRelative(-56f, -56f)
                lineToRelative(-264f, 264f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(462f, -274f)
                lineTo(595f, 121f)
                quadToRelative(48f, -6f, 118f, 2f)
                reflectiveQuadToRelative(99f, 25f)
                quadToRelative(18f, 40f, 25f, 103.5f)
                reflectiveQuadToRelative(1f, 114.5f)
                close()
            }
        }.build()
        
        return _Sports_football!!
    }

private var _Sports_football: ImageVector? = null

