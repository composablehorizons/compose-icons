package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Group_work: ImageVector
    get() {
        if (_Group_work != null) return _Group_work!!
        
        _Group_work = ImageVector.Builder(
            name = "group_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 640f)
                close()
                moveToRelative(320f, 0f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(640f, 640f)
                close()
                moveTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 480f)
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
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Group_work!!
    }

private var _Group_work: ImageVector? = null

