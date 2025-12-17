package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleBottomCenterText: ImageVector
    get() {
        if (_ChatBubbleBottomCenterText != null) return _ChatBubbleBottomCenterText!!
        
        _ChatBubbleBottomCenterText = ImageVector.Builder(
            name = "chat-bubble-bottom-center-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                curveToRelative(-2.236f, 0f, -4.43f, 0.18f, -6.57f, 0.524f)
                curveTo(1.993f, 2.755f, 1f, 4.014f, 1f, 5.426f)
                verticalLineToRelative(5.148f)
                curveToRelative(0f, 1.413f, 0.993f, 2.67f, 2.43f, 2.902f)
                curveToRelative(1.168f, 0.188f, 2.352f, 0.327f, 3.55f, 0.414f)
                curveToRelative(0.28f, 0.02f, 0.521f, 0.18f, 0.642f, 0.413f)
                lineToRelative(1.713f, 3.293f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.33f, 0f)
                lineToRelative(1.713f, -3.293f)
                arcToRelative(0.783f, 0.783f, 0f, false, true, 0.642f, -0.413f)
                arcToRelative(41.102f, 41.102f, 0f, false, false, 3.55f, -0.414f)
                curveToRelative(1.437f, -0.231f, 2.43f, -1.49f, 2.43f, -2.902f)
                verticalLineTo(5.426f)
                curveToRelative(0f, -1.413f, -0.993f, -2.67f, -2.43f, -2.902f)
                arcTo(41.289f, 41.289f, 0f, false, false, 10f, 2f)
                close()
                moveTo(6.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveToRelative(0f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }.build()
        
        return _ChatBubbleBottomCenterText!!
    }

private var _ChatBubbleBottomCenterText: ImageVector? = null

