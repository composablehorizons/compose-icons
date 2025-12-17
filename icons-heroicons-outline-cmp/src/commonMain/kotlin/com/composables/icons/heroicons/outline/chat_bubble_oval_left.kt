package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ChatBubbleOvalLeft: ImageVector
    get() {
        if (_ChatBubbleOvalLeft != null) return _ChatBubbleOvalLeft!!
        
        _ChatBubbleOvalLeft = ImageVector.Builder(
            name = "chat-bubble-oval-left",
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
                moveTo(12f, 20.25f)
                curveToRelative(4.97f, 0f, 9f, -3.694f, 9f, -8.25f)
                reflectiveCurveToRelative(-4.03f, -8.25f, -9f, -8.25f)
                reflectiveCurveTo(3f, 7.444f, 3f, 12f)
                curveToRelative(0f, 2.104f, 0.859f, 4.023f, 2.273f, 5.48f)
                curveToRelative(0.432f, 0.447f, 0.74f, 1.04f, 0.586f, 1.641f)
                arcToRelative(4.483f, 4.483f, 0f, false, true, -0.923f, 1.785f)
                arcTo(5.969f, 5.969f, 0f, false, false, 6f, 21f)
                curveToRelative(1.282f, 0f, 2.47f, -0.402f, 3.445f, -1.087f)
                curveToRelative(0.81f, 0.22f, 1.668f, 0.337f, 2.555f, 0.337f)
                close()
            }
        }.build()
        
        return _ChatBubbleOvalLeft!!
    }

private var _ChatBubbleOvalLeft: ImageVector? = null

