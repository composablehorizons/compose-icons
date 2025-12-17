package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Soup: ImageVector
    get() {
        if (_Soup != null) return _Soup!!
        
        _Soup = ImageVector.Builder(
            name = "soup",
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
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, -9f)
                horizontalLineTo(3f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 12f)
                lineTo(22f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.25f, 3f)
                curveToRelative(0.27f, 0.1f, 0.8f, 0.53f, 0.75f, 1.36f)
                curveToRelative(-0.06f, 0.83f, -0.93f, 1.2f, -1f, 2.02f)
                curveToRelative(-0.05f, 0.78f, 0.34f, 1.24f, 0.73f, 1.62f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.25f, 3f)
                curveToRelative(0.27f, 0.1f, 0.8f, 0.53f, 0.74f, 1.36f)
                curveToRelative(-0.05f, 0.83f, -0.93f, 1.2f, -0.98f, 2.02f)
                curveToRelative(-0.06f, 0.78f, 0.33f, 1.24f, 0.72f, 1.62f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.25f, 3f)
                curveToRelative(0.27f, 0.1f, 0.8f, 0.53f, 0.75f, 1.36f)
                curveToRelative(-0.06f, 0.83f, -0.93f, 1.2f, -1f, 2.02f)
                curveToRelative(-0.05f, 0.78f, 0.34f, 1.24f, 0.74f, 1.62f)
            }
        }.build()
        
        return _Soup!!
    }

private var _Soup: ImageVector? = null

