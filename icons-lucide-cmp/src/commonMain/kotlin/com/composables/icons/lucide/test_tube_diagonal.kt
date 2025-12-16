package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TestTubeDiagonal: ImageVector
    get() {
        if (_TestTubeDiagonal != null) return _TestTubeDiagonal!!
        
        _TestTubeDiagonal = ImageVector.Builder(
            name = "test-tube-diagonal",
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
                moveTo(21f, 7f)
                lineTo(6.82f, 21.18f)
                arcToRelative(2.83f, 2.83f, 0f, false, true, -3.99f, -0.01f)
                arcToRelative(2.83f, 2.83f, 0f, false, true, 0f, -4f)
                lineTo(17f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineTo(4f)
            }
        }.build()
        
        return _TestTubeDiagonal!!
    }

private var _TestTubeDiagonal: ImageVector? = null

