package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vertical_shades_closed: ImageVector
    get() {
        if (_Vertical_shades_closed != null) return _Vertical_shades_closed!!
        
        _Vertical_shades_closed = ImageVector.Builder(
            name = "vertical_shades_closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(140f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Vertical_shades_closed!!
    }

private var _Vertical_shades_closed: ImageVector? = null

