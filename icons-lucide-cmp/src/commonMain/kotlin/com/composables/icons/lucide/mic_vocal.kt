package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MicVocal: ImageVector
    get() {
        if (_MicVocal != null) return _MicVocal!!
        
        _MicVocal = ImageVector.Builder(
            name = "mic-vocal",
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
                moveTo(11f, 7.601f)
                lineToRelative(-5.994f, 8.19f)
                arcToRelative(1f, 1f, 0f, false, false, 0.1f, 1.298f)
                lineToRelative(0.817f, 0.818f)
                arcToRelative(1f, 1f, 0f, false, false, 1.314f, 0.087f)
                lineTo(15.09f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 21.174f)
                curveTo(15.5f, 20.5f, 14.372f, 20f, 13f, 20f)
                curveToRelative(-2.058f, 0f, -3.928f, 2.356f, -6f, 2f)
                curveToRelative(-2.072f, -0.356f, -2.775f, -3.369f, -1.5f, -4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                arcTo(5f, 5f, 0f, false, true, 16f, 12f)
                arcTo(5f, 5f, 0f, false, true, 11f, 7f)
                arcTo(5f, 5f, 0f, false, true, 21f, 7f)
                close()
            }
        }.build()
        
        return _MicVocal!!
    }

private var _MicVocal: ImageVector? = null

