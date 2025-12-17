package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SquareRotatedOff: ImageVector
    get() {
        if (_SquareRotatedOff != null) return _SquareRotatedOff!!
        
        _SquareRotatedOff = ImageVector.Builder(
            name = "square-rotated-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.964f, 16.952f)
                lineToRelative(-3.462f, 3.461f)
                curveToRelative(-0.782f, 0.783f, -2.222f, 0.783f, -3f, 0f)
                lineToRelative(-6.911f, -6.91f)
                curveToRelative(-0.783f, -0.783f, -0.783f, -2.223f, 0f, -3f)
                lineToRelative(3.455f, -3.456f)
                moveToRelative(2f, -2f)
                lineToRelative(1.453f, -1.452f)
                curveToRelative(0.782f, -0.783f, 2.222f, -0.783f, 3f, 0f)
                lineToRelative(6.911f, 6.91f)
                curveToRelative(0.783f, 0.783f, 0.783f, 2.223f, 0f, 3f)
                lineToRelative(-1.448f, 1.45f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _SquareRotatedOff!!
    }

private var _SquareRotatedOff: ImageVector? = null

