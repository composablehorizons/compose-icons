package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rat: ImageVector
    get() {
        if (_Rat != null) return _Rat!!
        
        _Rat = ImageVector.Builder(
            name = "rat",
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
                moveTo(13f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.236f, 18f)
                arcToRelative(3f, 3f, 0f, false, false, -2.2f, -5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.82f, 3.94f)
                arcToRelative(3f, 3f, 0f, true, true, 3.237f, 4.868f)
                lineToRelative(1.815f, 2.587f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 2.1f)
                lineToRelative(-2.872f, -0.453f)
                arcToRelative(3f, 3f, 0f, false, false, -3.5f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4.988f)
                arcToRelative(3f, 3f, 0f, true, false, -5.2f, 2.052f)
                arcTo(7f, 7f, 0f, false, false, 4f, 14.015f)
                arcTo(4f, 4f, 0f, false, false, 8f, 18f)
            }
        }.build()
        
        return _Rat!!
    }

private var _Rat: ImageVector? = null

