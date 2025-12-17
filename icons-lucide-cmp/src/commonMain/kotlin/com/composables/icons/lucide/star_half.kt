package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) return _StarHalf!!
        
        _StarHalf = ImageVector.Builder(
            name = "star-half",
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
                moveTo(12f, 18.338f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -0.987f, 0.244f)
                lineTo(6.396f, 21.01f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, -0.77f, -0.56f)
                lineToRelative(0.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -0.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, 0.294f, -0.906f)
                lineToRelative(5.165f, -0.755f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, 1.597f, -1.16f)
                lineToRelative(2.309f, -4.679f)
                arcTo(0.53f, 0.53f, 0f, false, true, 12f, 2f)
            }
        }.build()
        
        return _StarHalf!!
    }

private var _StarHalf: ImageVector? = null

