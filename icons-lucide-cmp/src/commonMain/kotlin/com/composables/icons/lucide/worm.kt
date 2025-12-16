package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Worm: ImageVector
    get() {
        if (_Worm != null) return _Worm!!
        
        _Worm = ImageVector.Builder(
            name = "worm",
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
                moveTo(19f, 12f)
                lineToRelative(-1.5f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.63f, 18.81f)
                lineTo(22f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.47f, 8.23f)
                arcToRelative(1.68f, 1.68f, 0f, false, true, 2.44f, 1.93f)
                lineToRelative(-0.64f, 2.08f)
                arcToRelative(6.76f, 6.76f, 0f, false, false, 10.16f, 7.67f)
                lineToRelative(0.42f, -0.27f)
                arcToRelative(1f, 1f, 0f, true, false, -2.73f, -4.21f)
                lineToRelative(-0.42f, 0.27f)
                arcToRelative(1.76f, 1.76f, 0f, false, true, -2.63f, -1.99f)
                lineToRelative(0.64f, -2.08f)
                arcTo(6.66f, 6.66f, 0f, false, false, 3.94f, 3.9f)
                lineToRelative(-0.7f, 0.4f)
                arcToRelative(1f, 1f, 0f, true, false, 2.55f, 4.34f)
                close()
            }
        }.build()
        
        return _Worm!!
    }

private var _Worm: ImageVector? = null

