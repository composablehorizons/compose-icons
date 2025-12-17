package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Grid_view: ImageVector
    get() {
        if (_Grid_view != null) return _Grid_view!!
        
        _Grid_view = ImageVector.Builder(
            name = "grid_view",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 440f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Grid_view!!
    }

private var _Grid_view: ImageVector? = null

