package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CaretRightSquare: ImageVector
    get() {
        if (_CaretRightSquare != null) return _CaretRightSquare!!
        
        _CaretRightSquare = ImageVector.Builder(
            name = "caret-right-square",
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
                moveTo(5.795f, 12.456f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.5f, 12f)
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.832f, -0.374f)
                lineToRelative(4.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.748f)
                lineToRelative(-4.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.537f, 0.082f)
            }
        }.build()
        
        return _CaretRightSquare!!
    }

private var _CaretRightSquare: ImageVector? = null

