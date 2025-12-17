package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_column: ImageVector
    get() {
        if (_View_column != null) return _View_column!!
        
        _View_column = ImageVector.Builder(
            name = "view_column",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(121f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(719f)
                verticalLineToRelative(560f)
                horizontalLineTo(121f)
                close()
                moveToRelative(79f, -80f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-400f)
                horizontalLineTo(413f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-400f)
                horizontalLineTo(626f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _View_column!!
    }

private var _View_column: ImageVector? = null

