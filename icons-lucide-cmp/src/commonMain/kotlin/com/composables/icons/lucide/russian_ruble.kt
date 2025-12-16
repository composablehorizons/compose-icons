package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RussianRuble: ImageVector
    get() {
        if (_RussianRuble != null) return _RussianRuble!!
        
        _RussianRuble = ImageVector.Builder(
            name = "russian-ruble",
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
                moveTo(6f, 11f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
                horizontalLineTo(9f)
                verticalLineToRelative(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineToRelative(8f)
            }
        }.build()
        
        return _RussianRuble!!
    }

private var _RussianRuble: ImageVector? = null

