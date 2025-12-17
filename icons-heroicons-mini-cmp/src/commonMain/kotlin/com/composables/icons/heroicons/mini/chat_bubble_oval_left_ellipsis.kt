package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleOvalLeftEllipsis != null) return _ChatBubbleOvalLeftEllipsis!!
        
        _ChatBubbleOvalLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-oval-left-ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                curveToRelative(-4.31f, 0f, -8f, 3.033f, -8f, 7f)
                curveToRelative(0f, 2.024f, 0.978f, 3.825f, 2.499f, 5.085f)
                arcToRelative(3.478f, 3.478f, 0f, false, true, -0.522f, 1.756f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.584f, 1.143f)
                arcToRelative(5.976f, 5.976f, 0f, false, false, 3.936f, -1.108f)
                curveToRelative(0.487f, 0.082f, 0.99f, 0.124f, 1.503f, 0.124f)
                curveToRelative(4.31f, 0f, 8f, -3.033f, 8f, -7f)
                reflectiveCurveToRelative(-3.69f, -7f, -8f, -7f)
                close()
                moveToRelative(0f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(-2f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveToRelative(5f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeftEllipsis!!
    }

private var _ChatBubbleOvalLeftEllipsis: ImageVector? = null

