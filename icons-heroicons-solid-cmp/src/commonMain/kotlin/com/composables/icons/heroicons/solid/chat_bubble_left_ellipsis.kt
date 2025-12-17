package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleLeftEllipsis != null) return _ChatBubbleLeftEllipsis!!
        
        _ChatBubbleLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-left-ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-2.429f, 0f, -4.817f, 0.178f, -7.152f, 0.521f)
                curveTo(2.87f, 3.061f, 1.5f, 4.795f, 1.5f, 6.741f)
                verticalLineToRelative(6.018f)
                curveToRelative(0f, 1.946f, 1.37f, 3.68f, 3.348f, 3.97f)
                curveToRelative(0.877f, 0.129f, 1.761f, 0.234f, 2.652f, 0.316f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, 0.53f)
                lineToRelative(4.184f, -4.183f)
                arcToRelative(0.39f, 0.39f, 0f, false, true, 0.266f, -0.112f)
                curveToRelative(2.006f, -0.05f, 3.982f, -0.22f, 5.922f, -0.506f)
                curveToRelative(1.978f, -0.29f, 3.348f, -2.023f, 3.348f, -3.97f)
                verticalLineTo(6.741f)
                curveToRelative(0f, -1.947f, -1.37f, -3.68f, -3.348f, -3.97f)
                arcTo(49.145f, 49.145f, 0f, false, false, 12f, 2.25f)
                close()
                moveTo(8.25f, 8.625f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
                moveToRelative(2.625f, 1.125f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
                moveToRelative(4.875f, -1.125f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftEllipsis!!
    }

private var _ChatBubbleLeftEllipsis: ImageVector? = null

