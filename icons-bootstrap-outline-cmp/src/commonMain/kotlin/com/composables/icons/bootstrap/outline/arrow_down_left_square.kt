package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowDownLeftSquare: ImageVector
    get() {
        if (_ArrowDownLeftSquare != null) return _ArrowDownLeftSquare!!
        
        _ArrowDownLeftSquare = ImageVector.Builder(
            name = "arrow-down-left-square",
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
                moveToRelative(10.096f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineTo(6.707f, 9.95f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(6.475f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                verticalLineToRelative(2.768f)
                close()
            }
        }.build()
        
        return _ArrowDownLeftSquare!!
    }

private var _ArrowDownLeftSquare: ImageVector? = null

