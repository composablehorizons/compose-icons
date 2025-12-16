package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shapes: ImageVector
    get() {
        if (_Shapes != null) return _Shapes!!
        
        _Shapes = ImageVector.Builder(
            name = "shapes",
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
                moveTo(8.3f, 10f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.626f, -1.079f)
                lineTo(11.4f, 3f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 1.198f, -0.043f)
                lineTo(16.3f, 8.9f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.572f, 1.1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 9f, 21f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 20f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 4f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 17.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, false, true, 14f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 21f, 17.5f)
                close()
            }
        }.build()
        
        return _Shapes!!
    }

private var _Shapes: ImageVector? = null

