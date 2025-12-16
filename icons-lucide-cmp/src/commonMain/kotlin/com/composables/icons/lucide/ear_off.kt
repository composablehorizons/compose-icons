package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EarOff: ImageVector
    get() {
        if (_EarOff != null) return _EarOff!!
        
        _EarOff = ImageVector.Builder(
            name = "ear-off",
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
                moveTo(6f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7f, 0f)
                curveToRelative(0f, -1.57f, 0.92f, -2.52f, 2.04f, -3.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8.5f)
                curveToRelative(0f, -0.75f, 0.13f, -1.47f, 0.36f, -2.14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.8f, 3.15f)
                arcTo(6.5f, 6.5f, 0f, false, true, 19f, 8.5f)
                curveToRelative(0f, 1.63f, -0.44f, 2.81f, -1.09f, 3.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 6f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 8.5f)
                moveTo(10f, 13f)
                arcToRelative(2f, 2f, 0f, false, false, 1.82f, -1.18f)
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
        
        return _EarOff!!
    }

private var _EarOff: ImageVector? = null

