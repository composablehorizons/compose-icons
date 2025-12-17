package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SkipBack: ImageVector
    get() {
        if (_SkipBack != null) return _SkipBack!!
        
        _SkipBack = ImageVector.Builder(
            name = "skip-back",
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
                moveTo(17.971f, 4.285f)
                arcTo(2f, 2f, 0f, false, true, 21f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -3.029f, 1.715f)
                lineToRelative(-9.997f, -5.998f)
                arcToRelative(2f, 2f, 0f, false, true, -0.003f, -3.432f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                verticalLineTo(4f)
            }
        }.build()
        
        return _SkipBack!!
    }

private var _SkipBack: ImageVector? = null

