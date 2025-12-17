package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_shape_up_stack_2: ImageVector
    get() {
        if (_Arrow_shape_up_stack_2 != null) return _Arrow_shape_up_stack_2!!
        
        _Arrow_shape_up_stack_2 = ImageVector.Builder(
            name = "arrow_shape_up_stack_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 920f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                lineToRelative(320f, -360f)
                lineToRelative(320f, 360f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(102f)
                lineTo(480f, 560f)
                lineTo(338f, 720f)
                horizontalLineToRelative(102f)
                verticalLineToRelative(120f)
                close()
                moveTo(160f, 600f)
                lineToRelative(320f, -360f)
                lineToRelative(320f, 360f)
                horizontalLineTo(693f)
                lineTo(480f, 360f)
                lineTo(267f, 600f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -200f)
                lineToRelative(320f, -360f)
                lineToRelative(320f, 360f)
                horizontalLineTo(693f)
                lineTo(480f, 160f)
                lineTo(267f, 400f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, 320f)
                close()
            }
        }.build()
        
        return _Arrow_shape_up_stack_2!!
    }

private var _Arrow_shape_up_stack_2: ImageVector? = null

