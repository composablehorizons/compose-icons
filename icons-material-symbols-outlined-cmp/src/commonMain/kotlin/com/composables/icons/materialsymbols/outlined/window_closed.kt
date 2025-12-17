package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Window_closed: ImageVector
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
                moveToRelative(80f, -400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Window_closed!!
    }

private var _Window_closed: ImageVector? = null

