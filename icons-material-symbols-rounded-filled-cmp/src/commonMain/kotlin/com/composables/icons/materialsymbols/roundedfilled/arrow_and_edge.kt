package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_and_edge: ImageVector
    get() {
        if (_Arrow_and_edge != null) return _Arrow_and_edge!!
        
        _Arrow_and_edge = ImageVector.Builder(
            name = "arrow_and_edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 687f)
                verticalLineToRelative(-167f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 360f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(240f)
                quadToRelative(36f, 0f, 67f, 14.5f)
                reflectiveQuadToRelative(53f, 39.5f)
                quadToRelative(22f, -25f, 53f, -39.5f)
                reflectiveQuadToRelative(67f, -14.5f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 160f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(167f)
                lineToRelative(35f, -35f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(611f, 709f)
                lineTo(508f, 812f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(348f, 708f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(348f, 652f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(36f, 35f)
                close()
            }
        }.build()
        
        return _Arrow_and_edge!!
    }

private var _Arrow_and_edge: ImageVector? = null

