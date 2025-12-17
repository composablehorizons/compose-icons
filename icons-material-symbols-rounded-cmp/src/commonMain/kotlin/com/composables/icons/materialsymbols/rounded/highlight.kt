package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Highlight: ImageVector
    get() {
        if (_Highlight != null) return _Highlight!!
        
        _Highlight = ImageVector.Builder(
            name = "highlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(198f, 293f)
                lineToRelative(-30f, -29f)
                quadToRelative(-12f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(168f, 208f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(225f, 207f)
                lineToRelative(29f, 29f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(254f, 292f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(198f, 293f)
                close()
                moveToRelative(242f, -133f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 160f)
                close()
                moveToRelative(268f, 75f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-28f, 28f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(708f, 293f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                close()
                moveTo(360f, 800f)
                verticalLineToRelative(-120f)
                lineToRelative(-97f, -97f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-87f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 440f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(697f, 583f)
                lineToRelative(-97f, 97f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 800f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-153f)
                lineToRelative(120f, -120f)
                verticalLineToRelative(-87f)
                horizontalLineTo(320f)
                verticalLineToRelative(87f)
                lineToRelative(120f, 120f)
                verticalLineToRelative(153f)
                close()
                moveToRelative(40f, -180f)
                close()
            }
        }.build()
        
        return _Highlight!!
    }

private var _Highlight: ImageVector? = null

