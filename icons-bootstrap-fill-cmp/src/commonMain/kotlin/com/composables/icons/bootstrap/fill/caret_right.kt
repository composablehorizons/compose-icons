package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CaretRight: ImageVector
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
                moveTo(12.14f, 8.753f)
                lineToRelative(-5.482f, 4.796f)
                curveToRelative(-0.646f, 0.566f, -1.658f, 0.106f, -1.658f, -0.753f)
                verticalLineTo(3.204f)
                arcToRelative(1f, 1f, 0f, false, true, 1.659f, -0.753f)
                lineToRelative(5.48f, 4.796f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.506f)
                close()
            }
        }.build()
        
        return _CaretRight!!
    }

private var _CaretRight: ImageVector? = null

