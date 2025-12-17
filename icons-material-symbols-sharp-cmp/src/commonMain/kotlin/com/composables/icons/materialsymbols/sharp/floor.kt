package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Floor: ImageVector
    get() {
        if (_Floor != null) return _Floor!!
        
        _Floor = ImageVector.Builder(
            name = "floor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(220f)
                horizontalLineTo(700f)
                verticalLineToRelative(180f)
                horizontalLineTo(520f)
                verticalLineToRelative(180f)
                horizontalLineTo(340f)
                verticalLineToRelative(180f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Floor!!
    }

private var _Floor: ImageVector? = null

