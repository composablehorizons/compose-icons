package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowUpRightSquare: ImageVector
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
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5.854f, 8.803f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.707f)
                lineTo(9.243f, 6f)
                horizontalLineTo(6.475f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                verticalLineTo(6.707f)
                close()
            }
        }.build()
        
        return _ArrowUpRightSquare!!
    }

private var _ArrowUpRightSquare: ImageVector? = null

