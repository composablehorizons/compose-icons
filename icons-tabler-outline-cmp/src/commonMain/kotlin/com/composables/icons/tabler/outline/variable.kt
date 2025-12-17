package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Variable: ImageVector
    get() {
        if (_Variable != null) return _Variable!!
        
        _Variable = ImageVector.Builder(
            name = "variable",
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
                moveTo(5f, 4f)
                curveToRelative(-2.5f, 5f, -2.5f, 10f, 0f, 16f)
                moveToRelative(14f, -16f)
                curveToRelative(2.5f, 5f, 2.5f, 10f, 0f, 16f)
                moveToRelative(-10f, -11f)
                horizontalLineToRelative(1f)
                curveToRelative(1f, 0f, 1f, 1f, 2.016f, 3.527f)
                curveToRelative(0.984f, 2.473f, 0.984f, 3.473f, 1.984f, 3.473f)
                horizontalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4f, -3.5f)
            }
        }.build()
        
        return _Variable!!
    }

private var _Variable: ImageVector? = null

