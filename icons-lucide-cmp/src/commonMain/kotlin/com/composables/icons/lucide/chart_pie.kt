package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) return _ChartPie!!
        
        _ChartPie = ImageVector.Builder(
            name = "chart-pie",
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
                moveTo(21f, 12f)
                curveToRelative(0.552f, 0f, 1.005f, -0.449f, 0.95f, -0.998f)
                arcToRelative(10f, 10f, 0f, false, false, -8.953f, -8.951f)
                curveToRelative(-0.55f, -0.055f, -0.998f, 0.398f, -0.998f, 0.95f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.21f, 15.89f)
                arcTo(10f, 10f, 0f, true, true, 8f, 2.83f)
            }
        }.build()
        
        return _ChartPie!!
    }

private var _ChartPie: ImageVector? = null

