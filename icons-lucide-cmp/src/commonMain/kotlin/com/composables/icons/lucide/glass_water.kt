package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GlassWater: ImageVector
    get() {
        if (_GlassWater != null) return _GlassWater!!
        
        _GlassWater = ImageVector.Builder(
            name = "glass-water",
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
                moveTo(5.116f, 4.104f)
                arcTo(1f, 1f, 0f, false, true, 6.11f, 3f)
                horizontalLineToRelative(11.78f)
                arcToRelative(1f, 1f, 0f, false, true, 0.994f, 1.105f)
                lineTo(17.19f, 20.21f)
                arcTo(2f, 2f, 0f, false, true, 15.2f, 22f)
                horizontalLineTo(8.8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -1.79f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                arcToRelative(5f, 5f, 0f, false, true, 6f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, 6f, 0f)
            }
        }.build()
        
        return _GlassWater!!
    }

private var _GlassWater: ImageVector? = null

