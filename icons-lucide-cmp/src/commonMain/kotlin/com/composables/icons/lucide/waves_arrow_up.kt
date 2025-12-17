package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WavesArrowUp: ImageVector
    get() {
        if (_WavesArrowUp != null) return _WavesArrowUp!!
        
        _WavesArrowUp = ImageVector.Builder(
            name = "waves-arrow-up",
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
                moveTo(12f, 2f)
                verticalLineToRelative(8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                curveToRelative(0.6f, 0.5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(2.6f, 0f, 2.4f, 2f, 5f, 2f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, 0.5f, 2.5f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                curveToRelative(0.6f, 0.5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(2.6f, 0f, 2.4f, 2f, 5f, 2f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, 0.5f, 2.5f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()
        
        return _WavesArrowUp!!
    }

private var _WavesArrowUp: ImageVector? = null

