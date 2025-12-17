package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleLeftEllipsis: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(8.625f, 9.75f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(8.25f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(12f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-0.375f)
                moveToRelative(-13.5f, 3.01f)
                curveToRelative(0f, 1.6f, 1.123f, 2.994f, 2.707f, 3.227f)
                curveToRelative(1.087f, 0.16f, 2.185f, 0.283f, 3.293f, 0.369f)
                verticalLineTo(21f)
                lineToRelative(4.184f, -4.183f)
                arcToRelative(1.14f, 1.14f, 0f, false, true, 0.778f, -0.332f)
                arcToRelative(48.294f, 48.294f, 0f, false, false, 5.83f, -0.498f)
                curveToRelative(1.585f, -0.233f, 2.708f, -1.626f, 2.708f, -3.228f)
                verticalLineTo(6.741f)
                curveToRelative(0f, -1.602f, -1.123f, -2.995f, -2.707f, -3.228f)
                arcTo(48.394f, 48.394f, 0f, false, false, 12f, 3f)
                curveToRelative(-2.392f, 0f, -4.744f, 0.175f, -7.043f, 0.513f)
                curveTo(3.373f, 3.746f, 2.25f, 5.14f, 2.25f, 6.741f)
                verticalLineToRelative(6.018f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeftEllipsis!!
    }

private var _ChatBubbleLeftEllipsis: ImageVector? = null

