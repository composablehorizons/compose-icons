package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAirbnb: ImageVector
    get() {
        if (_BrandAirbnb != null) return _BrandAirbnb!!
        
        _BrandAirbnb = ImageVector.Builder(
            name = "brand-airbnb",
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
                moveTo(12f, 10f)
                curveToRelative(-2f, 0f, -3f, 1f, -3f, 3f)
                curveToRelative(0f, 1.5f, 1.494f, 3.535f, 3f, 5.5f)
                curveToRelative(1f, 1f, 1.5f, 1.5f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, 1f, 4.5f, -0.5f)
                reflectiveCurveToRelative(1.5f, -3.5f, 0.5f, -6f)
                reflectiveCurveToRelative(-2.333f, -5.5f, -5f, -9.5f)
                curveToRelative(-0.834f, -1f, -1.5f, -1.5f, -2.503f, -1.5f)
                curveToRelative(-1f, 0f, -1.623f, 0.45f, -2.497f, 1.5f)
                curveToRelative(-2.667f, 4f, -4f, 7f, -5f, 9.5f)
                reflectiveCurveToRelative(-1.5f, 4.5f, 0.5f, 6f)
                reflectiveCurveToRelative(3.5f, 1f, 4.5f, 0.5f)
                reflectiveCurveToRelative(1.5f, -1f, 2.5f, -2f)
                curveToRelative(1.506f, -1.965f, 3f, -4f, 3f, -5.5f)
                curveToRelative(0f, -2f, -1f, -3f, -3f, -3f)
                close()
            }
        }.build()
        
        return _BrandAirbnb!!
    }

private var _BrandAirbnb: ImageVector? = null

