package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageCircleReply: ImageVector
    get() {
        if (_MessageCircleReply != null) return _MessageCircleReply!!
        
        _MessageCircleReply = ImageVector.Builder(
            name = "message-circle-reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.992f, 16.342f)
                arcToRelative(2f, 2f, 0f, false, true, 0.094f, 1.167f)
                lineToRelative(-1.065f, 3.29f)
                arcToRelative(1f, 1f, 0f, false, false, 1.236f, 1.168f)
                lineToRelative(3.413f, -0.998f)
                arcToRelative(2f, 2f, 0f, false, true, 1.099f, 0.092f)
                arcToRelative(10f, 10f, 0f, true, false, -4.777f, -4.719f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _MessageCircleReply!!
    }

private var _MessageCircleReply: ImageVector? = null

