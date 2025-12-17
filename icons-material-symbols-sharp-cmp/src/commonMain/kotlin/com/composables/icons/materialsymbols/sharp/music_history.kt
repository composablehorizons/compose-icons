package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Music_history: ImageVector
    get() {
        if (_Music_history != null) return _Music_history!!
        
        _Music_history = ImageVector.Builder(
            name = "music_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 680f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(17f, 0f, 32f, 5f)
                reflectiveQuadToRelative(28f, 15f)
                verticalLineToRelative(-220f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(60f, 200f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 66f, 25f, 124.5f)
                reflectiveQuadToRelative(68.5f, 102f)
                quadToRelative(43.5f, 43.5f, 102f, 69f)
                reflectiveQuadTo(480f, 801f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-89f, 0f, -161.5f, 43.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(55f, -73f, 138f, -116.5f)
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
            }
        }.build()
        
        return _Music_history!!
    }

private var _Music_history: ImageVector? = null

