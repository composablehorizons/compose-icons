package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Blend: ImageVector
    get() {
        if (_Blend != null) return _Blend!!
        
        _Blend = ImageVector.Builder(
            name = "blend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 9f)
                arcTo(7f, 7f, 0f, false, true, 9f, 16f)
                arcTo(7f, 7f, 0f, false, true, 2f, 9f)
                arcTo(7f, 7f, 0f, false, true, 16f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                arcTo(7f, 7f, 0f, false, true, 15f, 22f)
                arcTo(7f, 7f, 0f, false, true, 8f, 15f)
                arcTo(7f, 7f, 0f, false, true, 22f, 15f)
                close()
            }
        }.build()
        
        return _Blend!!
    }

private var _Blend: ImageVector? = null

