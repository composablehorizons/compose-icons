package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PepperOff: ImageVector
    get() {
        if (_PepperOff != null) return _PepperOff!!
        
        _PepperOff = ImageVector.Builder(
            name = "pepper-off",
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
                moveTo(12.59f, 12.59f)
                curveToRelative(-0.77f, 1.418f, -2.535f, 2.41f, -4.59f, 2.41f)
                curveToRelative(-2.761f, 0f, -5f, -1.79f, -5f, -4f)
                arcToRelative(8f, 8f, 0f, false, false, 13.643f, 5.67f)
                moveToRelative(1.64f, -2.357f)
                arcToRelative(7.97f, 7.97f, 0f, false, false, 0.717f, -3.313f)
                arcToRelative(3f, 3f, 0f, false, false, -5.545f, -1.59f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                curveToRelative(0f, -2f, 2f, -4f, 4f, -4f)
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
        
        return _PepperOff!!
    }

private var _PepperOff: ImageVector? = null

