package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bottom_panel_close: ImageVector
    get() {
        if (_Bottom_panel_close != null) return _Bottom_panel_close!!
        
        _Bottom_panel_close = ImageVector.Builder(
            name = "bottom_panel_close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 460f)
                lineToRelative(160f, -160f)
                horizontalLineTo(320f)
                lineToRelative(160f, 160f)
                close()
                moveTo(200f, 560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-80f, 280f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Bottom_panel_close!!
    }

private var _Bottom_panel_close: ImageVector? = null

