package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Left_panel_open: ImageVector
    get() {
        if (_Left_panel_open != null) return _Left_panel_open!!
        
        _Left_panel_open = ImageVector.Builder(
            name = "left_panel_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 320f)
                verticalLineToRelative(320f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineTo(200f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(-200f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Left_panel_open!!
    }

private var _Left_panel_open: ImageVector? = null

