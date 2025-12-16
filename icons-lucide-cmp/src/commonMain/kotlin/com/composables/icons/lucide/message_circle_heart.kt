package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageCircleHeart: ImageVector
    get() {
        if (_MessageCircleHeart != null) return _MessageCircleHeart!!
        
        _MessageCircleHeart = ImageVector.Builder(
            name = "message-circle-heart",
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
                moveTo(7.828f, 13.07f)
                arcTo(3f, 3f, 0f, false, true, 12f, 8.764f)
                arcToRelative(3f, 3f, 0f, false, true, 5.004f, 2.224f)
                arcToRelative(3f, 3f, 0f, false, true, -0.832f, 2.083f)
                lineToRelative(-3.447f, 3.62f)
                arcToRelative(1f, 1f, 0f, false, true, -1.45f, -0.001f)
                close()
            }
        }.build()
        
        return _MessageCircleHeart!!
    }

private var _MessageCircleHeart: ImageVector? = null

