package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LampFloor: ImageVector
    get() {
        if (_LampFloor != null) return _LampFloor!!
        
        _LampFloor = ImageVector.Builder(
            name = "lamp-floor",
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
                moveTo(12f, 10f)
                verticalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.929f, 7.629f)
                arcTo(1f, 1f, 0f, false, true, 17f, 9f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -0.928f, -1.371f)
                lineToRelative(2f, -5f)
                arcTo(1f, 1f, 0f, false, true, 9f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 0.928f, 0.629f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _LampFloor!!
    }

private var _LampFloor: ImageVector? = null

