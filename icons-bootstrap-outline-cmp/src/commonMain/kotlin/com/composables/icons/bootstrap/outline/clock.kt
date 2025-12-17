package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Clock: ImageVector
    get() {
        if (_Clock != null) return _Clock!!
        
        _Clock = ImageVector.Builder(
            name = "clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.252f, 0.434f)
                lineToRelative(3.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.496f, -0.868f)
                lineTo(8f, 8.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(7f, -8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
            }
        }.build()
        
        return _Clock!!
    }

private var _Clock: ImageVector? = null

