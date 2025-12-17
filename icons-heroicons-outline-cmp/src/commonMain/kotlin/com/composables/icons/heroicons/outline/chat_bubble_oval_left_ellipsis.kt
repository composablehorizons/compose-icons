package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleOvalLeftEllipsis != null) return _ChatBubbleOvalLeftEllipsis!!
        
        _ChatBubbleOvalLeftEllipsis = ImageVector.Builder(
            name = "chat-bubble-oval-left-ellipsis",
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
                moveTo(8.625f, 12f)
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
                moveTo(21f, 12f)
                curveToRelative(0f, 4.556f, -4.03f, 8.25f, -9f, 8.25f)
                arcToRelative(9.764f, 9.764f, 0f, false, true, -2.555f, -0.337f)
                arcTo(5.972f, 5.972f, 0f, false, true, 5.41f, 20.97f)
                arcToRelative(5.969f, 5.969f, 0f, false, true, -0.474f, -0.065f)
                arcToRelative(4.48f, 4.48f, 0f, false, false, 0.978f, -2.025f)
                curveToRelative(0.09f, -0.457f, -0.133f, -0.901f, -0.467f, -1.226f)
                curveTo(3.93f, 16.178f, 3f, 14.189f, 3f, 12f)
                curveToRelative(0f, -4.556f, 4.03f, -8.25f, 9f, -8.25f)
                reflectiveCurveToRelative(9f, 3.694f, 9f, 8.25f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeftEllipsis!!
    }

private var _ChatBubbleOvalLeftEllipsis: ImageVector? = null

