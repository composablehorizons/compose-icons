package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) return _CaretUp!!
        
        _CaretUp = ImageVector.Builder(
            name = "caret-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.247f, 4.86f)
                lineToRelative(-4.796f, 5.481f)
                curveToRelative(-0.566f, 0.647f, -0.106f, 1.659f, 0.753f, 1.659f)
                horizontalLineToRelative(9.592f)
                arcToRelative(1f, 1f, 0f, false, false, 0.753f, -1.659f)
                lineToRelative(-4.796f, -5.48f)
                arcToRelative(1f, 1f, 0f, false, false, -1.506f, 0f)
                close()
            }
        }.build()
        
        return _CaretUp!!
    }

private var _CaretUp: ImageVector? = null

