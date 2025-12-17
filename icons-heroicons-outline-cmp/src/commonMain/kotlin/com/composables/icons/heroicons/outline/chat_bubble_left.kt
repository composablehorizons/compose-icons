package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleLeft: ImageVector
    get() {
        if (_ChatBubbleLeft != null) return _ChatBubbleLeft!!
        
        _ChatBubbleLeft = ImageVector.Builder(
            name = "chat-bubble-left",
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
                moveTo(2.25f, 12.76f)
                curveToRelative(0f, 1.6f, 1.123f, 2.994f, 2.707f, 3.227f)
                curveToRelative(1.087f, 0.16f, 2.185f, 0.283f, 3.293f, 0.369f)
                verticalLineTo(21f)
                lineToRelative(4.076f, -4.076f)
                arcToRelative(1.526f, 1.526f, 0f, false, true, 1.037f, -0.443f)
                arcToRelative(48.282f, 48.282f, 0f, false, false, 5.68f, -0.494f)
                curveToRelative(1.584f, -0.233f, 2.707f, -1.626f, 2.707f, -3.228f)
                verticalLineTo(6.741f)
                curveToRelative(0f, -1.602f, -1.123f, -2.995f, -2.707f, -3.228f)
                arcTo(48.394f, 48.394f, 0f, false, false, 12f, 3f)
                curveToRelative(-2.392f, 0f, -4.744f, 0.175f, -7.043f, 0.513f)
                curveTo(3.373f, 3.746f, 2.25f, 5.14f, 2.25f, 6.741f)
                verticalLineToRelative(6.018f)
                close()
            }
        }.build()
        
        return _ChatBubbleLeft!!
    }

private var _ChatBubbleLeft: ImageVector? = null

