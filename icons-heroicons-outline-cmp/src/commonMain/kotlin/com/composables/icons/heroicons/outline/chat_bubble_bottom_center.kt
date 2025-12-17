package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleBottomCenter: ImageVector
    get() {
        if (_ChatBubbleBottomCenter != null) return _ChatBubbleBottomCenter!!
        
        _ChatBubbleBottomCenter = ImageVector.Builder(
            name = "chat-bubble-bottom-center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.25f, 12.76f)
                curveToRelative(0f, 1.6f, 1.123f, 2.994f, 2.707f, 3.227f)
                curveToRelative(1.068f, 0.157f, 2.148f, 0.279f, 3.238f, 0.364f)
                curveToRelative(0.466f, 0.037f, 0.893f, 0.281f, 1.153f, 0.671f)
                lineTo(12f, 21f)
                lineToRelative(2.652f, -3.978f)
                curveToRelative(0.26f, -0.39f, 0.687f, -0.634f, 1.153f, -0.67f)
                curveToRelative(1.09f, -0.086f, 2.17f, -0.208f, 3.238f, -0.365f)
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
        
        return _ChatBubbleBottomCenter!!
    }

private var _ChatBubbleBottomCenter: ImageVector? = null

