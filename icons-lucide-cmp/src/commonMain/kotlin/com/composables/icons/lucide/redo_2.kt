package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Redo2: ImageVector
    get() {
        if (_Redo2 != null) return _Redo2!!
        
        _Redo2 = ImageVector.Builder(
            name = "redo-2",
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
                moveTo(15f, 14f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                horizontalLineTo(9.5f)
                arcTo(5.5f, 5.5f, 0f, false, false, 4f, 14.5f)
                arcTo(5.5f, 5.5f, 0f, false, false, 9.5f, 20f)
                horizontalLineTo(13f)
            }
        }.build()
        
        return _Redo2!!
    }

private var _Redo2: ImageVector? = null

