package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VectorSquare: ImageVector
    get() {
        if (_VectorSquare != null) return _VectorSquare!!
        
        _VectorSquare = ImageVector.Builder(
            name = "vector-square",
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
                moveTo(19.5f, 7f)
                arcToRelative(24f, 24f, 0f, false, true, 0f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 7f)
                arcToRelative(24f, 24f, 0f, false, false, 0f, 10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19.5f)
                arcToRelative(24f, 24f, 0f, false, false, 10f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4.5f)
                arcToRelative(24f, 24f, 0f, false, true, 10f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 17f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 18f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 21f, 22f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 17f, 21f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 18f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 22f, 3f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 21f, 7f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 17f, 6f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 18f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 7f, 18f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 6f, 22f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 2f, 21f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 3f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 2f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 7f, 3f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 6f, 7f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 2f, 6f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 3f, 2f)
                close()
            }
        }.build()
        
        return _VectorSquare!!
    }

private var _VectorSquare: ImageVector? = null

