package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pin_drop: ImageVector
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
                moveTo(480f, 659f)
                quadToRelative(99f, -80f, 149.5f, -154f)
                reflectiveQuadTo(680f, 366f)
                quadToRelative(0f, -56f, -20.5f, -95.5f)
                reflectiveQuadToRelative(-50.5f, -64f)
                quadTo(579f, 182f, 544f, 171f)
                reflectiveQuadToRelative(-64f, -11f)
                quadToRelative(-29f, 0f, -64f, 11f)
                reflectiveQuadToRelative(-65f, 35.5f)
                quadToRelative(-30f, 24.5f, -50.5f, 64f)
                reflectiveQuadTo(280f, 366f)
                quadToRelative(0f, 65f, 50.5f, 139f)
                reflectiveQuadTo(480f, 659f)
                close()
                moveToRelative(0f, 101f)
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
                moveToRelative(280f, -514f)
                close()
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null

