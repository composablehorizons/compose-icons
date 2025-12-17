package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleLeftRight: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(20.25f, 8.511f)
                curveToRelative(0.884f, 0.284f, 1.5f, 1.128f, 1.5f, 2.097f)
                verticalLineToRelative(4.286f)
                curveToRelative(0f, 1.136f, -0.847f, 2.1f, -1.98f, 2.193f)
                curveToRelative(-0.34f, 0.027f, -0.68f, 0.052f, -1.02f, 0.072f)
                verticalLineToRelative(3.091f)
                lineToRelative(-3f, -3f)
                curveToRelative(-1.354f, 0f, -2.694f, -0.055f, -4.02f, -0.163f)
                arcToRelative(2.115f, 2.115f, 0f, false, true, -0.825f, -0.242f)
                moveToRelative(9.345f, -8.334f)
                arcToRelative(2.126f, 2.126f, 0f, false, false, -0.476f, -0.095f)
                arcToRelative(48.64f, 48.64f, 0f, false, false, -8.048f, 0f)
                curveToRelative(-1.131f, 0.094f, -1.976f, 1.057f, -1.976f, 2.192f)
                verticalLineToRelative(4.286f)
                curveToRelative(0f, 0.837f, 0.46f, 1.58f, 1.155f, 1.951f)
                moveToRelative(9.345f, -8.334f)
                verticalLineTo(6.637f)
                curveToRelative(0f, -1.621f, -1.152f, -3.026f, -2.76f, -3.235f)
                arcTo(48.455f, 48.455f, 0f, false, false, 11.25f, 3f)
                curveToRelative(-2.115f, 0f, -4.198f, 0.137f, -6.24f, 0.402f)
                curveToRelative(-1.608f, 0.209f, -2.76f, 1.614f, -2.76f, 3.235f)
                verticalLineToRelative(6.226f)
                curveToRelative(0f, 1.621f, 1.152f, 3.026f, 2.76f, 3.235f)
                curveToRelative(0.577f, 0.075f, 1.157f, 0.14f, 1.74f, 0.194f)
                verticalLineTo(21f)
                lineToRelative(4.155f, -4.155f)
            }
        }.build()
        
        return _ChatBubbleLeftRight!!
    }

private var _ChatBubbleLeftRight: ImageVector? = null

