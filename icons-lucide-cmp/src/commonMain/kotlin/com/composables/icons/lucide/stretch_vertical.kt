package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StretchVertical: ImageVector
    get() {
        if (_StretchVertical != null) return _StretchVertical!!
        
        _StretchVertical = ImageVector.Builder(
            name = "stretch-vertical",
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
                moveTo(6f, 2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 8f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 6f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 18f, 22f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 14f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 16f, 2f)
                close()
            }
        }.build()
        
        return _StretchVertical!!
    }

private var _StretchVertical: ImageVector? = null

