package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Subway_walk: ImageVector
    get() {
        if (_Subway_walk != null) return _Subway_walk!!
        
        _Subway_walk = ImageVector.Builder(
            name = "subway_walk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-40f)
                lineToRelative(60f, -40f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -83f, 77f, -121.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(53f, 0f, 100f, 3.5f)
                reflectiveQuadToRelative(87f, 12.5f)
                lineToRelative(-7f, 90f)
                lineToRelative(-220f, 94f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(107f)
                lineToRelative(-60f, 280f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, 40f)
                lineToRelative(112f, -524f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-148f)
                lineToRelative(202f, -86f)
                quadToRelative(29f, -12f, 59f, -2.5f)
                reflectiveQuadToRelative(47f, 36.5f)
                lineToRelative(40f, 64f)
                quadToRelative(24f, 42f, 49.5f, 69f)
                reflectiveQuadToRelative(82.5f, 27f)
                verticalLineToRelative(80f)
                quadToRelative(-66f, 0f, -103.5f, -27.5f)
                reflectiveQuadTo(700f, 420f)
                lineToRelative(-24f, 80f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                lineToRelative(-84f, -80f)
                lineToRelative(-72f, 320f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(260f, -660f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(700f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(780f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(700f, 220f)
                close()
            }
        }.build()
        
        return _Subway_walk!!
    }

private var _Subway_walk: ImageVector? = null

