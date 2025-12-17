package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChatLeftQuote: ImageVector
    get() {
        if (_ChatLeftQuote != null) return _ChatLeftQuote!!
        
        _ChatLeftQuote = ImageVector.Builder(
            name = "chat-left-quote",
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
                horizontalLineTo(4.414f)
                arcTo(2f, 2f, 0f, false, false, 3f, 11.586f)
                lineToRelative(-2f, 2f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12.793f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.854f, 0.353f)
                lineToRelative(2.853f, -2.853f)
                arcTo(1f, 1f, 0f, false, true, 4.414f, 12f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
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
        
        return _ChatLeftQuote!!
    }

private var _ChatLeftQuote: ImageVector? = null

