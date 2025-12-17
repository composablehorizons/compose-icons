package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashGentle: ImageVector
    get() {
        if (_WashGentle != null) return _WashGentle!!
        
        _WashGentle = ImageVector.Builder(
            name = "wash-gentle",
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
                moveTo(3.486f, 5.965f)
                curveToRelative(0.168f, 0.02f, 0.34f, 0.033f, 0.514f, 0.035f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2f, 0.5f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2f, 0.5f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2f, 0.5f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2f, 0.5f)
                curveToRelative(0.17f, 0f, 0.339f, -0.014f, 0.503f, -0.034f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(10.612f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, -1.671f)
                lineToRelative(1.721f, -10.329f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                horizontalLineToRelative(14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
        }.build()
        
        return _WashGentle!!
    }

private var _WashGentle: ImageVector? = null

