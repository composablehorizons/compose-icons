package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GripVertical: ImageVector
    get() {
        if (_GripVertical != null) return _GripVertical!!
        
        _GripVertical = ImageVector.Builder(
            name = "grip-vertical",
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
                moveTo(10f, 12f)
                arcTo(1f, 1f, 0f, false, true, 9f, 13f)
                arcTo(1f, 1f, 0f, false, true, 8f, 12f)
                arcTo(1f, 1f, 0f, false, true, 10f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5f)
                arcTo(1f, 1f, 0f, false, true, 9f, 6f)
                arcTo(1f, 1f, 0f, false, true, 8f, 5f)
                arcTo(1f, 1f, 0f, false, true, 10f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 19f)
                arcTo(1f, 1f, 0f, false, true, 9f, 20f)
                arcTo(1f, 1f, 0f, false, true, 8f, 19f)
                arcTo(1f, 1f, 0f, false, true, 10f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                arcTo(1f, 1f, 0f, false, true, 15f, 13f)
                arcTo(1f, 1f, 0f, false, true, 14f, 12f)
                arcTo(1f, 1f, 0f, false, true, 16f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                arcTo(1f, 1f, 0f, false, true, 15f, 6f)
                arcTo(1f, 1f, 0f, false, true, 14f, 5f)
                arcTo(1f, 1f, 0f, false, true, 16f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                arcTo(1f, 1f, 0f, false, true, 15f, 20f)
                arcTo(1f, 1f, 0f, false, true, 14f, 19f)
                arcTo(1f, 1f, 0f, false, true, 16f, 19f)
                close()
            }
        }.build()
        
        return _GripVertical!!
    }

private var _GripVertical: ImageVector? = null

