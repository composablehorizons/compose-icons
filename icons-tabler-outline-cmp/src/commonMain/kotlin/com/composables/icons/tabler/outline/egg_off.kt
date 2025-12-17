package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EggOff: ImageVector
    get() {
        if (_EggOff != null) return _EggOff!!
        
        _EggOff = ImageVector.Builder(
            name = "egg-off",
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
                moveTo(17.927f, 17.934f)
                curveToRelative(-1.211f, 1.858f, -3.351f, 2.953f, -5.927f, 3.066f)
                curveToRelative(-4.2f, 0f, -7f, -2.763f, -7f, -6.917f)
                curveToRelative(0f, -2.568f, 0.753f, -5.14f, 1.91f, -7.158f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.642f, 4.628f)
                curveToRelative(1.034f, -1.02f, 2.196f, -1.63f, 3.358f, -1.628f)
                curveToRelative(3.5f, 0.007f, 7f, 5.545f, 7f, 11.083f)
                curveToRelative(0f, 0.298f, -0.015f, 0.587f, -0.045f, 0.868f)
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
        
        return _EggOff!!
    }

private var _EggOff: ImageVector? = null

