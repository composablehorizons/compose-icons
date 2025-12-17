package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_left: ImageVector
    get() {
        if (_Arrow_left != null) return _Arrow_left!!
        
        _Arrow_left = ImageVector.Builder(
            name = "arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(526f, 646f)
                lineTo(381f, 501f)
                quadToRelative(-5f, -5f, -7f, -10f)
                reflectiveQuadToRelative(-2f, -11f)
                quadToRelative(0f, -6f, 2f, -11f)
                reflectiveQuadToRelative(7f, -10f)
                lineToRelative(145f, -145f)
                quadToRelative(3f, -3f, 6.5f, -4.5f)
                reflectiveQuadToRelative(7.5f, -1.5f)
                quadToRelative(8f, 0f, 14f, 5.5f)
                reflectiveQuadToRelative(6f, 14.5f)
                verticalLineToRelative(304f)
                quadToRelative(0f, 9f, -6f, 14.5f)
                reflectiveQuadToRelative(-14f, 5.5f)
                quadToRelative(-2f, 0f, -14f, -6f)
                close()
            }
        }.build()
        
        return _Arrow_left!!
    }

private var _Arrow_left: ImageVector? = null

