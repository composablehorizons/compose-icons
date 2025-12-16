package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Slice: ImageVector
    get() {
        if (_Slice != null) return _Slice!!
        
        _Slice = ImageVector.Builder(
            name = "slice",
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
                moveTo(11f, 16.586f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                lineTo(18.37f, 3.63f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                lineToRelative(-9.663f, 9.663f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineTo(8f, 14f)
            }
        }.build()
        
        return _Slice!!
    }

private var _Slice: ImageVector? = null

