package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignEndHorizontal: ImageVector
    get() {
        if (_AlignEndHorizontal != null) return _AlignEndHorizontal!!
        
        _AlignEndHorizontal = ImageVector.Builder(
            name = "align-end-horizontal",
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
                moveTo(6f, 2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 8f, 18f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 6f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 11f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 18f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 16f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, false, true, 16f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
            }
        }.build()
        
        return _AlignEndHorizontal!!
    }

private var _AlignEndHorizontal: ImageVector? = null

