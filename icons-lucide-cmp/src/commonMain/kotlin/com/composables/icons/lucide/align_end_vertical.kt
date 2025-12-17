package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignEndVertical: ImageVector
    get() {
        if (_AlignEndVertical != null) return _AlignEndVertical!!
        
        _AlignEndVertical = ImageVector.Builder(
            name = "align-end-vertical",
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
                moveTo(4f, 4f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 6f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 16f, 10f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 8f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 16f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 16f, 20f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, false, true, 9f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 11f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _AlignEndVertical!!
    }

private var _AlignEndVertical: ImageVector? = null

