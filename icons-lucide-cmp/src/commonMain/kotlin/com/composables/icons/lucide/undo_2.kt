package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Undo2: ImageVector
    get() {
        if (_Undo2 != null) return _Undo2!!
        
        _Undo2 = ImageVector.Builder(
            name = "undo-2",
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
                moveTo(9f, 14f)
                lineTo(4f, 9f)
                lineToRelative(5f, -5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                horizontalLineToRelative(10.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.5f, 5.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -5.5f, 5.5f)
                horizontalLineTo(11f)
            }
        }.build()
        
        return _Undo2!!
    }

private var _Undo2: ImageVector? = null

