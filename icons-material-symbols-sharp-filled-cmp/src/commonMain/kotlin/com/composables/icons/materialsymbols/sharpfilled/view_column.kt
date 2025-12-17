package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_column: ImageVector
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
                moveTo(120f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(560f)
                horizontalLineTo(373f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(560f)
                horizontalLineTo(626f)
                close()
            }
        }.build()
        
        return _View_column!!
    }

private var _View_column: ImageVector? = null

