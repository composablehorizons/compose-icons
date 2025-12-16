package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
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
                moveTo(5f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 3.008f, -1.728f)
                lineToRelative(11.997f, 6.998f)
                arcToRelative(2f, 2f, 0f, false, true, 0.003f, 3.458f)
                lineToRelative(-12f, 7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 19f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

