package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_or_edge: ImageVector
    get() {
        if (_Arrow_or_edge != null) return _Arrow_or_edge!!
        
        _Arrow_or_edge = ImageVector.Builder(
            name = "arrow_or_edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 687f)
                verticalLineToRelative(-247f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 360f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(340f, 440f)
                verticalLineToRelative(247f)
                lineToRelative(35f, -35f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(431f, 709f)
                lineTo(328f, 812f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(168f, 708f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(168f, 652f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(36f, 35f)
                close()
                moveToRelative(440f, 1f)
                lineToRelative(35f, -36f)
                quadToRelative(11f, -12f, 27.5f, -11.5f)
                reflectiveQuadTo(791f, 652f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(791f, 709f)
                lineTo(688f, 812f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(528f, 708f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(528f, 652f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(36f, 35f)
                verticalLineToRelative(-247f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(700f, 360f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 160f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(700f)
                verticalLineToRelative(248f)
                close()
            }
        }.build()
        
        return _Arrow_or_edge!!
    }

private var _Arrow_or_edge: ImageVector? = null

