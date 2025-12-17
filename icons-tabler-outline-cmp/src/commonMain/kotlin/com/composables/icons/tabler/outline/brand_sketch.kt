package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSketch: ImageVector
    get() {
        if (_BrandSketch != null) return _BrandSketch!!
        
        _BrandSketch = ImageVector.Builder(
            name = "brand-sketch",
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
                moveTo(3.262f, 10.878f)
                lineToRelative(8f, 8.789f)
                curveToRelative(0.4f, 0.44f, 1.091f, 0.44f, 1.491f, 0f)
                lineToRelative(8f, -8.79f)
                curveToRelative(0.313f, -0.344f, 0.349f, -0.859f, 0.087f, -1.243f)
                lineToRelative(-3.537f, -5.194f)
                arcToRelative(1f, 1f, 0f, false, false, -0.823f, -0.436f)
                horizontalLineToRelative(-8.926f)
                arcToRelative(1f, 1f, 0f, false, false, -0.823f, 0.436f)
                lineToRelative(-3.54f, 5.192f)
                curveToRelative(-0.263f, 0.385f, -0.227f, 0.901f, 0.087f, 1.246f)
                close()
            }
        }.build()
        
        return _BrandSketch!!
    }

private var _BrandSketch: ImageVector? = null

