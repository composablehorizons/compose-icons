package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PawOff: ImageVector
    get() {
        if (_PawOff != null) return _PawOff!!
        
        _PawOff = ImageVector.Builder(
            name = "paw-off",
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
                moveTo(11.168f, 11.154f)
                curveToRelative(-0.71f, 0.31f, -1.184f, 1.107f, -2f, 2.593f)
                curveToRelative(-0.942f, 1.703f, -2.846f, 1.845f, -3.321f, 3.291f)
                curveToRelative(-0.097f, 0.265f, -0.145f, 0.677f, -0.143f, 0.962f)
                curveToRelative(0f, 1.176f, 0.787f, 2f, 1.8f, 2f)
                curveToRelative(1.259f, 0f, 3f, -1f, 4.5f, -1f)
                reflectiveCurveToRelative(3.241f, 1f, 4.5f, 1f)
                curveToRelative(0.927f, 0f, 1.664f, -0.689f, 1.783f, -1.708f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.188f, 8.082f)
                arcToRelative(1.039f, 1.039f, 0f, false, false, -0.406f, -0.082f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-0.735f, 0.012f, -1.56f, 0.75f, -1.993f, 1.866f)
                curveToRelative(-0.519f, 1.335f, -0.28f, 2.7f, 0.538f, 3.052f)
                curveToRelative(0.129f, 0.055f, 0.267f, 0.082f, 0.406f, 0.082f)
                curveToRelative(0.739f, 0f, 1.575f, -0.742f, 2.011f, -1.866f)
                curveToRelative(0.516f, -1.335f, 0.273f, -2.7f, -0.54f, -3.052f)
                horizontalLineToRelative(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 6.992f)
                arcToRelative(3.608f, 3.608f, 0f, false, false, -0.04f, -0.725f)
                curveToRelative(-0.203f, -1.297f, -1.047f, -2.267f, -1.932f, -2.267f)
                arcToRelative(1.237f, 1.237f, 0f, false, false, -0.758f, 0.265f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.456f, 6.733f)
                curveToRelative(0.214f, -1.376f, -0.375f, -2.594f, -1.32f, -2.722f)
                arcToRelative(1.164f, 1.164f, 0f, false, false, -0.162f, -0.011f)
                curveToRelative(-0.885f, 0f, -1.728f, 0.97f, -1.93f, 2.267f)
                curveToRelative(-0.214f, 1.376f, 0.375f, 2.594f, 1.32f, 2.722f)
                curveToRelative(0.054f, 0.007f, 0.108f, 0.011f, 0.162f, 0.011f)
                curveToRelative(0.885f, 0f, 1.73f, -0.974f, 1.93f, -2.267f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.69f, 12.918f)
                curveToRelative(0.816f, -0.352f, 1.054f, -1.719f, 0.536f, -3.052f)
                curveToRelative(-0.436f, -1.124f, -1.271f, -1.866f, -2.009f, -1.866f)
                curveToRelative(-0.14f, 0f, -0.277f, 0.027f, -0.407f, 0.082f)
                curveToRelative(-0.816f, 0.352f, -1.054f, 1.719f, -0.536f, 3.052f)
                curveToRelative(0.436f, 1.124f, 1.271f, 1.866f, 2.009f, 1.866f)
                curveToRelative(0.14f, 0f, 0.277f, -0.027f, 0.407f, -0.082f)
                close()
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
        
        return _PawOff!!
    }

private var _PawOff: ImageVector? = null

