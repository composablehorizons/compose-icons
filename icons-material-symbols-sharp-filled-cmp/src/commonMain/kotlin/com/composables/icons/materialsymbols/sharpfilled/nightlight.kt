package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nightlight: ImageVector
    get() {
        if (_Nightlight != null) return _Nightlight!!
        
        _Nightlight = ImageVector.Builder(
            name = "nightlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(223f, 708f, 191.5f, 635f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                quadTo(332f, 143f, 405f, 111.5f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(54f, 0f, 105f, 14f)
                reflectiveQuadToRelative(95f, 40f)
                quadToRelative(-91f, 53f, -145.5f, 143.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 112f, 54.5f, 202.5f)
                reflectiveQuadTo(760f, 826f)
                quadToRelative(-44f, 26f, -95f, 40f)
                reflectiveQuadTo(560f, 880f)
                close()
            }
        }.build()
        
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null

