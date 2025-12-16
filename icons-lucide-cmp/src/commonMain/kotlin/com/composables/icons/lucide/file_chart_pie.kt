package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileChartPie: ImageVector
    get() {
        if (_FileChartPie != null) return _FileChartPie!!
        
        _FileChartPie = ImageVector.Builder(
            name = "file-chart-pie",
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
                moveTo(15.941f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -0.706f, -1.704f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3.512f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.017f, 11.512f)
                arcToRelative(6f, 6f, 0f, true, false, 8.466f, 8.475f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.552f, 0.45f, -1.008f, 0.995f, -0.917f)
                arcToRelative(6f, 6f, 0f, false, true, 4.922f, 4.922f)
                curveToRelative(0.091f, 0.544f, -0.365f, 0.995f, -0.917f, 0.995f)
                close()
            }
        }.build()
        
        return _FileChartPie!!
    }

private var _FileChartPie: ImageVector? = null

