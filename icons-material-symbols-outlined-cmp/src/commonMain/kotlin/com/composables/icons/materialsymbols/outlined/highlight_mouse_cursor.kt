package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Highlight_mouse_cursor: ImageVector
    get() {
        if (_Highlight_mouse_cursor != null) return _Highlight_mouse_cursor!!
        
        _Highlight_mouse_cursor = ImageVector.Builder(
            name = "highlight_mouse_cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(516f, 878f)
                quadToRelative(-9f, 2f, -18f, 2f)
                horizontalLineToRelative(-18f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(18f)
                quadToRelative(0f, 9f, -2f, 18f)
                lineToRelative(-78f, -24f)
                verticalLineToRelative(-12f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                horizontalLineToRelative(12f)
                lineToRelative(24f, 78f)
                close()
                moveToRelative(305f, 22f)
                lineTo(650f, 729f)
                lineTo(600f, 880f)
                lineTo(480f, 480f)
                lineToRelative(400f, 120f)
                lineToRelative(-151f, 50f)
                lineToRelative(171f, 171f)
                lineToRelative(-79f, 79f)
                close()
            }
        }.build()
        
        return _Highlight_mouse_cursor!!
    }

private var _Highlight_mouse_cursor: ImageVector? = null

