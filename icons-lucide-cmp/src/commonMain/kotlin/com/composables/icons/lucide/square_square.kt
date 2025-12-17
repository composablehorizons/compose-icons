package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareSquare: ImageVector
    get() {
        if (_SquareSquare != null) return _SquareSquare!!
        
        _SquareSquare = ImageVector.Builder(
            name = "square-square",
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 16f, 9f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 15f, 16f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 15f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 9f, 8f)
                close()
            }
        }.build()
        
        return _SquareSquare!!
    }

private var _SquareSquare: ImageVector? = null

