package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleBottomCenter: ImageVector
    get() {
        if (_ChatBubbleBottomCenter != null) return _ChatBubbleBottomCenter!!
        
        _ChatBubbleBottomCenter = ImageVector.Builder(
            name = "chat-bubble-bottom-center",
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
                arcToRelative(41.102f, 41.102f, 0f, false, true, -3.55f, 0.414f)
                curveToRelative(-0.28f, 0.02f, -0.521f, 0.18f, -0.643f, 0.413f)
                lineToRelative(-1.712f, 3.293f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.33f, 0f)
                lineToRelative(-1.713f, -3.293f)
                arcToRelative(0.783f, 0.783f, 0f, false, false, -0.642f, -0.413f)
                arcToRelative(41.108f, 41.108f, 0f, false, true, -3.55f, -0.414f)
                curveTo(1.993f, 13.245f, 1f, 11.986f, 1f, 10.574f)
                verticalLineTo(5.426f)
                curveToRelative(0f, -1.413f, 0.993f, -2.67f, 2.43f, -2.902f)
                close()
            }
        }.build()
        
        return _ChatBubbleBottomCenter!!
    }

private var _ChatBubbleBottomCenter: ImageVector? = null

