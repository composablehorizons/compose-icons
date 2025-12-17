package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Eraser_size_2: ImageVector
    get() {
        if (_Eraser_size_2 != null) return _Eraser_size_2!!
        
        _Eraser_size_2 = ImageVector.Builder(
            name = "eraser_size_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(310f, 770f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -23f, 9f, -45.5f)
                reflectiveQuadToRelative(26f, -39.5f)
                lineToRelative(340f, -340f)
                quadToRelative(17f, -17f, 39.5f, -26f)
                reflectiveQuadToRelative(45.5f, -9f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 23f, -9f, 45.5f)
                reflectiveQuadTo(735f, 395f)
                lineTo(395f, 735f)
                quadToRelative(-17f, 17f, -39.5f, 26f)
                reflectiveQuadToRelative(-45.5f, 9f)
                close()
            }
        }.build()
        
        return _Eraser_size_2!!
    }

private var _Eraser_size_2: ImageVector? = null

