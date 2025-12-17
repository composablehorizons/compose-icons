package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shrimp: ImageVector
    get() {
        if (_Shrimp != null) return _Shrimp!!
        
        _Shrimp = ImageVector.Builder(
            name = "shrimp",
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
                moveTo(11f, 12f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 22f)
                curveToRelative(0.5f, -0.5f, 1.12f, -1f, 2.5f, -1f)
                curveToRelative(-1.38f, 0f, -2f, -0.5f, -2.5f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                arcToRelative(3.28f, 3.28f, 0f, false, true, -3.227f, 1.798f)
                lineToRelative(-6.17f, -0.561f)
                arcTo(2.387f, 2.387f, 0f, true, false, 4.387f, 8f)
                horizontalLineTo(15.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -5f)
                horizontalLineTo(12f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, -7f)
                verticalLineTo(8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                arcToRelative(8.5f, 8.5f, 0f, false, true, 0f, 8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                curveToRelative(2f, 0f, 4.5f, -4f, 4f, -6f)
            }
        }.build()
        
        return _Shrimp!!
    }

private var _Shrimp: ImageVector? = null

