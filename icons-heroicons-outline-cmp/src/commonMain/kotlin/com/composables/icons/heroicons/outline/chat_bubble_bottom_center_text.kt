package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleBottomCenterText: ImageVector
    get() {
        if (_ChatBubbleBottomCenterText != null) return _ChatBubbleBottomCenterText!!
        
        _ChatBubbleBottomCenterText = ImageVector.Builder(
            name = "chat-bubble-bottom-center-text",
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
                moveTo(7.5f, 8.25f)
                horizontalLineToRelative(9f)
                moveToRelative(-9f, 3f)
                horizontalLineTo(12f)
                moveToRelative(-9.75f, 1.51f)
                curveToRelative(0f, 1.6f, 1.123f, 2.994f, 2.707f, 3.227f)
                curveToRelative(1.129f, 0.166f, 2.27f, 0.293f, 3.423f, 0.379f)
                curveToRelative(0.35f, 0.026f, 0.67f, 0.21f, 0.865f, 0.501f)
                lineTo(12f, 21f)
                lineToRelative(2.755f, -4.133f)
                arcToRelative(1.14f, 1.14f, 0f, false, true, 0.865f, -0.501f)
                arcToRelative(48.172f, 48.172f, 0f, false, false, 3.423f, -0.379f)
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
        
        return _ChatBubbleBottomCenterText!!
    }

private var _ChatBubbleBottomCenterText: ImageVector? = null

