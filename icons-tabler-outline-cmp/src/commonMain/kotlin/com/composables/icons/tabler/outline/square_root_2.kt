package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SquareRoot2: ImageVector
    get() {
        if (_SquareRoot2 != null) return _SquareRoot2!!
        
        _SquareRoot2 = ImageVector.Builder(
            name = "square-root-2",
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
                moveTo(13f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(1f, 0f, 1f, 1f, 2.016f, 3.527f)
                curveToRelative(0.984f, 2.473f, 0.984f, 3.473f, 1.984f, 3.473f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4f, -3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
                lineToRelative(3f, 8f)
                lineToRelative(3f, -16f)
                horizontalLineToRelative(10f)
            }
        }.build()
        
        return _SquareRoot2!!
    }

private var _SquareRoot2: ImageVector? = null

