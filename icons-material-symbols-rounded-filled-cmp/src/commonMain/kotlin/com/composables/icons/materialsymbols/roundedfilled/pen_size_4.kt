package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pen_size_4: ImageVector
    get() {
        if (_Pen_size_4 != null) return _Pen_size_4!!
        
        _Pen_size_4 = ImageVector.Builder(
            name = "pen_size_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(229f, 731f)
                quadToRelative(-29f, -29f, -29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                lineToRelative(360f, -360f)
                quadToRelative(29f, -29f, 71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                quadToRelative(29f, 29f, 29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                lineTo(371f, 731f)
                quadToRelative(-29f, 29f, -71f, 29f)
                reflectiveQuadToRelative(-71f, -29f)
                close()
            }
        }.build()
        
        return _Pen_size_4!!
    }

private var _Pen_size_4: ImageVector? = null

