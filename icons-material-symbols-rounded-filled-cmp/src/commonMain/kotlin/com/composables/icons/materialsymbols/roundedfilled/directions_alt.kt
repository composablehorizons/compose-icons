package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directions_alt: ImageVector
    get() {
        if (_Directions_alt != null) return _Directions_alt!!
        
        _Directions_alt = ImageVector.Builder(
            name = "directions_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 856f)
                lineTo(104f, 536f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(320f, -320f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(320f, 320f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(856f, 536f)
                lineTo(536f, 856f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(46f, -360f)
                lineToRelative(-75f, 76f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(144f, -144f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineTo(508f, 308f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(452f, 308f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(451f, 364f)
                lineToRelative(75f, 76f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(206f)
                close()
            }
        }.build()
        
        return _Directions_alt!!
    }

private var _Directions_alt: ImageVector? = null

