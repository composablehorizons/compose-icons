package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareM: ImageVector
    get() {
        if (_SquareM != null) return _SquareM!!
        
        _SquareM = ImageVector.Builder(
            name = "square-m",
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
                moveTo(8f, 16f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.9f, -0.3f)
                lineToRelative(2.7f, 3.599f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.8f, 0f)
                lineToRelative(2.7f, -3.6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.9f, 0.3f)
                verticalLineTo(16f)
            }
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
        }.build()
        
        return _SquareM!!
    }

private var _SquareM: ImageVector? = null

