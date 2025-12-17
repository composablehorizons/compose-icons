package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashOff: ImageVector
    get() {
        if (_WashOff != null) return _WashOff!!
        
        _WashOff = ImageVector.Builder(
            name = "wash-off",
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
                moveTo(3f, 6f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(10.612f)
                curveToRelative(0.208f, 0f, 0.41f, -0.032f, 0.6f, -0.092f)
                moveToRelative(1.521f, -2.472f)
                lineToRelative(1.573f, -9.436f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.486f, 8.965f)
                curveToRelative(0.168f, 0.02f, 0.34f, 0.033f, 0.514f, 0.035f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2f, -0.5f)
                moveToRelative(4.92f, 0.919f)
                curveToRelative(0.428f, -0.083f, 0.805f, -0.227f, 1.08f, -0.418f)
                curveToRelative(0.461f, -0.322f, 1.21f, -0.508f, 2f, -0.5f)
                curveToRelative(0.79f, -0.008f, 1.539f, 0.178f, 2f, 0.5f)
                curveToRelative(0.461f, 0.32f, 1.21f, 0.508f, 2f, 0.5f)
                curveToRelative(0.17f, 0f, 0.339f, -0.015f, 0.503f, -0.035f)
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
        
        return _WashOff!!
    }

private var _WashOff: ImageVector? = null

