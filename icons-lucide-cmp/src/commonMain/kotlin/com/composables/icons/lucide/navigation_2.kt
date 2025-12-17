package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Navigation2: ImageVector
    get() {
        if (_Navigation2 != null) return _Navigation2!!
        
        _Navigation2 = ImageVector.Builder(
            name = "navigation-2",
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
                moveTo(12f, 2f)
                lineTo(19f, 21f)
                lineTo(12f, 17f)
                lineTo(5f, 21f)
                lineTo(12f, 2f)
                close()
            }
        }.build()
        
        return _Navigation2!!
    }

private var _Navigation2: ImageVector? = null

