package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FlipFlops: ImageVector
    get() {
        if (_FlipFlops != null) return _FlipFlops!!
        
        _FlipFlops = ImageVector.Builder(
            name = "flip-flops",
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
                moveTo(18f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.682f, 4f, 3.758f)
                curveToRelative(0f, 0.078f, 0f, 0.156f, -0.008f, 0.234f)
                lineToRelative(-0.6f, 9.014f)
                curveToRelative(-0.11f, 1.683f, -1.596f, 3f, -3.392f, 3f)
                reflectiveCurveToRelative(-3.28f, -1.311f, -3.392f, -3f)
                lineToRelative(-0.6f, -9.014f)
                curveToRelative(-0.138f, -2.071f, 1.538f, -3.855f, 3.743f, -3.985f)
                arcToRelative(4.15f, 4.15f, 0f, false, true, 0.25f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14f)
                curveToRelative(1f, -3.333f, 2.167f, -5f, 3.5f, -5f)
                curveToRelative(1.333f, 0f, 2.5f, 1.667f, 3.5f, 5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 16f)
                verticalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.682f, 4f, 3.758f)
                curveToRelative(0f, 0.078f, 0f, 0.156f, -0.008f, 0.234f)
                lineToRelative(-0.6f, 9.014f)
                curveToRelative(-0.11f, 1.683f, -1.596f, 3f, -3.392f, 3f)
                reflectiveCurveToRelative(-3.28f, -1.311f, -3.392f, -3f)
                lineToRelative(-0.6f, -9.014f)
                curveToRelative(-0.138f, -2.071f, 1.538f, -3.855f, 3.742f, -3.985f)
                curveToRelative(0.084f, 0f, 0.167f, -0.007f, 0.25f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.5f, 14f)
                curveToRelative(1f, -3.333f, 2.167f, -5f, 3.5f, -5f)
                curveToRelative(1.333f, 0f, 2.5f, 1.667f, 3.5f, 5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _FlipFlops!!
    }

private var _FlipFlops: ImageVector? = null

