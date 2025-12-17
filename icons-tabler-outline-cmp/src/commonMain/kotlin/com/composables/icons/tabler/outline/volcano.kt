package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Volcano: ImageVector
    get() {
        if (_Volcano != null) return _Volcano!!
        
        _Volcano = ImageVector.Builder(
            name = "volcano",
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
                moveTo(9f, 8f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                lineToRelative(3.472f, -7.812f)
                arcToRelative(2f, 2f, 0f, false, true, 1.828f, -1.188f)
                horizontalLineToRelative(5.4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.828f, 1.188f)
                lineToRelative(3.472f, 7.812f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.192f, 15.064f)
                arcToRelative(2.14f, 2.14f, 0f, false, true, 0.475f, -0.064f)
                curveToRelative(0.527f, -0.009f, 1.026f, 0.178f, 1.333f, 0.5f)
                curveToRelative(0.307f, 0.32f, 0.806f, 0.507f, 1.333f, 0.5f)
                curveToRelative(0.527f, 0.007f, 1.026f, -0.18f, 1.334f, -0.5f)
                curveToRelative(0.307f, -0.322f, 0.806f, -0.509f, 1.333f, -0.5f)
                curveToRelative(0.527f, -0.009f, 1.026f, 0.178f, 1.333f, 0.5f)
                curveToRelative(0.308f, 0.32f, 0.807f, 0.507f, 1.334f, 0.5f)
                curveToRelative(0.527f, 0.007f, 1.026f, -0.18f, 1.333f, -0.5f)
                curveToRelative(0.307f, -0.322f, 0.806f, -0.509f, 1.333f, -0.5f)
                curveToRelative(0.161f, 0.003f, 0.32f, 0.025f, 0.472f, 0.064f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineToRelative(-4f)
            }
        }.build()
        
        return _Volcano!!
    }

private var _Volcano: ImageVector? = null

