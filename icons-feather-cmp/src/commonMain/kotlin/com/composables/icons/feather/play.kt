package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Play: ImageVector
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
                moveTo(5f, 3f)
                lineTo(19f, 12f)
                lineTo(5f, 21f)
                lineTo(5f, 3f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

