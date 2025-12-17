package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Dock_to_left: ImageVector
    get() {
        if (_Dock_to_left != null) return _Dock_to_left!!
        
        _Dock_to_left = ImageVector.Builder(
            name = "dock_to_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(440f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-560f)
                horizontalLineTo(640f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(360f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Dock_to_left!!
    }

private var _Dock_to_left: ImageVector? = null

