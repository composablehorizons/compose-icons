package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RotateCcwKey: ImageVector
    get() {
        if (_RotateCcwKey != null) return _RotateCcwKey!!
        
        _RotateCcwKey = ImageVector.Builder(
            name = "rotate-ccw-key",
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
                moveTo(14.5f, 9.5f)
                lineToRelative(1f, 1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 8.5f)
                lineToRelative(-4f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, true, false, 9f, -9f)
                arcToRelative(9.74f, 9.74f, 0f, false, false, -6.74f, 2.74f)
                lineTo(3f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 16f)
                arcTo(2f, 2f, 0f, false, true, 8f, 14f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                close()
            }
        }.build()
        
        return _RotateCcwKey!!
    }

private var _RotateCcwKey: ImageVector? = null

