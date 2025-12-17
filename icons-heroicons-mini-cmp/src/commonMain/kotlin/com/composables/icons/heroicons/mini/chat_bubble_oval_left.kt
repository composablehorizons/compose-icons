package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_ChatBubbleOvalLeft != null) return _ChatBubbleOvalLeft!!
        
        _ChatBubbleOvalLeft = ImageVector.Builder(
            name = "chat-bubble-oval-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10f)
                curveToRelative(0f, -3.967f, 3.69f, -7f, 8f, -7f)
                curveToRelative(4.31f, 0f, 8f, 3.033f, 8f, 7f)
                reflectiveCurveToRelative(-3.69f, 7f, -8f, 7f)
                arcToRelative(9.165f, 9.165f, 0f, false, true, -1.504f, -0.123f)
                arcToRelative(5.976f, 5.976f, 0f, false, true, -3.935f, 1.107f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.584f, -1.143f)
                arcToRelative(3.478f, 3.478f, 0f, false, false, 0.522f, -1.756f)
                curveTo(2.979f, 13.825f, 2f, 12.025f, 2f, 10f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeft!!
    }

private var _ChatBubbleOvalLeft: ImageVector? = null

