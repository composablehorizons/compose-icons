package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Brush: ImageVector
    get() {
        if (_Brush != null) return _Brush!!
        
        _Brush = ImageVector.Builder(
            name = "brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-45f, 0f, -89f, -22f)
                reflectiveQuadToRelative(-71f, -58f)
                quadToRelative(26f, 0f, 53f, -20.5f)
                reflectiveQuadToRelative(27f, -59.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(230f, -240f)
                lineTo(360f, 490f)
                lineToRelative(386f, -386f)
                lineToRelative(110f, 110f)
                lineToRelative(-386f, 386f)
                close()
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

