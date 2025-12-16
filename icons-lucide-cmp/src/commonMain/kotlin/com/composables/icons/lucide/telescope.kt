package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Telescope: ImageVector
    get() {
        if (_Telescope != null) return _Telescope!!
        
        _Telescope = ImageVector.Builder(
            name = "telescope",
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
                moveTo(10.065f, 12.493f)
                lineToRelative(-6.18f, 1.318f)
                arcToRelative(0.934f, 0.934f, 0f, false, true, -1.108f, -0.702f)
                lineToRelative(-0.537f, -2.15f)
                arcToRelative(1.07f, 1.07f, 0f, false, true, 0.691f, -1.265f)
                lineToRelative(13.504f, -4.44f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.56f, 11.747f)
                lineToRelative(4.332f, -0.924f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                lineToRelative(-3.105f, -6.21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.485f, 5.94f)
                arcToRelative(2f, 2f, 0f, false, true, 1.455f, -2.425f)
                lineToRelative(1.09f, -0.272f)
                arcToRelative(1f, 1f, 0f, false, true, 1.212f, 0.727f)
                lineToRelative(1.515f, 6.06f)
                arcToRelative(1f, 1f, 0f, false, true, -0.727f, 1.213f)
                lineToRelative(-1.09f, 0.272f)
                arcToRelative(2f, 2f, 0f, false, true, -2.425f, -1.455f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.158f, 8.633f)
                lineToRelative(1.114f, 4.456f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                lineToRelative(3.105f, -6.21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                arcTo(2f, 2f, 0f, false, true, 12f, 15f)
                arcTo(2f, 2f, 0f, false, true, 10f, 13f)
                arcTo(2f, 2f, 0f, false, true, 14f, 13f)
                close()
            }
        }.build()
        
        return _Telescope!!
    }

private var _Telescope: ImageVector? = null

