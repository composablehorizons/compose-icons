package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.North_west: ImageVector
    get() {
        if (_North_west != null) return _North_west!!
        
        _North_west = ImageVector.Builder(
            name = "north_west",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(744f, 800f)
                lineTo(280f, 336f)
                verticalLineToRelative(264f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(336f)
                lineToRelative(464f, 464f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _North_west!!
    }

private var _North_west: ImageVector? = null

