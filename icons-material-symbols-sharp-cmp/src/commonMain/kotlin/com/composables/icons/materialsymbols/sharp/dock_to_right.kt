package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dock_to_right: ImageVector
    get() {
        if (_Dock_to_right != null) return _Dock_to_right!!
        
        _Dock_to_right = ImageVector.Builder(
            name = "dock_to_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
        
        return _Dock_to_right!!
    }

private var _Dock_to_right: ImageVector? = null

