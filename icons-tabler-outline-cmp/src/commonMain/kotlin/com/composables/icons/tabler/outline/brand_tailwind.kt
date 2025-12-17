package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTailwind: ImageVector
    get() {
        if (_BrandTailwind != null) return _BrandTailwind!!
        
        _BrandTailwind = ImageVector.Builder(
            name = "brand-tailwind",
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
                moveTo(11.667f, 6f)
                curveToRelative(-2.49f, 0f, -4.044f, 1.222f, -4.667f, 3.667f)
                curveToRelative(0.933f, -1.223f, 2.023f, -1.68f, 3.267f, -1.375f)
                curveToRelative(0.71f, 0.174f, 1.217f, 0.68f, 1.778f, 1.24f)
                curveToRelative(0.916f, 0.912f, 2f, 1.968f, 4.288f, 1.968f)
                curveToRelative(2.49f, 0f, 4.044f, -1.222f, 4.667f, -3.667f)
                curveToRelative(-0.933f, 1.223f, -2.023f, 1.68f, -3.267f, 1.375f)
                curveToRelative(-0.71f, -0.174f, -1.217f, -0.68f, -1.778f, -1.24f)
                curveToRelative(-0.916f, -0.912f, -1.975f, -1.968f, -4.288f, -1.968f)
                close()
                moveToRelative(-4f, 6.5f)
                curveToRelative(-2.49f, 0f, -4.044f, 1.222f, -4.667f, 3.667f)
                curveToRelative(0.933f, -1.223f, 2.023f, -1.68f, 3.267f, -1.375f)
                curveToRelative(0.71f, 0.174f, 1.217f, 0.68f, 1.778f, 1.24f)
                curveToRelative(0.916f, 0.912f, 1.975f, 1.968f, 4.288f, 1.968f)
                curveToRelative(2.49f, 0f, 4.044f, -1.222f, 4.667f, -3.667f)
                curveToRelative(-0.933f, 1.223f, -2.023f, 1.68f, -3.267f, 1.375f)
                curveToRelative(-0.71f, -0.174f, -1.217f, -0.68f, -1.778f, -1.24f)
                curveToRelative(-0.916f, -0.912f, -1.975f, -1.968f, -4.288f, -1.968f)
                close()
            }
        }.build()
        
        return _BrandTailwind!!
    }

private var _BrandTailwind: ImageVector? = null

