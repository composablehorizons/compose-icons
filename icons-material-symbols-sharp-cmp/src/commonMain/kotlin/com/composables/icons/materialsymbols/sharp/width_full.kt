package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Width_full: ImageVector
    get() {
        if (_Width_full != null) return _Width_full!!
        
        _Width_full = ImageVector.Builder(
            name = "width_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                close()
                moveTo(280f, 240f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Width_full!!
    }

private var _Width_full: ImageVector? = null

