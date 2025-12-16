package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartScatter: ImageVector
    get() {
        if (_ChartScatter != null) return _ChartScatter!!
        
        _ChartScatter = ImageVector.Builder(
            name = "chart-scatter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 18.5f, 6f)
                arcTo(0.5f, 0.5f, 0f, false, true, 18f, 5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 19f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17.5f, 15f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 18f, 14.5f)
                close()
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
        }.build()
        
        return _ChartScatter!!
    }

private var _ChartScatter: ImageVector? = null

