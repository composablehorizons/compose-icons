package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Biohazard: ImageVector
    get() {
        if (_Biohazard != null) return _Biohazard!!
        
        _Biohazard = ImageVector.Builder(
            name = "biohazard",
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
                moveTo(14f, 11.9f)
                arcTo(2f, 2f, 0f, false, true, 12f, 13.9f)
                arcTo(2f, 2f, 0f, false, true, 10f, 11.9f)
                arcTo(2f, 2f, 0f, false, true, 14f, 11.9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.7f, 3.4f)
                curveToRelative(-0.9f, 2.5f, 0f, 5.2f, 2.2f, 6.7f)
                curveTo(6.5f, 9f, 3.7f, 9.6f, 2f, 11.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.9f, 10.1f)
                lineToRelative(1.4f, 0.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.3f, 3.4f)
                curveToRelative(0.9f, 2.5f, 0f, 5.2f, -2.2f, 6.7f)
                curveToRelative(2.4f, -1.2f, 5.2f, -0.6f, 6.9f, 1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.1f, 10.1f)
                lineToRelative(-1.4f, 0.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.7f, 20.8f)
                curveToRelative(-2.6f, -0.4f, -4.6f, -2.6f, -4.7f, -5.3f)
                curveToRelative(-0.2f, 2.6f, -2.1f, 4.8f, -4.7f, 5.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.9f)
                verticalLineToRelative(1.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 5.4f)
                curveToRelative(-1f, -0.2f, -2f, -0.2f, -3f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.4f)
                curveToRelative(0.7f, -0.7f, 1.2f, -1.6f, 1.5f, -2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 13.9f)
                curveToRelative(0.3f, 0.9f, 0.8f, 1.8f, 1.5f, 2.5f)
            }
        }.build()
        
        return _Biohazard!!
    }

private var _Biohazard: ImageVector? = null

