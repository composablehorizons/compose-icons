package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_right_alt: ImageVector
    get() {
        if (_Arrow_right_alt != null) return _Arrow_right_alt!!
        
        _Arrow_right_alt = ImageVector.Builder(
            name = "arrow_right_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(646f, 520f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 440f)
                horizontalLineToRelative(446f)
                lineTo(532f, 326f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(589f, 269f)
                lineToRelative(183f, 183f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(589f, 691f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(532f, 690f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(114f, -114f)
                close()
            }
        }.build()
        
        return _Arrow_right_alt!!
    }

private var _Arrow_right_alt: ImageVector? = null

