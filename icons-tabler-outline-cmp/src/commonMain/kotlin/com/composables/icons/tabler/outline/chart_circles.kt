package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChartCircles: ImageVector
    get() {
        if (_ChartCircles != null) return _ChartCircles!!
        
        _ChartCircles = ImageVector.Builder(
            name = "chart-circles",
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
                moveTo(9.5f, 9.5f)
                moveToRelative(-5.5f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 11f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -11f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14.5f)
                moveToRelative(-5.5f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 11f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -11f, 0f)
            }
        }.build()
        
        return _ChartCircles!!
    }

private var _ChartCircles: ImageVector? = null

