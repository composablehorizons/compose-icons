package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Drama: ImageVector
    get() {
        if (_Drama != null) return _Drama!!
        
        _Drama = ImageVector.Builder(
            name = "drama",
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
                moveTo(10f, 11f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 13.1f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 5f)
                curveToRelative(0f, 9f, -4f, 12f, -6f, 12f)
                reflectiveCurveToRelative(-6f, -3f, -6f, -12f)
                curveToRelative(0f, -2f, 2f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 1f, 6f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.4f, 9.9f)
                curveToRelative(-0.8f, 0.8f, -2f, 0.8f, -2.8f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.1f, 7.1f)
                curveTo(9f, 7.2f, 7.7f, 7.7f, 6f, 8.6f)
                curveToRelative(-3.5f, 2f, -4.7f, 3.9f, -3.7f, 5.6f)
                curveToRelative(4.5f, 7.8f, 9.5f, 8.4f, 11.2f, 7.4f)
                curveToRelative(0.9f, -0.5f, 1.9f, -2.1f, 1.9f, -4.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.1f, 16.5f)
                curveToRelative(0.3f, -1.1f, 1.4f, -1.7f, 2.4f, -1.4f)
            }
        }.build()
        
        return _Drama!!
    }

private var _Drama: ImageVector? = null

