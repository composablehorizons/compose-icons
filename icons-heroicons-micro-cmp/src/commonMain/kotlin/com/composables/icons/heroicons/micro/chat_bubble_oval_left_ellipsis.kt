package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleOvalLeftEllipsis != null) return _ChatBubbleOvalLeftEllipsis!!
        
        _ChatBubbleOvalLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-oval-left-ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveTo(4.262f, 2f, 1f, 4.57f, 1f, 8f)
                curveToRelative(0f, 1.86f, 0.98f, 3.486f, 2.455f, 4.566f)
                arcToRelative(3.472f, 3.472f, 0f, false, true, -0.469f, 1.26f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.713f, 1.14f)
                arcToRelative(6.961f, 6.961f, 0f, false, false, 3.06f, -1.06f)
                curveToRelative(0.403f, 0.062f, 0.818f, 0.094f, 1.241f, 0.094f)
                curveToRelative(3.738f, 0f, 7f, -2.57f, 7f, -6f)
                reflectiveCurveToRelative(-3.262f, -6f, -7f, -6f)
                close()
                moveTo(5f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(7f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveTo(8f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeftEllipsis!!
    }

private var _ChatBubbleOvalLeftEllipsis: ImageVector? = null

