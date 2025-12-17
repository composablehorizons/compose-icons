package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_ChatBubbleOvalLeft != null) return _ChatBubbleOvalLeft!!
        
        _ChatBubbleOvalLeft = ImageVector.Builder(
            name = "chat-bubble-oval-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                curveToRelative(0f, -3.43f, 3.262f, -6f, 7f, -6f)
                reflectiveCurveToRelative(7f, 2.57f, 7f, 6f)
                reflectiveCurveToRelative(-3.262f, 6f, -7f, 6f)
                curveToRelative(-0.423f, 0f, -0.838f, -0.032f, -1.241f, -0.094f)
                curveToRelative(-0.9f, 0.574f, -1.941f, 0.948f, -3.06f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.713f, -1.14f)
                curveToRelative(0.232f, -0.378f, 0.395f, -0.804f, 0.469f, -1.26f)
                curveTo(1.979f, 11.486f, 1f, 9.86f, 1f, 8f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeft!!
    }

private var _ChatBubbleOvalLeft: ImageVector? = null

