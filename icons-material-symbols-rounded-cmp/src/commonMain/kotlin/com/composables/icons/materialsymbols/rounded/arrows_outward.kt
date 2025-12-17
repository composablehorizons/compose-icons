package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrows_outward: ImageVector
    get() {
        if (_Arrows_outward != null) return _Arrows_outward!!
        
        _Arrows_outward = ImageVector.Builder(
            name = "arrows_outward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(727f, 520f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(207f)
                lineToRelative(-75f, -75f)
                quadToRelative(-11f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(652f, 308f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(144f, 144f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(708f, 652f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(75f, -75f)
                close()
                moveToRelative(-494f, 0f)
                lineToRelative(75f, 75f)
                quadToRelative(11f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(308f, 652f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(108f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 480f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(144f, -144f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(308f, 365f)
                lineToRelative(-75f, 75f)
                horizontalLineToRelative(207f)
                verticalLineToRelative(80f)
                horizontalLineTo(233f)
                close()
            }
        }.build()
        
        return _Arrows_outward!!
    }

private var _Arrows_outward: ImageVector? = null

