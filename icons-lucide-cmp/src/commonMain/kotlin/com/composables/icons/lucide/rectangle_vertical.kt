package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RectangleVertical: ImageVector
    get() {
        if (_RectangleVertical != null) return _RectangleVertical!!
        
        _RectangleVertical = ImageVector.Builder(
            name = "rectangle-vertical",
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
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 16f, 22f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 8f, 2f)
                close()
            }
        }.build()
        
        return _RectangleVertical!!
    }

private var _RectangleVertical: ImageVector? = null

