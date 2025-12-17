package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChatBubbleLeftRight: ImageVector
    get() {
        if (_ChatBubbleLeftRight != null) return _ChatBubbleLeftRight!!
        
        _ChatBubbleLeftRight = ImageVector.Builder(
            name = "chat-bubble-left-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.913f, 2.658f)
                curveToRelative(2.075f, -0.27f, 4.19f, -0.408f, 6.337f, -0.408f)
                curveToRelative(2.147f, 0f, 4.262f, 0.139f, 6.337f, 0.408f)
                curveToRelative(1.922f, 0.25f, 3.291f, 1.861f, 3.405f, 3.727f)
                arcToRelative(4.403f, 4.403f, 0f, false, false, -1.032f, -0.211f)
                arcToRelative(50.89f, 50.89f, 0f, false, false, -8.42f, 0f)
                curveToRelative(-2.358f, 0.196f, -4.04f, 2.19f, -4.04f, 4.434f)
                verticalLineToRelative(4.286f)
                arcToRelative(4.47f, 4.47f, 0f, false, false, 2.433f, 3.984f)
                lineTo(7.28f, 21.53f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 21f)
                verticalLineToRelative(-4.03f)
                arcToRelative(48.527f, 48.527f, 0f, false, true, -1.087f, -0.128f)
                curveTo(2.905f, 16.58f, 1.5f, 14.833f, 1.5f, 12.862f)
                verticalLineTo(6.638f)
                curveToRelative(0f, -1.97f, 1.405f, -3.718f, 3.413f, -3.979f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 7.5f)
                curveToRelative(-1.376f, 0f, -2.739f, 0.057f, -4.086f, 0.169f)
                curveTo(10.124f, 7.797f, 9f, 9.103f, 9f, 10.609f)
                verticalLineToRelative(4.285f)
                curveToRelative(0f, 1.507f, 1.128f, 2.814f, 2.67f, 2.94f)
                curveToRelative(1.243f, 0.102f, 2.5f, 0.157f, 3.768f, 0.165f)
                lineToRelative(2.782f, 2.781f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, -0.53f)
                verticalLineToRelative(-2.39f)
                lineToRelative(0.33f, -0.026f)
                curveToRelative(1.542f, -0.125f, 2.67f, -1.433f, 2.67f, -2.94f)
                verticalLineToRelative(-4.286f)
                curveToRelative(0f, -1.505f, -1.125f, -2.811f, -2.664f, -2.94f)
                arcTo(49.392f, 49.392f, 0f, false, false, 15.75f, 7.5f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftRight!!
    }

private var _ChatBubbleLeftRight: ImageVector? = null

