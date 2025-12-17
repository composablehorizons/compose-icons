package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowUpRightSquare: ImageVector
    get() {
        if (_ArrowUpRightSquare != null) return _ArrowUpRightSquare!!
        
        _ArrowUpRightSquare = ImageVector.Builder(
            name = "arrow-up-right-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
                moveTo(5.904f, 10.803f)
                lineTo(10f, 6.707f)
                verticalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(6.525f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineToRelative(2.768f)
                lineToRelative(-4.096f, 4.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.707f)
            }
        }.build()
        
        return _ArrowUpRightSquare!!
    }

private var _ArrowUpRightSquare: ImageVector? = null

