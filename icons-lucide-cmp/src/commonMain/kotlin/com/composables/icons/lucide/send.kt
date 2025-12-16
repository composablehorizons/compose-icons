package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
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
                moveTo(14.536f, 21.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.937f, -0.024f)
                lineToRelative(6.5f, -19f)
                arcToRelative(0.496f, 0.496f, 0f, false, false, -0.635f, -0.635f)
                lineToRelative(-19f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.024f, 0.937f)
                lineToRelative(7.93f, 3.18f)
                arcToRelative(2f, 2f, 0f, false, true, 1.112f, 1.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.854f, 2.147f)
                lineToRelative(-10.94f, 10.939f)
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

