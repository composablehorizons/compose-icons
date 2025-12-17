package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LineSquiggle: ImageVector
    get() {
        if (_LineSquiggle != null) return _LineSquiggle!!
        
        _LineSquiggle = ImageVector.Builder(
            name = "line-squiggle",
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
                moveTo(7f, 3.5f)
                curveToRelative(5f, -2f, 7f, 2.5f, 3f, 4f)
                curveTo(1.5f, 10f, 2f, 15f, 5f, 16f)
                curveToRelative(5f, 2f, 9f, -10f, 14f, -7f)
                reflectiveCurveToRelative(0.5f, 13.5f, -4f, 12f)
                curveToRelative(-5f, -2.5f, 0.5f, -11f, 6f, -2f)
            }
        }.build()
        
        return _LineSquiggle!!
    }

private var _LineSquiggle: ImageVector? = null

