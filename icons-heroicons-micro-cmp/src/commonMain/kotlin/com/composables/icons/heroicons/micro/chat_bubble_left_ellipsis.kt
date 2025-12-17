package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleLeftEllipsis != null) return _ChatBubbleLeftEllipsis!!
        
        _ChatBubbleLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-left-ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.74f)
                curveToRelative(0f, 0.983f, 0.713f, 1.825f, 1.69f, 1.943f)
                curveToRelative(0.764f, 0.092f, 1.534f, 0.164f, 2.31f, 0.216f)
                verticalLineToRelative(2.351f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, 0.53f)
                lineToRelative(2.51f, -2.51f)
                curveToRelative(0.182f, -0.181f, 0.427f, -0.286f, 0.684f, -0.294f)
                arcToRelative(44.298f, 44.298f, 0f, false, false, 3.837f, -0.293f)
                curveTo(14.287f, 10.565f, 15f, 9.723f, 15f, 8.74f)
                verticalLineTo(4.26f)
                curveToRelative(0f, -0.983f, -0.713f, -1.825f, -1.69f, -1.943f)
                arcToRelative(44.447f, 44.447f, 0f, false, false, -10.62f, 0f)
                curveTo(1.712f, 2.435f, 1f, 3.277f, 1f, 4.26f)
                verticalLineToRelative(4.482f)
                close()
                moveTo(5.5f, 6.5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveToRelative(2.5f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(3.5f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftEllipsis!!
    }

private var _ChatBubbleLeftEllipsis: ImageVector? = null

