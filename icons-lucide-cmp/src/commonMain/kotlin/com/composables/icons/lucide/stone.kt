package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Stone: ImageVector
    get() {
        if (_Stone != null) return _Stone!!
        
        _Stone = ImageVector.Builder(
            name = "stone",
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
                moveTo(11.264f, 2.205f)
                arcTo(4f, 4f, 0f, false, false, 6.42f, 4.211f)
                lineToRelative(-4f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 1.359f, 5.117f)
                lineToRelative(6f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, 4.438f, 0f)
                lineToRelative(6f, -4f)
                arcToRelative(4f, 4f, 0f, false, false, 1.576f, -4.592f)
                lineToRelative(-2f, -6f)
                arcToRelative(4f, 4f, 0f, false, false, -2.53f, -2.53f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.99f, 22f)
                lineTo(14f, 12f)
                lineToRelative(7.822f, 3.184f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineTo(8.47f, 2.302f)
            }
        }.build()
        
        return _Stone!!
    }

private var _Stone: ImageVector? = null

