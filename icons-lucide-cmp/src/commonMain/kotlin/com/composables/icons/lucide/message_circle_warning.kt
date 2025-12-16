package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageCircleWarning: ImageVector
    get() {
        if (_MessageCircleWarning != null) return _MessageCircleWarning!!
        
        _MessageCircleWarning = ImageVector.Builder(
            name = "message-circle-warning",
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
                moveTo(12f, 8f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _MessageCircleWarning!!
    }

private var _MessageCircleWarning: ImageVector? = null

