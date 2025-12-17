package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Error_med: ImageVector
    get() {
        if (_Error_med != null) return _Error_med!!
        
        _Error_med = ImageVector.Builder(
            name = "error_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(443f, 598f)
                lineToRelative(74f, -101f)
                lineToRelative(73f, 101f)
                lineToRelative(130f, -177f)
                lineToRelative(-64f, -47f)
                lineToRelative(-66f, 89f)
                lineToRelative(-74f, -101f)
                lineToRelative(-73f, 101f)
                lineToRelative(-74f, -101f)
                lineToRelative(-129f, 177f)
                lineToRelative(64f, 47f)
                lineToRelative(65f, -89f)
                lineToRelative(74f, 101f)
                close()
                moveToRelative(37f, 282f)
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
        
        return _Error_med!!
    }

private var _Error_med: ImageVector? = null

