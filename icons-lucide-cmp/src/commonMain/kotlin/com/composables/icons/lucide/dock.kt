package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dock: ImageVector
    get() {
        if (_Dock != null) return _Dock!!
        
        _Dock = ImageVector.Builder(
            name = "dock",
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
                moveTo(2f, 8f)
                horizontalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                horizontalLineToRelative(12f)
            }
        }.build()
        
        return _Dock!!
    }

private var _Dock: ImageVector? = null

