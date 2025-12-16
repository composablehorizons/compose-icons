package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dot: ImageVector
    get() {
        if (_Dot != null) return _Dot!!
        
        _Dot = ImageVector.Builder(
            name = "dot",
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
                moveTo(13.1f, 12.1f)
                arcTo(1f, 1f, 0f, false, true, 12.1f, 13.1f)
                arcTo(1f, 1f, 0f, false, true, 11.1f, 12.1f)
                arcTo(1f, 1f, 0f, false, true, 13.1f, 12.1f)
                close()
            }
        }.build()
        
        return _Dot!!
    }

private var _Dot: ImageVector? = null

