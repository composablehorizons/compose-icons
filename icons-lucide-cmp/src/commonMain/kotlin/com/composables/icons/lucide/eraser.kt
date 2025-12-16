package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Eraser: ImageVector
    get() {
        if (_Eraser != null) return _Eraser!!
        
        _Eraser = ImageVector.Builder(
            name = "eraser",
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
                moveTo(21f, 21f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, -1.42f, -0.587f)
                lineToRelative(-3.994f, -3.999f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                lineToRelative(10f, -10f)
                arcToRelative(2f, 2f, 0f, false, true, 2.829f, 0f)
                lineToRelative(5.999f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                lineTo(12.834f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.082f, 11.09f)
                lineToRelative(8.828f, 8.828f)
            }
        }.build()
        
        return _Eraser!!
    }

private var _Eraser: ImageVector? = null

