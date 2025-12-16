package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PaintBucket: ImageVector
    get() {
        if (_PaintBucket != null) return _PaintBucket!!
        
        _PaintBucket = ImageVector.Builder(
            name = "paint-bucket",
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
                moveTo(11f, 7f)
                lineTo(6f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.992f, 12f)
                horizontalLineTo(2.041f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.145f, 18.38f)
                arcTo(3.34f, 3.34f, 0f, false, true, 20f, 16.5f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, -1.145f, 1.88f)
                curveToRelative(-0.575f, 0.46f, -0.855f, 1.02f, -0.855f, 1.595f)
                arcTo(2f, 2f, 0f, false, false, 20f, 22f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2.025f)
                curveToRelative(0f, -0.58f, -0.285f, -1.13f, -0.855f, -1.595f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 4.5f)
                lineToRelative(2.148f, -2.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 1.704f, 0f)
                lineToRelative(7.296f, 7.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-7.592f, 7.592f)
                arcToRelative(3.615f, 3.615f, 0f, false, true, -5.112f, 0f)
                lineToRelative(-3.888f, -3.888f)
                arcToRelative(3.615f, 3.615f, 0f, false, true, 0f, -5.112f)
                lineTo(5.67f, 7.33f)
            }
        }.build()
        
        return _PaintBucket!!
    }

private var _PaintBucket: ImageVector? = null

