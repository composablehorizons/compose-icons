package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretLeftSquare: ImageVector
    get() {
        if (_CaretLeftSquare != null) return _CaretLeftSquare!!
        
        _CaretLeftSquare = ImageVector.Builder(
            name = "caret-left-square",
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
                moveTo(10.205f, 12.456f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.5f, 12f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.832f, -0.374f)
                lineToRelative(-4.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.748f)
                lineToRelative(4.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.537f, 0.082f)
            }
        }.build()
        
        return _CaretLeftSquare!!
    }

private var _CaretLeftSquare: ImageVector? = null

