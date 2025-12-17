package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Grid_on: ImageVector
    get() {
        if (_Grid_on != null) return _Grid_on!!
        
        _Grid_on = ImageVector.Builder(
            name = "grid_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-133f)
                horizontalLineTo(200f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-133f)
                horizontalLineTo(413f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-133f)
                horizontalLineTo(627f)
                verticalLineToRelative(133f)
                close()
                moveTo(200f, 547f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-134f)
                horizontalLineTo(200f)
                verticalLineToRelative(134f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-134f)
                horizontalLineTo(413f)
                verticalLineToRelative(134f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-134f)
                horizontalLineTo(627f)
                verticalLineToRelative(134f)
                close()
                moveTo(200f, 333f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-133f)
                horizontalLineTo(200f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-133f)
                horizontalLineTo(413f)
                verticalLineToRelative(133f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-133f)
                horizontalLineTo(627f)
                verticalLineToRelative(133f)
                close()
            }
        }.build()
        
        return _Grid_on!!
    }

private var _Grid_on: ImageVector? = null

