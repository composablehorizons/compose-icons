package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Brush: ImageVector
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
                lineToRelative(358f, -358f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(774f, 132f)
                lineToRelative(54f, 54f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(470f, 600f)
                close()
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

