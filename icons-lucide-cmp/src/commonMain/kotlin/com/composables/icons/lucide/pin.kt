package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
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
                moveTo(12f, 17f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10.76f)
                arcToRelative(2f, 2f, 0f, false, true, -1.11f, 1.79f)
                lineToRelative(-1.78f, 0.9f)
                arcTo(2f, 2f, 0f, false, false, 5f, 15.24f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-0.76f)
                arcToRelative(2f, 2f, 0f, false, false, -1.11f, -1.79f)
                lineToRelative(-1.78f, -0.9f)
                arcTo(2f, 2f, 0f, false, true, 15f, 10.76f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

