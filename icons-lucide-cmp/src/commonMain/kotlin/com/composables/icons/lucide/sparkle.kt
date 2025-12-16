package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sparkle: ImageVector
    get() {
        if (_Sparkle != null) return _Sparkle!!
        
        _Sparkle = ImageVector.Builder(
            name = "sparkle",
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
                moveTo(11.017f, 2.814f)
                arcToRelative(1f, 1f, 0f, false, true, 1.966f, 0f)
                lineToRelative(1.051f, 5.558f)
                arcToRelative(2f, 2f, 0f, false, false, 1.594f, 1.594f)
                lineToRelative(5.558f, 1.051f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.966f)
                lineToRelative(-5.558f, 1.051f)
                arcToRelative(2f, 2f, 0f, false, false, -1.594f, 1.594f)
                lineToRelative(-1.051f, 5.558f)
                arcToRelative(1f, 1f, 0f, false, true, -1.966f, 0f)
                lineToRelative(-1.051f, -5.558f)
                arcToRelative(2f, 2f, 0f, false, false, -1.594f, -1.594f)
                lineToRelative(-5.558f, -1.051f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.966f)
                lineToRelative(5.558f, -1.051f)
                arcToRelative(2f, 2f, 0f, false, false, 1.594f, -1.594f)
                close()
            }
        }.build()
        
        return _Sparkle!!
    }

private var _Sparkle: ImageVector? = null

