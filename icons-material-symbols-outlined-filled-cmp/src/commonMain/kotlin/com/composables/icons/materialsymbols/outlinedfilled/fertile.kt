package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fertile: ImageVector
    get() {
        if (_Fertile != null) return _Fertile!!
        
        _Fertile = ImageVector.Builder(
            name = "fertile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-380f)
                lineToRelative(241f, 181f)
                quadToRelative(31f, -47f, 70.5f, -97f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(45f, 50f, 86f, 101.5f)
                reflectiveQuadToRelative(72f, 99.5f)
                lineToRelative(242f, -181f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Fertile!!
    }

private var _Fertile: ImageVector? = null

