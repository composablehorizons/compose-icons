package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChatRightQuote: ImageVector
    get() {
        if (_ChatRightQuote != null) return _ChatRightQuote!!
        
        _ChatRightQuote = ImageVector.Builder(
            name = "chat-right-quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(9.586f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, 0.586f)
                lineToRelative(2f, 2f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(12f, -1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12.793f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.854f, 0.353f)
                lineToRelative(-2.853f, -2.853f)
                arcToRelative(1f, 1f, 0f, false, false, -0.707f, -0.293f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.066f, 4.76f)
                arcTo(1.665f, 1.665f, 0f, false, false, 4f, 5.668f)
                arcToRelative(1.667f, 1.667f, 0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0f, true, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
                moveToRelative(4f, 0f)
                arcTo(1.665f, 1.665f, 0f, false, false, 8f, 5.668f)
                arcToRelative(1.667f, 1.667f, 0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0f, true, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
            }
        }.build()
        
        return _ChatRightQuote!!
    }

private var _ChatRightQuote: ImageVector? = null

