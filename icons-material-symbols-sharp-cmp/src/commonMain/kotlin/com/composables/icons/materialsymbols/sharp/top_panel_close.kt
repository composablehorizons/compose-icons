package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Top_panel_close: ImageVector
    get() {
        if (_Top_panel_close != null) return _Top_panel_close!!
        
        _Top_panel_close = ImageVector.Builder(
            name = "top_panel_close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 660f)
                horizontalLineToRelative(320f)
                lineTo(480f, 500f)
                lineTo(320f, 660f)
                close()
                moveTo(200f, 320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, -440f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-80f, 520f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Top_panel_close!!
    }

private var _Top_panel_close: ImageVector? = null

