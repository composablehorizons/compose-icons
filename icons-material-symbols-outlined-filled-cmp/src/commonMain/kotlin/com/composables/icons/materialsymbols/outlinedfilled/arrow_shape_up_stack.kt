package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_shape_up_stack: ImageVector
    get() {
        if (_Arrow_shape_up_stack != null) return _Arrow_shape_up_stack!!
        
        _Arrow_shape_up_stack = ImageVector.Builder(
            name = "arrow_shape_up_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                lineToRelative(320f, -360f)
                lineToRelative(320f, 360f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineTo(360f)
                close()
                moveTo(160f, 480f)
                lineToRelative(320f, -360f)
                lineToRelative(320f, 360f)
                horizontalLineTo(693f)
                lineTo(480f, 240f)
                lineTo(267f, 480f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Arrow_shape_up_stack!!
    }

private var _Arrow_shape_up_stack: ImageVector? = null

