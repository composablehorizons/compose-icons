package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleLeftEllipsis != null) return _ChatBubbleLeftEllipsis!!
        
        _ChatBubbleLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-left-ellipsis",
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
                curveToRelative(0.848f, 0.137f, 1.705f, 0.248f, 2.57f, 0.331f)
                verticalLineToRelative(3.443f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, 0.53f)
                lineToRelative(3.58f, -3.579f)
                arcToRelative(0.78f, 0.78f, 0f, false, true, 0.527f, -0.224f)
                arcToRelative(41.202f, 41.202f, 0f, false, false, 5.183f, -0.5f)
                curveToRelative(1.437f, -0.232f, 2.43f, -1.49f, 2.43f, -2.903f)
                verticalLineTo(5.426f)
                curveToRelative(0f, -1.413f, -0.993f, -2.67f, -2.43f, -2.902f)
                arcTo(41.289f, 41.289f, 0f, false, false, 10f, 2f)
                close()
                moveToRelative(0f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveTo(8f, 8f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveToRelative(5f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftEllipsis!!
    }

private var _ChatBubbleLeftEllipsis: ImageVector? = null

