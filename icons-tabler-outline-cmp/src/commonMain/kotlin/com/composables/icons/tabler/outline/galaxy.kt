package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Galaxy: ImageVector
    get() {
        if (_Galaxy != null) return _Galaxy!!
        
        _Galaxy = ImageVector.Builder(
            name = "galaxy",
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
                moveTo(12f, 3f)
                curveToRelative(-1.333f, 1f, -2f, 2.5f, -2f, 4.5f)
                curveToRelative(0f, 3f, 2f, 4.5f, 2f, 4.5f)
                reflectiveCurveToRelative(2f, 1.5f, 2f, 4.5f)
                curveToRelative(0f, 2f, -0.667f, 3.5f, -2f, 4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.794f, 16.5f)
                curveToRelative(-0.2f, -1.655f, -1.165f, -2.982f, -2.897f, -3.982f)
                curveToRelative(-2.597f, -1.5f, -4.897f, -0.518f, -4.897f, -0.518f)
                reflectiveCurveToRelative(-2.299f, 0.982f, -4.897f, -0.518f)
                curveToRelative(-1.732f, -1f, -2.698f, -2.327f, -2.897f, -3.982f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.794f, 7.5f)
                curveToRelative(-1.532f, -0.655f, -3.165f, -0.482f, -4.897f, 0.518f)
                curveToRelative(-2.597f, 1.5f, -2.897f, 3.982f, -2.897f, 3.982f)
                reflectiveCurveToRelative(-0.299f, 2.482f, -2.897f, 3.982f)
                curveToRelative(-1.732f, 1f, -3.365f, 1.173f, -4.897f, 0.518f)
            }
        }.build()
        
        return _Galaxy!!
    }

private var _Galaxy: ImageVector? = null

