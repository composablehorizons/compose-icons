package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartNetwork: ImageVector
    get() {
        if (_ChartNetwork != null) return _ChartNetwork!!
        
        _ChartNetwork = ImageVector.Builder(
            name = "chart-network",
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
                moveTo(13.11f, 7.664f)
                lineToRelative(1.78f, 2.672f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.162f, 12.788f)
                lineToRelative(-3.324f, 1.424f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                lineToRelative(-6.06f, 1.515f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                arcTo(2f, 2f, 0f, false, true, 12f, 8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 6f)
                arcTo(2f, 2f, 0f, false, true, 14f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                arcTo(2f, 2f, 0f, false, true, 16f, 14f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 18f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 15f)
                arcTo(2f, 2f, 0f, false, true, 9f, 17f)
                arcTo(2f, 2f, 0f, false, true, 7f, 15f)
                arcTo(2f, 2f, 0f, false, true, 11f, 15f)
                close()
            }
        }.build()
        
        return _ChartNetwork!!
    }

private var _ChartNetwork: ImageVector? = null

