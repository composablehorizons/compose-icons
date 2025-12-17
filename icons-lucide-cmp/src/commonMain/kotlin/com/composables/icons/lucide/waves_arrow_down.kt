package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WavesArrowDown: ImageVector
    get() {
        if (_WavesArrowDown != null) return _WavesArrowDown!!
        
        _WavesArrowDown = ImageVector.Builder(
            name = "waves-arrow-down",
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
                moveTo(12f, 10f)
                lineTo(12f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                lineTo(12f, 10f)
                lineTo(8f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                curveTo(2.6f, 15.5f, 3.2f, 16f, 4.5f, 16f)
                curveTo(7f, 16f, 7f, 14f, 9.5f, 14f)
                curveTo(12.1f, 14f, 11.9f, 16f, 14.5f, 16f)
                curveTo(17f, 16f, 17f, 14f, 19.5f, 14f)
                curveTo(20.8f, 14f, 21.4f, 14.5f, 22f, 15f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                curveTo(2.6f, 21.5f, 3.2f, 22f, 4.5f, 22f)
                curveTo(7f, 22f, 7f, 20f, 9.5f, 20f)
                curveTo(12.1f, 20f, 11.9f, 22f, 14.5f, 22f)
                curveTo(17f, 22f, 17f, 20f, 19.5f, 20f)
                curveTo(20.8f, 20f, 21.4f, 20.5f, 22f, 21f)
            }
        }.build()
        
        return _WavesArrowDown!!
    }

private var _WavesArrowDown: ImageVector? = null

