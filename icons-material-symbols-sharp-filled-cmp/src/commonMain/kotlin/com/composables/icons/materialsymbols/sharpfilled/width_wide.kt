package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Width_wide: ImageVector
    get() {
        if (_Width_wide != null) return _Width_wide!!
        
        _Width_wide = ImageVector.Builder(
            name = "width_wide",
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
                horizontalLineToRelative(80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(560f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Width_wide!!
    }

private var _Width_wide: ImageVector? = null

