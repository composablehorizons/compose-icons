package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleLeft: ImageVector
    get() {
        if (_ChatBubbleLeft != null) return _ChatBubbleLeft!!
        
        _ChatBubbleLeft = ImageVector.Builder(
            name = "chat-bubble-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.43f, 2.524f)
                arcTo(41.29f, 41.29f, 0f, false, true, 10f, 2f)
                curveToRelative(2.236f, 0f, 4.43f, 0.18f, 6.57f, 0.524f)
                curveToRelative(1.437f, 0.231f, 2.43f, 1.49f, 2.43f, 2.902f)
                verticalLineToRelative(5.148f)
                curveToRelative(0f, 1.413f, -0.993f, 2.67f, -2.43f, 2.902f)
                arcToRelative(41.202f, 41.202f, 0f, false, true, -5.183f, 0.501f)
                arcToRelative(0.78f, 0.78f, 0f, false, false, -0.528f, 0.224f)
                lineToRelative(-3.579f, 3.58f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 17.25f)
                verticalLineToRelative(-3.443f)
                arcToRelative(41.033f, 41.033f, 0f, false, true, -2.57f, -0.33f)
                curveTo(1.993f, 13.244f, 1f, 11.986f, 1f, 10.573f)
                verticalLineTo(5.426f)
                curveToRelative(0f, -1.413f, 0.993f, -2.67f, 2.43f, -2.902f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeft!!
    }

private var _ChatBubbleLeft: ImageVector? = null

