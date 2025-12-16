package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Infinity: ImageVector
    get() {
        if (_Infinity != null) return _Infinity!!
        
        _Infinity = ImageVector.Builder(
            name = "infinity",
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
                moveTo(6f, 16f)
                curveToRelative(5f, 0f, 7f, -8f, 12f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                curveToRelative(-5f, 0f, -7f, -8f, -12f, -8f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
            }
        }.build()
        
        return _Infinity!!
    }

private var _Infinity: ImageVector? = null

