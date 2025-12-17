package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GlassOff: ImageVector
    get() {
        if (_GlassOff != null) return _GlassOff!!
        
        _GlassOff = ImageVector.Builder(
            name = "glass-off",
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
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5f)
                lineToRelative(1f, 6f)
                curveToRelative(0f, 0.887f, -0.233f, 1.685f, -0.646f, 2.37f)
                moveToRelative(-2.083f, 1.886f)
                curveToRelative(-0.941f, 0.48f, -2.064f, 0.744f, -3.271f, 0.744f)
                curveToRelative(-3.314f, 0f, -6f, -1.988f, -6f, -5f)
                lineToRelative(0.711f, -4.268f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.983f, 6.959f)
                curveToRelative(0.329f, 0.027f, 0.669f, 0.041f, 1.017f, 0.041f)
                curveToRelative(2.761f, 0f, 5f, -0.895f, 5f, -2f)
                reflectiveCurveToRelative(-2.239f, -2f, -5f, -2f)
                curveToRelative(-1.716f, 0f, -3.23f, 0.346f, -4.13f, 0.872f)
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
        
        return _GlassOff!!
    }

private var _GlassOff: ImageVector? = null

