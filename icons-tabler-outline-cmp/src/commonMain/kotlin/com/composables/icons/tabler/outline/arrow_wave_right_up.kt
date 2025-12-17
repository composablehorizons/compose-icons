package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowWaveRightUp: ImageVector
    get() {
        if (_ArrowWaveRightUp != null) return _ArrowWaveRightUp!!
        
        _ArrowWaveRightUp = ImageVector.Builder(
            name = "arrow-wave-right-up",
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
                moveTo(17f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveToRelative(0.887f, -1.284f, 2.48f, -2.033f, 4f, -2f)
                curveToRelative(1.52f, -0.033f, 3.113f, 0.716f, 4f, 2f)
                reflectiveCurveToRelative(2.48f, 2.033f, 4f, 2f)
                curveToRelative(1.52f, 0.033f, 3f, -1f, 4f, -2f)
                lineToRelative(2f, -2f)
            }
        }.build()
        
        return _ArrowWaveRightUp!!
    }

private var _ArrowWaveRightUp: ImageVector? = null

