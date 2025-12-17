package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Window_closed: ImageVector
    get() {
        if (_Window_closed != null) return _Window_closed!!
        
        _Window_closed = ImageVector.Builder(
            name = "window_closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-200f)
                horizontalLineTo(280f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-40f, 40f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Window_closed!!
    }

private var _Window_closed: ImageVector? = null

