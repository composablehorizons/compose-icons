package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Format_letter_spacing_2: ImageVector
    get() {
        if (_Format_letter_spacing_2 != null) return _Format_letter_spacing_2!!
        
        _Format_letter_spacing_2 = ImageVector.Builder(
            name = "format_letter_spacing_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 852f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(108f, 748f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(268f, 645f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(494f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(748f, 852f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(692f, 852f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(35f, -35f)
                horizontalLineTo(233f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(268f, 852f)
                close()
                moveToRelative(26f, -380f)
                lineToRelative(137f, -368f)
                quadToRelative(4f, -11f, 13.5f, -17.5f)
                reflectiveQuadTo(466f, 80f)
                horizontalLineToRelative(28f)
                quadToRelative(12f, 0f, 21.5f, 6.5f)
                reflectiveQuadTo(529f, 104f)
                lineToRelative(137f, 369f)
                quadToRelative(6f, 17f, -4f, 32f)
                reflectiveQuadToRelative(-28f, 15f)
                quadToRelative(-11f, 0f, -20.5f, -6.5f)
                reflectiveQuadTo(600f, 496f)
                lineToRelative(-30f, -88f)
                horizontalLineTo(392f)
                lineToRelative(-32f, 89f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(294f, 472f)
                close()
                moveToRelative(120f, -128f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Format_letter_spacing_2!!
    }

private var _Format_letter_spacing_2: ImageVector? = null

