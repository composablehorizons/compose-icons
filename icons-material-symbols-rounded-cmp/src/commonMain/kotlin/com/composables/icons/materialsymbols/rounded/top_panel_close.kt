package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Top_panel_close: ImageVector
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
                moveTo(452f, 528f)
                lineToRelative(-98f, 98f)
                quadToRelative(-10f, 10f, -5f, 22f)
                reflectiveQuadToRelative(19f, 12f)
                horizontalLineToRelative(224f)
                quadToRelative(14f, 0f, 19f, -12f)
                reflectiveQuadToRelative(-5f, -22f)
                lineToRelative(-98f, -98f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
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
                moveToRelative(560f, -520f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(-560f, 80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Top_panel_close!!
    }

private var _Top_panel_close: ImageVector? = null

