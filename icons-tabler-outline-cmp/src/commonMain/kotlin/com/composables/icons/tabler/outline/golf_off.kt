package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GolfOff: ImageVector
    get() {
        if (_GolfOff != null) return _GolfOff!!
        
        _GolfOff = ImageVector.Builder(
            name = "golf-off",
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
                moveTo(12f, 18f)
                verticalLineToRelative(-6f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-5f)
                lineToRelative(7f, 4f)
                lineToRelative(-5.07f, 2.897f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17.67f)
                curveToRelative(-0.62f, 0.36f, -1f, 0.82f, -1f, 1.33f)
                curveToRelative(0f, 1.1f, 1.8f, 2f, 4f, 2f)
                reflectiveCurveToRelative(4f, -0.9f, 4f, -2f)
                curveToRelative(0f, -0.5f, -0.38f, -0.97f, -1f, -1.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _GolfOff!!
    }

private var _GolfOff: ImageVector? = null

