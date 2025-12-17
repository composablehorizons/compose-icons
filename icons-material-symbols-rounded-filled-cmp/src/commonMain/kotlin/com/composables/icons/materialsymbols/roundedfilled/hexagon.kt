package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318f, 840f)
                quadToRelative(-22f, 0f, -40f, -10.5f)
                reflectiveQuadTo(249f, 800f)
                lineTo(87f, 520f)
                quadToRelative(-11f, -19f, -11f, -40f)
                reflectiveQuadToRelative(11f, -40f)
                lineToRelative(162f, -280f)
                quadToRelative(11f, -19f, 29f, -29.5f)
                reflectiveQuadToRelative(40f, -10.5f)
                horizontalLineToRelative(324f)
                quadToRelative(22f, 0f, 40f, 10.5f)
                reflectiveQuadToRelative(29f, 29.5f)
                lineToRelative(162f, 280f)
                quadToRelative(11f, 19f, 11f, 40f)
                reflectiveQuadToRelative(-11f, 40f)
                lineTo(711f, 800f)
                quadToRelative(-11f, 19f, -29f, 29.5f)
                reflectiveQuadTo(642f, 840f)
                horizontalLineTo(318f)
                close()
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

