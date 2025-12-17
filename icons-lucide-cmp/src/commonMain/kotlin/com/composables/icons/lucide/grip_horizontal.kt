package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GripHorizontal: ImageVector
    get() {
        if (_GripHorizontal != null) return _GripHorizontal!!
        
        _GripHorizontal = ImageVector.Builder(
            name = "grip-horizontal",
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
                moveTo(13f, 9f)
                arcTo(1f, 1f, 0f, false, true, 12f, 10f)
                arcTo(1f, 1f, 0f, false, true, 11f, 9f)
                arcTo(1f, 1f, 0f, false, true, 13f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                arcTo(1f, 1f, 0f, false, true, 19f, 10f)
                arcTo(1f, 1f, 0f, false, true, 18f, 9f)
                arcTo(1f, 1f, 0f, false, true, 20f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                arcTo(1f, 1f, 0f, false, true, 5f, 10f)
                arcTo(1f, 1f, 0f, false, true, 4f, 9f)
                arcTo(1f, 1f, 0f, false, true, 6f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 15f)
                arcTo(1f, 1f, 0f, false, true, 12f, 16f)
                arcTo(1f, 1f, 0f, false, true, 11f, 15f)
                arcTo(1f, 1f, 0f, false, true, 13f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 15f)
                arcTo(1f, 1f, 0f, false, true, 19f, 16f)
                arcTo(1f, 1f, 0f, false, true, 18f, 15f)
                arcTo(1f, 1f, 0f, false, true, 20f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                arcTo(1f, 1f, 0f, false, true, 5f, 16f)
                arcTo(1f, 1f, 0f, false, true, 4f, 15f)
                arcTo(1f, 1f, 0f, false, true, 6f, 15f)
                close()
            }
        }.build()
        
        return _GripHorizontal!!
    }

private var _GripHorizontal: ImageVector? = null

