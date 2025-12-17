package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
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
                moveTo(11.525f, 2.295f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, 0.95f, 0f)
                lineToRelative(2.31f, 4.679f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, 1.595f, 1.16f)
                lineToRelative(5.166f, 0.756f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, 0.294f, 0.904f)
                lineToRelative(-3.736f, 3.638f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, -0.611f, 1.878f)
                lineToRelative(0.882f, 5.14f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, -0.771f, 0.56f)
                lineToRelative(-4.618f, -2.428f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, -1.973f, 0f)
                lineTo(6.396f, 21.01f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, -0.77f, -0.56f)
                lineToRelative(0.881f, -5.139f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, -0.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, 0.294f, -0.906f)
                lineToRelative(5.165f, -0.755f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, 1.597f, -1.16f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

