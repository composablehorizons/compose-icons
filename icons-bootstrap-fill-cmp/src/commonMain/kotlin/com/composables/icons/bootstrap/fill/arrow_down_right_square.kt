package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowDownRightSquare: ImageVector
    get() {
        if (_ArrowDownRightSquare != null) return _ArrowDownRightSquare!!
        
        _ArrowDownRightSquare = ImageVector.Builder(
            name = "arrow-down-right-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
                moveTo(5.904f, 5.197f)
                lineTo(10f, 9.293f)
                verticalLineTo(6.525f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(6.525f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.768f)
                lineTo(5.197f, 5.904f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
            }
        }.build()
        
        return _ArrowDownRightSquare!!
    }

private var _ArrowDownRightSquare: ImageVector? = null

