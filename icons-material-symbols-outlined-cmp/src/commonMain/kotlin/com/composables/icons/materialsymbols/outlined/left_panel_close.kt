package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Left_panel_close: ImageVector
    get() {
        if (_Left_panel_close != null) return _Left_panel_close!!
        
        _Left_panel_close = ImageVector.Builder(
            name = "left_panel_close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 640f)
                verticalLineToRelative(-320f)
                lineTo(500f, 480f)
                lineToRelative(160f, 160f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(120f, -80f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-560f)
                horizontalLineTo(400f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineTo(200f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Left_panel_close!!
    }

private var _Left_panel_close: ImageVector? = null

