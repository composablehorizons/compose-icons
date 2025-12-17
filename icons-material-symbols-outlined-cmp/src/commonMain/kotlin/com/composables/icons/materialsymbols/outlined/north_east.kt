package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.North_east: ImageVector
    get() {
        if (_North_east != null) return _North_east!!
        
        _North_east = ImageVector.Builder(
            name = "north_east",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(464f, -464f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-264f)
                lineTo(216f, 800f)
                close()
            }
        }.build()
        
        return _North_east!!
    }

private var _North_east: ImageVector? = null

