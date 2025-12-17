package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashTemperature2: ImageVector
    get() {
        if (_WashTemperature2 != null) return _WashTemperature2!!
        
        _WashTemperature2 = ImageVector.Builder(
            name = "wash-temperature-2",
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
                moveTo(3.486f, 8.965f)
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(10.612f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, -1.671f)
                lineToRelative(1.721f, -10.329f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _WashTemperature2!!
    }

private var _WashTemperature2: ImageVector? = null

