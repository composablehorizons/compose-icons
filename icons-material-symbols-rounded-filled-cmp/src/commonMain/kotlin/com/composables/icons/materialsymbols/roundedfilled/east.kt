package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.East: ImageVector
    get() {
        if (_East != null) return _East!!
        
        _East = ImageVector.Builder(
            name = "east",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(727f, 520f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(607f)
                lineTo(572f, 284f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(572f, 228f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(224f, 224f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(628f, 732f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(572f, 732f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(155f, -155f)
                close()
            }
        }.build()
        
        return _East!!
    }

private var _East: ImageVector? = null

