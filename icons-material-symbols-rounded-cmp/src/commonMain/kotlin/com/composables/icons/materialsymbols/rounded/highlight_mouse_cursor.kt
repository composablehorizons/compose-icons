package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Highlight_mouse_cursor: ImageVector
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
                moveTo(782f, 860f)
                lineTo(650f, 729f)
                lineToRelative(-30f, 91f)
                quadToRelative(-5f, 14f, -19f, 13.5f)
                reflectiveQuadTo(582f, 819f)
                lineToRelative(-91f, -303f)
                quadToRelative(-4f, -11f, 5f, -20f)
                reflectiveQuadToRelative(20f, -5f)
                lineToRelative(303f, 91f)
                quadToRelative(14f, 5f, 14.5f, 19f)
                reflectiveQuadTo(820f, 620f)
                lineToRelative(-91f, 30f)
                lineToRelative(132f, 132f)
                quadToRelative(17f, 17f, 17f, 39f)
                reflectiveQuadToRelative(-17f, 39f)
                quadToRelative(-17f, 17f, -39.5f, 17f)
                reflectiveQuadTo(782f, 860f)
                close()
                moveTo(480f, 160f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 126f, 83f, 216f)
                reflectiveQuadToRelative(208f, 102f)
                quadToRelative(17f, 2f, 29.5f, 15f)
                reflectiveQuadToRelative(11.5f, 30f)
                quadToRelative(-1f, 17f, -12.5f, 28f)
                reflectiveQuadTo(451f, 881f)
                quadToRelative(-78f, -5f, -145.5f, -39f)
                reflectiveQuadToRelative(-118f, -88.5f)
                quadToRelative(-50.5f, -54.5f, -79f, -125f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(157f, 0f, 273.5f, 107f)
                reflectiveQuadTo(881f, 451f)
                quadToRelative(2f, 16f, -9.5f, 27.5f)
                reflectiveQuadTo(843f, 491f)
                quadToRelative(-17f, 1f, -30.5f, -11f)
                reflectiveQuadTo(797f, 451f)
                quadToRelative(-15f, -120f, -104.5f, -205.5f)
                reflectiveQuadTo(480f, 160f)
                close()
            }
        }.build()
        
        return _Highlight_mouse_cursor!!
    }

private var _Highlight_mouse_cursor: ImageVector? = null

