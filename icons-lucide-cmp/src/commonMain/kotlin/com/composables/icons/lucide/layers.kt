package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
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
                moveTo(12.83f, 2.18f)
                arcToRelative(2f, 2f, 0f, false, false, -1.66f, 0f)
                lineTo(2.6f, 6.08f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.83f)
                lineToRelative(8.58f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcTo(1f, 1f, 0f, false, false, 22f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17f)
                arcToRelative(1f, 1f, 0f, false, false, 0.58f, 0.91f)
                lineToRelative(8.6f, 3.91f)
                arcToRelative(2f, 2f, 0f, false, false, 1.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcTo(1f, 1f, 0f, false, false, 22f, 17f)
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

