package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Label: ImageVector
    get() {
        if (_Label != null) return _Label!!
        
        _Label = ImageVector.Builder(
            name = "label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(807f, 526f)
                lineTo(666f, 726f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(400f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(141f, 200f)
                quadToRelative(15f, 21f, 15f, 46f)
                reflectiveQuadToRelative(-15f, 46f)
                close()
                moveTo(600f, 680f)
                lineToRelative(142f, -200f)
                lineToRelative(-142f, -200f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                close()
                moveTo(200f, 280f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Label!!
    }

private var _Label: ImageVector? = null

