package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_drop_down_circle: ImageVector
    get() {
        if (_Arrow_drop_down_circle != null) return _Arrow_drop_down_circle!!
        
        _Arrow_drop_down_circle = ImageVector.Builder(
            name = "arrow_drop_down_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(466f, 586f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(112f, -112f)
                quadToRelative(10f, -10f, 5f, -22f)
                reflectiveQuadToRelative(-19f, -12f)
                horizontalLineTo(368f)
                quadToRelative(-14f, 0f, -19f, 12f)
                reflectiveQuadToRelative(5f, 22f)
                lineToRelative(112f, 112f)
                close()
                moveToRelative(14f, 294f)
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
        
        return _Arrow_drop_down_circle!!
    }

private var _Arrow_drop_down_circle: ImageVector? = null

