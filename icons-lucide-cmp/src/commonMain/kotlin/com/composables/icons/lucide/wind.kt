package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Wind: ImageVector
    get() {
        if (_Wind != null) return _Wind!!
        
        _Wind = ImageVector.Builder(
            name = "wind",
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
                moveTo(12.8f, 19.6f)
                arcTo(2f, 2f, 0f, true, false, 14f, 16f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 2f, 4f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.8f, 4.4f)
                arcTo(2f, 2f, 0f, true, true, 11f, 8f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _Wind!!
    }

private var _Wind: ImageVector? = null

