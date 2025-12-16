package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MapPinOff: ImageVector
    get() {
        if (_MapPinOff != null) return _MapPinOff!!
        
        _MapPinOff = ImageVector.Builder(
            name = "map-pin-off",
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
                moveTo(12.75f, 7.09f)
                arcToRelative(3f, 3f, 0f, false, true, 2.16f, 2.16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.072f, 17.072f)
                curveToRelative(-1.634f, 2.17f, -3.527f, 3.912f, -4.471f, 4.727f)
                arcToRelative(1f, 1f, 0f, false, true, -1.202f, 0f)
                curveTo(9.539f, 20.193f, 4f, 14.993f, 4f, 10f)
                arcToRelative(8f, 8f, 0f, false, true, 1.432f, -4.568f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.475f, 2.818f)
                arcTo(8f, 8f, 0f, false, true, 20f, 10f)
                curveToRelative(0f, 1.183f, -0.31f, 2.377f, -0.81f, 3.533f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.13f, 9.13f)
                arcToRelative(3f, 3f, 0f, false, false, 3.74f, 3.74f)
            }
        }.build()
        
        return _MapPinOff!!
    }

private var _MapPinOff: ImageVector? = null

