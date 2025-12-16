package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SkipForward: ImageVector
    get() {
        if (_SkipForward != null) return _SkipForward!!
        
        _SkipForward = ImageVector.Builder(
            name = "skip-forward",
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
                moveTo(21f, 4f)
                verticalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.029f, 4.285f)
                arcTo(2f, 2f, 0f, false, false, 3f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 3.029f, 1.715f)
                lineToRelative(9.997f, -5.998f)
                arcToRelative(2f, 2f, 0f, false, false, 0.003f, -3.432f)
                close()
            }
        }.build()
        
        return _SkipForward!!
    }

private var _SkipForward: ImageVector? = null

