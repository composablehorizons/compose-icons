package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Banknote: ImageVector
    get() {
        if (_Banknote != null) return _Banknote!!
        
        _Banknote = ImageVector.Builder(
            name = "banknote",
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
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 20f, 18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 4f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(0.01f)
                moveTo(18f, 12f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Banknote!!
    }

private var _Banknote: ImageVector? = null

