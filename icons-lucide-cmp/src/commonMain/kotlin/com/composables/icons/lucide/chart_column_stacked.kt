package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartColumnStacked: ImageVector
    get() {
        if (_ChartColumnStacked != null) return _ChartColumnStacked!!
        
        _ChartColumnStacked = ImageVector.Builder(
            name = "chart-column-stacked",
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
                moveTo(11f, 13f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 9f)
                horizontalLineToRelative(-4f)
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
                moveTo(16f, 5f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 19f, 6f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, false, true, 18f, 17f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, false, true, 15f, 16f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 16f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, false, true, 11f, 9f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, false, true, 10f, 17f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, false, true, 7f, 16f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 8f)
                close()
            }
        }.build()
        
        return _ChartColumnStacked!!
    }

private var _ChartColumnStacked: ImageVector? = null

