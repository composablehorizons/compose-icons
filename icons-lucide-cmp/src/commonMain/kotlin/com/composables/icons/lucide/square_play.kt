package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquarePlay: ImageVector
    get() {
        if (_SquarePlay != null) return _SquarePlay!!
        
        _SquarePlay = ImageVector.Builder(
            name = "square-play",
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
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9.003f)
                arcToRelative(1f, 1f, 0f, false, true, 1.517f, -0.859f)
                lineToRelative(4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.718f)
                lineToRelative(-4.997f, 2.997f)
                arcTo(1f, 1f, 0f, false, true, 9f, 14.996f)
                close()
            }
        }.build()
        
        return _SquarePlay!!
    }

private var _SquarePlay: ImageVector? = null

