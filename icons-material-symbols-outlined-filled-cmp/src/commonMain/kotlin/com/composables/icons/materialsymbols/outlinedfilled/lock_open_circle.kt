package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Lock_open_circle: ImageVector
    get() {
        if (_Lock_open_circle != null) return _Lock_open_circle!!
        
        _Lock_open_circle = ImageVector.Builder(
            name = "lock_open_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 640f)
                horizontalLineToRelative(200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 580f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(580f, 400f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 340f)
                verticalLineToRelative(60f)
                horizontalLineTo(380f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 460f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 640f)
                close()
                moveTo(480f, 880f)
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
            }
        }.build()
        
        return _Lock_open_circle!!
    }

private var _Lock_open_circle: ImageVector? = null

