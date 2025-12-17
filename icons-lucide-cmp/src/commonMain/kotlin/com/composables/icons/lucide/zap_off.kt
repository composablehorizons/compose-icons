package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ZapOff: ImageVector
    get() {
        if (_ZapOff != null) return _ZapOff!!
        
        _ZapOff = ImageVector.Builder(
            name = "zap-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.513f, 4.856f)
                lineTo(13.12f, 2.17f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.86f, 0.46f)
                lineToRelative(-1.377f, 4.317f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.656f, 10f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, true, 0.78f, 1.63f)
                lineToRelative(-1.72f, 1.773f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.273f, 16.273f)
                lineTo(10.88f, 21.83f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.86f, -0.46f)
                lineToRelative(1.92f, -6.02f)
                arcTo(1f, 1f, 0f, false, false, 11f, 14f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.78f, -1.63f)
                lineToRelative(4.507f, -4.643f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()
        
        return _ZapOff!!
    }

private var _ZapOff: ImageVector? = null

