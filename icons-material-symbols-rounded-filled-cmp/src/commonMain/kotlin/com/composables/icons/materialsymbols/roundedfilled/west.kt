package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.West: ImageVector
    get() {
        if (_West != null) return _West!!
        
        _West = ImageVector.Builder(
            name = "west",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 520f)
                horizontalLineToRelative(607f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(233f)
                lineToRelative(155f, -156f)
                quadToRelative(11f, -11f, 11.5f, -27.5f)
                reflectiveQuadTo(388f, 228f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineTo(108f, 452f)
                quadToRelative(-6f, 6f, -8.5f, 13f)
                reflectiveQuadTo(97f, 480f)
                quadToRelative(0f, 8f, 2.5f, 15f)
                reflectiveQuadToRelative(8.5f, 13f)
                lineToRelative(224f, 224f)
                quadToRelative(11f, 11f, 27.5f, 11f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(388f, 675f)
                lineTo(233f, 520f)
                close()
            }
        }.build()
        
        return _West!!
    }

private var _West: ImageVector? = null

