package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChatSquare: ImageVector
    get() {
        if (_ChatSquare != null) return _ChatSquare!!
        
        _ChatSquare = ImageVector.Builder(
            name = "chat-square",
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
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.6f, 0.8f)
                lineTo(8f, 14.333f)
                lineTo(6.1f, 11.8f)
                arcToRelative(2f, 2f, 0f, false, false, -1.6f, -0.8f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.8f, 0.4f)
                lineToRelative(1.9f, 2.533f)
                arcToRelative(1f, 1f, 0f, false, false, 1.6f, 0f)
                lineToRelative(1.9f, -2.533f)
                arcToRelative(1f, 1f, 0f, false, true, 0.8f, -0.4f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _ChatSquare!!
    }

private var _ChatSquare: ImageVector? = null

