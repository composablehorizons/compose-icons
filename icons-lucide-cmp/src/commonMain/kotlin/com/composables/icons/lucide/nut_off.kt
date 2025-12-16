package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.NutOff: ImageVector
    get() {
        if (_NutOff != null) return _NutOff!!
        
        _NutOff = ImageVector.Builder(
            name = "nut-off",
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
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, 5.277f, 6.787f)
                curveToRelative(0.412f, 0.104f, 0.802f, 0.292f, 1.102f, 0.592f)
                lineTo(12f, 22f)
                lineToRelative(0.621f, -0.621f)
                curveToRelative(0.3f, -0.3f, 0.69f, -0.488f, 1.102f, -0.592f)
                arcToRelative(7.01f, 7.01f, 0f, false, false, 4.125f, -2.939f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                verticalLineToRelative(3.343f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveToRelative(-1.349f, -0.573f, -1.905f, -1.005f, -2.5f, -2f)
                curveToRelative(-0.546f, 0.902f, -1.048f, 1.353f, -2.5f, 2f)
                curveToRelative(-1.018f, -0.644f, -1.46f, -1.08f, -2f, -2f)
                curveToRelative(-1.028f, 0.71f, -1.69f, 0.918f, -3f, 1f)
                curveToRelative(1.081f, -1.048f, 1.757f, -2.03f, 2f, -3f)
                curveToRelative(0.194f, -0.776f, 0.84f, -1.551f, 1.79f, -2.21f)
                moveToRelative(11.654f, 5.997f)
                curveToRelative(0.887f, -0.457f, 1.28f, -0.891f, 1.556f, -1.787f)
                curveToRelative(1.032f, 0.916f, 1.683f, 1.157f, 3f, 1f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2f, -3f)
                curveToRelative(-0.5f, -2f, -4f, -4f, -8f, -4f)
                curveToRelative(-0.74f, 0f, -1.461f, 0.068f, -2.15f, 0.192f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()
        
        return _NutOff!!
    }

private var _NutOff: ImageVector? = null

