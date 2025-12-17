package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChatBubbleLeftRight: ImageVector
    get() {
        if (_ChatBubbleLeftRight != null) return _ChatBubbleLeftRight!!
        
        _ChatBubbleLeftRight = ImageVector.Builder(
            name = "chat-bubble-left-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.849f)
                curveToRelative(0f, 1f, 0.738f, 1.851f, 1.734f, 1.947f)
                lineTo(3f, 10.82f)
                verticalLineToRelative(2.429f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, 0.53f)
                lineToRelative(1.82f, -1.82f)
                arcTo(3.484f, 3.484f, 0f, false, true, 5.5f, 10f)
                verticalLineTo(9f)
                arcTo(3.5f, 3.5f, 0f, false, true, 9f, 5.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(4.151f)
                curveToRelative(0f, -1f, -0.739f, -1.851f, -1.734f, -1.947f)
                arcToRelative(44.539f, 44.539f, 0f, false, false, -8.532f, 0f)
                curveTo(1.738f, 2.3f, 1f, 3.151f, 1f, 4.151f)
                verticalLineTo(8.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.28f, 0.53f)
                lineTo(9.69f, 12f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftRight!!
    }

private var _ChatBubbleLeftRight: ImageVector? = null

