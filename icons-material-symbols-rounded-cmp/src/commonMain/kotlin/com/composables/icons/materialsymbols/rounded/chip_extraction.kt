package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chip_extraction: ImageVector
    get() {
        if (_Chip_extraction != null) return _Chip_extraction!!
        
        _Chip_extraction = ImageVector.Builder(
            name = "chip_extraction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 480f)
                quadToRelative(0f, 106f, 69f, 185f)
                reflectiveQuadToRelative(174f, 93f)
                quadToRelative(16f, 2f, 26.5f, 14f)
                reflectiveQuadToRelative(10.5f, 28f)
                quadToRelative(0f, 17f, -14.5f, 28f)
                reflectiveQuadToRelative(-32.5f, 9f)
                quadToRelative(-135f, -17f, -224f, -118.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -136f, 88.5f, -237.5f)
                reflectiveQuadTo(432f, 123f)
                quadToRelative(19f, -2f, 33.5f, 8.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, 16f, -10.5f, 28f)
                reflectiveQuadTo(443f, 202f)
                quadToRelative(-105f, 14f, -174f, 93f)
                reflectiveQuadToRelative(-69f, 185f)
                close()
                moveToRelative(487f, 40f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 440f)
                horizontalLineToRelative(287f)
                lineToRelative(-75f, -75f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(144f, 144f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(668f, 652f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(612f, 651f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(75f, -75f)
                close()
            }
        }.build()
        
        return _Chip_extraction!!
    }

private var _Chip_extraction: ImageVector? = null

