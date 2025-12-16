package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Music3: ImageVector
    get() {
        if (_Music3 != null) return _Music3!!
        
        _Music3 = ImageVector.Builder(
            name = "music-3",
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
                moveTo(16f, 18f)
                arcTo(4f, 4f, 0f, false, true, 12f, 22f)
                arcTo(4f, 4f, 0f, false, true, 8f, 18f)
                arcTo(4f, 4f, 0f, false, true, 16f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 18f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _Music3!!
    }

private var _Music3: ImageVector? = null

