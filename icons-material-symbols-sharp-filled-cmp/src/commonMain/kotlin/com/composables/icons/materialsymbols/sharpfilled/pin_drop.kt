package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pin_drop: ImageVector
    get() {
        if (_Pin_drop != null) return _Pin_drop!!
        
        _Pin_drop = ImageVector.Builder(
            name = "pin_drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadTo(339f, 656f, 269.5f, 558f)
                reflectiveQuadTo(200f, 366f)
                quadToRelative(0f, -71f, 25.5f, -124.5f)
                reflectiveQuadTo(291f, 152f)
                quadToRelative(40f, -36f, 90f, -54f)
                reflectiveQuadToRelative(99f, -18f)
                quadToRelative(49f, 0f, 99f, 18f)
                reflectiveQuadToRelative(90f, 54f)
                quadToRelative(40f, 36f, 65.5f, 89.5f)
                reflectiveQuadTo(760f, 366f)
                quadToRelative(0f, 94f, -69.5f, 192f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(200f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null

