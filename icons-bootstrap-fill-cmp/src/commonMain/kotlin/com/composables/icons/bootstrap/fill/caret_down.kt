package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) return _CaretDown!!
        
        _CaretDown = ImageVector.Builder(
            name = "caret-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.247f, 11.14f)
                lineTo(2.451f, 5.658f)
                curveTo(1.885f, 5.013f, 2.345f, 4f, 3.204f, 4f)
                horizontalLineToRelative(9.592f)
                arcToRelative(1f, 1f, 0f, false, true, 0.753f, 1.659f)
                lineToRelative(-4.796f, 5.48f)
                arcToRelative(1f, 1f, 0f, false, true, -1.506f, 0f)
                close()
            }
        }.build()
        
        return _CaretDown!!
    }

private var _CaretDown: ImageVector? = null

