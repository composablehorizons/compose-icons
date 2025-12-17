package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretUpSquare: ImageVector
    get() {
        if (_CaretUpSquare != null) return _CaretUpSquare!!
        
        _CaretUpSquare = ImageVector.Builder(
            name = "caret-up-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.544f, 10.705f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 11f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.374f, -0.832f)
                lineToRelative(-4f, -4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.748f, 0f)
                lineToRelative(-4f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.082f, 0.537f)
            }
        }.build()
        
        return _CaretUpSquare!!
    }

private var _CaretUpSquare: ImageVector? = null

