package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ChatSquareText: ImageVector
    get() {
        if (_ChatSquareText != null) return _ChatSquareText!!
        
        _ChatSquareText = ImageVector.Builder(
            name = "chat-square-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, 0.4f)
                lineToRelative(-1.9f, 2.533f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, 0f)
                lineTo(5.3f, 12.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, -0.4f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(3.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _ChatSquareText!!
    }

private var _ChatSquareText: ImageVector? = null

