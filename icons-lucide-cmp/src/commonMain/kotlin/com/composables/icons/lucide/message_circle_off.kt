package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MessageCircleOff: ImageVector
    get() {
        if (_MessageCircleOff != null) return _MessageCircleOff!!
        
        _MessageCircleOff = ImageVector.Builder(
            name = "message-circle-off",
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
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.929f)
                arcToRelative(10f, 10f, 0f, false, false, -1.938f, 11.412f)
                arcToRelative(2f, 2f, 0f, false, true, 0.094f, 1.167f)
                lineToRelative(-1.065f, 3.29f)
                arcToRelative(1f, 1f, 0f, false, false, 1.236f, 1.168f)
                lineToRelative(3.413f, -0.998f)
                arcToRelative(2f, 2f, 0f, false, true, 1.099f, 0.092f)
                arcToRelative(10f, 10f, 0f, false, false, 11.302f, -1.989f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.35f, 2.69f)
                arcTo(10f, 10f, 0f, false, true, 21.3f, 15.65f)
            }
        }.build()
        
        return _MessageCircleOff!!
    }

private var _MessageCircleOff: ImageVector? = null

