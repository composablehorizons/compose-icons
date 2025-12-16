package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Fan: ImageVector
    get() {
        if (_Fan != null) return _Fan!!
        
        _Fan = ImageVector.Builder(
            name = "fan",
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
                moveTo(10.827f, 16.379f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, -8.618f, -7.002f)
                lineToRelative(5.412f, 1.45f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, 7.002f, -8.618f)
                lineToRelative(-1.45f, 5.412f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, 8.618f, 7.002f)
                lineToRelative(-5.412f, -1.45f)
                arcToRelative(6.082f, 6.082f, 0f, false, true, -7.002f, 8.618f)
                lineToRelative(1.45f, -5.412f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _Fan!!
    }

private var _Fan: ImageVector? = null

