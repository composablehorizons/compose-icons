package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Side_navigation: ImageVector
    get() {
        if (_Side_navigation != null) return _Side_navigation!!
        
        _Side_navigation = ImageVector.Builder(
            name = "side_navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-560f)
                horizontalLineTo(480f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Side_navigation!!
    }

private var _Side_navigation: ImageVector? = null

