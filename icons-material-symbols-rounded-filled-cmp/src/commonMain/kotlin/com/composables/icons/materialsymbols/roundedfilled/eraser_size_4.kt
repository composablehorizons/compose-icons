package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Eraser_size_4: ImageVector
    get() {
        if (_Eraser_size_4 != null) return _Eraser_size_4!!
        
        _Eraser_size_4 = ImageVector.Builder(
            name = "eraser_size_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 800f)
                quadToRelative(-98f, 0f, -167f, -69f)
                reflectiveQuadToRelative(-69f, -167f)
                quadToRelative(0f, -46f, 17f, -89.5f)
                reflectiveQuadToRelative(52f, -78.5f)
                lineToRelative(167f, -167f)
                quadToRelative(35f, -35f, 78.5f, -52f)
                reflectiveQuadToRelative(89.5f, -17f)
                quadToRelative(98f, 0f, 167f, 69f)
                reflectiveQuadToRelative(69f, 167f)
                quadToRelative(0f, 46f, -17f, 89.5f)
                reflectiveQuadTo(731f, 564f)
                lineTo(564f, 731f)
                quadToRelative(-35f, 35f, -78.5f, 52f)
                reflectiveQuadTo(396f, 800f)
                close()
            }
        }.build()
        
        return _Eraser_size_4!!
    }

private var _Eraser_size_4: ImageVector? = null

