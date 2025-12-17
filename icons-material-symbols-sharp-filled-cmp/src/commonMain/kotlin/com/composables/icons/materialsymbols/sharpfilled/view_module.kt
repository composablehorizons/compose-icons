package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_module: ImageVector
    get() {
        if (_View_module != null) return _View_module!!
        
        _View_module = ImageVector.Builder(
            name = "view_module",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(627f, 460f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(627f)
                close()
                moveToRelative(-253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(374f)
                close()
                moveToRelative(-253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(121f)
                close()
                moveToRelative(0f, 300f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(121f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(374f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(627f)
                close()
            }
        }.build()
        
        return _View_module!!
    }

private var _View_module: ImageVector? = null

