package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartSpline: ImageVector
    get() {
        if (_ChartSpline != null) return _ChartSpline!!
        
        _ChartSpline = ImageVector.Builder(
            name = "chart-spline",
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
                moveTo(7f, 16f)
                curveToRelative(0.5f, -2f, 1.5f, -7f, 4f, -7f)
                curveToRelative(2f, 0f, 2f, 3f, 4f, 3f)
                curveToRelative(2.5f, 0f, 4.5f, -5f, 5f, -7f)
            }
        }.build()
        
        return _ChartSpline!!
    }

private var _ChartSpline: ImageVector? = null

