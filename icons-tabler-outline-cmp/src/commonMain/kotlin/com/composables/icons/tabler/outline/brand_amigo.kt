package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAmigo: ImageVector
    get() {
        if (_BrandAmigo != null) return _BrandAmigo!!
        
        _BrandAmigo = ImageVector.Builder(
            name = "brand-amigo",
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
                moveTo(12f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.591f, 3.635f)
                lineToRelative(-7.13f, 14.082f)
                curveToRelative(-1.712f, 3.38f, 1.759f, 5.45f, 3.69f, 3.573f)
                lineToRelative(1.86f, -1.81f)
                curveToRelative(3.142f, -3.054f, 4.959f, -2.99f, 8.039f, 0.11f)
                lineToRelative(1.329f, 1.337f)
                curveToRelative(2.372f, 2.387f, 5.865f, 0.078f, 4.176f, -3.225f)
                lineToRelative(-7.195f, -14.067f)
                curveToRelative(-1.114f, -2.18f, -3.666f, -2.18f, -4.77f, 0f)
                close()
            }
        }.build()
        
        return _BrandAmigo!!
    }

private var _BrandAmigo: ImageVector? = null

