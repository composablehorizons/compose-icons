package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pill: ImageVector
    get() {
        if (_Pill != null) return _Pill!!
        
        _Pill = ImageVector.Builder(
            name = "pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(668f, 611f)
                lineToRelative(106f, -107f)
                quadToRelative(32f, -32f, 49f, -73f)
                reflectiveQuadToRelative(17f, -86f)
                quadToRelative(0f, -94f, -65.5f, -159.5f)
                reflectiveQuadTo(615f, 120f)
                quadToRelative(-45f, 0f, -86f, 17f)
                reflectiveQuadToRelative(-73f, 49f)
                lineTo(349f, 292f)
                lineToRelative(319f, 319f)
                close()
                moveTo(345f, 840f)
                quadToRelative(45f, 0f, 86f, -17f)
                reflectiveQuadToRelative(73f, -49f)
                lineToRelative(107f, -106f)
                lineToRelative(-319f, -319f)
                lineToRelative(-106f, 107f)
                quadToRelative(-32f, 32f, -49f, 73f)
                reflectiveQuadToRelative(-17f, 86f)
                quadToRelative(0f, 94f, 65.5f, 159.5f)
                reflectiveQuadTo(345f, 840f)
                close()
            }
        }.build()
        
        return _Pill!!
    }

private var _Pill: ImageVector? = null

