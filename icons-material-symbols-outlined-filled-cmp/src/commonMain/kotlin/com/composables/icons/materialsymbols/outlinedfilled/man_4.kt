package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Man_4: ImageVector
    get() {
        if (_Man_4 != null) return _Man_4!!
        
        _Man_4 = ImageVector.Builder(
            name = "man_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                lineToRelative(-68f, -509f)
                quadToRelative(-5f, -36f, 19f, -63.5f)
                reflectiveQuadToRelative(60f, -27.5f)
                horizontalLineToRelative(138f)
                quadToRelative(36f, 0f, 60f, 27.5f)
                reflectiveQuadToRelative(19f, 63.5f)
                lineTo(560f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(80f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Man_4!!
    }

private var _Man_4: ImageVector? = null

