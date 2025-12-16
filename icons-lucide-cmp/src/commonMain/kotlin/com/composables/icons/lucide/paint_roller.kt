package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PaintRoller: ImageVector
    get() {
        if (_PaintRoller != null) return _PaintRoller!!
        
        _PaintRoller = ImageVector.Builder(
            name = "paint-roller",
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
                moveTo(4f, 2f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 18f, 4f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 16f, 8f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 6f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 4f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16f)
                horizontalLineTo(11f)
                arcTo(1f, 1f, 0f, false, true, 12f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 11f, 22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 9f, 16f)
                close()
            }
        }.build()
        
        return _PaintRoller!!
    }

private var _PaintRoller: ImageVector? = null

