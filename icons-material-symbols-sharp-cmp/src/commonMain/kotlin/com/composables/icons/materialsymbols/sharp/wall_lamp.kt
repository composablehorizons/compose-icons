package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wall_lamp: ImageVector
    get() {
        if (_Wall_lamp != null) return _Wall_lamp!!
        
        _Wall_lamp = ImageVector.Builder(
            name = "wall_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(214f, -400f)
                horizontalLineToRelative(372f)
                lineToRelative(-72f, -240f)
                horizontalLineTo(406f)
                lineToRelative(-72f, 240f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(372f)
                horizontalLineToRelative(-372f)
                close()
                moveToRelative(-94f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(226f)
                lineToRelative(120f, -400f)
                horizontalLineToRelative(348f)
                lineToRelative(120f, 400f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Wall_lamp!!
    }

private var _Wall_lamp: ImageVector? = null

