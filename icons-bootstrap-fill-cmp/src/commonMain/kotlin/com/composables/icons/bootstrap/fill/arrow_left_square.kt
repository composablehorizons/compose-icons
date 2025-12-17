package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowLeftSquare: ImageVector
    get() {
        if (_ArrowLeftSquare != null) return _ArrowLeftSquare!!
        
        _ArrowLeftSquare = ImageVector.Builder(
            name = "arrow-left-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
                moveToRelative(-4.5f, -6.5f)
                horizontalLineTo(5.707f)
                lineToRelative(2.147f, -2.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(5.707f, 8.5f)
                horizontalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
            }
        }.build()
        
        return _ArrowLeftSquare!!
    }

private var _ArrowLeftSquare: ImageVector? = null

