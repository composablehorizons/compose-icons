package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.North: ImageVector
    get() {
        if (_North != null) return _North!!
        
        _North = ImageVector.Builder(
            name = "north",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-607f)
                lineTo(284f, 388f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(228f, 388f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(224f, -224f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(224f, 224f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(732f, 388f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(675f, 388f)
                lineTo(520f, 233f)
                verticalLineToRelative(607f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _North!!
    }

private var _North: ImageVector? = null

