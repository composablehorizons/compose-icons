package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) return _CaretRight!!
        
        _CaretRight = ImageVector.Builder(
            name = "caret-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12.796f)
                verticalLineTo(3.204f)
                lineTo(11.481f, 8f)
                close()
                moveToRelative(0.659f, 0.753f)
                lineToRelative(5.48f, -4.796f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.506f)
                lineTo(6.66f, 2.451f)
                curveTo(6.011f, 1.885f, 5f, 2.345f, 5f, 3.204f)
                verticalLineToRelative(9.592f)
                arcToRelative(1f, 1f, 0f, false, false, 1.659f, 0.753f)
            }
        }.build()
        
        return _CaretRight!!
    }

private var _CaretRight: ImageVector? = null

