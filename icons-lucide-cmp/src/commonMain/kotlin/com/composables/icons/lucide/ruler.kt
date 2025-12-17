package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ruler: ImageVector
    get() {
        if (_Ruler != null) return _Ruler!!
        
        _Ruler = ImageVector.Builder(
            name = "ruler",
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
                moveTo(21.3f, 15.3f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 0f, 3.4f)
                lineToRelative(-2.6f, 2.6f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -3.4f, 0f)
                lineTo(2.7f, 8.7f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 0f, -3.4f)
                lineToRelative(2.6f, -2.6f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.4f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 12.5f)
                lineToRelative(2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 9.5f)
                lineToRelative(2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 6.5f)
                lineToRelative(2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 15.5f)
                lineToRelative(2f, -2f)
            }
        }.build()
        
        return _Ruler!!
    }

private var _Ruler: ImageVector? = null

