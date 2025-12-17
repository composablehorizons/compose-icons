package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMcdonalds: ImageVector
    get() {
        if (_BrandMcdonalds != null) return _BrandMcdonalds!!
        
        _BrandMcdonalds = ImageVector.Builder(
            name = "brand-mcdonalds",
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
                moveTo(20f, 20f)
                curveToRelative(0f, -3.952f, -0.966f, -16f, -4.038f, -16f)
                reflectiveCurveToRelative(-3.962f, 9.087f, -3.962f, 14.756f)
                curveToRelative(0f, -5.669f, -0.896f, -14.756f, -3.962f, -14.756f)
                curveToRelative(-3.065f, 0f, -4.038f, 12.048f, -4.038f, 16f)
            }
        }.build()
        
        return _BrandMcdonalds!!
    }

private var _BrandMcdonalds: ImageVector? = null

