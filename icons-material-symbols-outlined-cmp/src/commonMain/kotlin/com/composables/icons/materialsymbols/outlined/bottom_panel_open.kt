package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bottom_panel_open: ImageVector
    get() {
        if (_Bottom_panel_open != null) return _Bottom_panel_open!!
        
        _Bottom_panel_open = ImageVector.Builder(
            name = "bottom_panel_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 460f)
                horizontalLineToRelative(320f)
                lineTo(480f, 300f)
                lineTo(320f, 460f)
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
                moveToRelative(0f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Bottom_panel_open!!
    }

private var _Bottom_panel_open: ImageVector? = null

