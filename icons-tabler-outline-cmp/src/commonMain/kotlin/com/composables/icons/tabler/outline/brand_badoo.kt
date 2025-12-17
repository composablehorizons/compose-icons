package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBadoo: ImageVector
    get() {
        if (_BrandBadoo != null) return _BrandBadoo!!
        
        _BrandBadoo = ImageVector.Builder(
            name = "brand-badoo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9.43f)
                curveToRelative(0f, 5.838f, -4.477f, 10.57f, -10f, 10.57f)
                reflectiveCurveToRelative(-10f, -4.662f, -10f, -10.5f)
                curveToRelative(0f, -2.667f, 1.83f, -5.01f, 4.322f, -5.429f)
                curveToRelative(2.492f, -0.418f, 4.9f, 1.392f, 5.678f, 3.929f)
                curveToRelative(0.768f, -2.54f, 3.177f, -4.354f, 5.668f, -3.931f)
                curveToRelative(2.495f, 0.417f, 4.332f, 2.69f, 4.332f, 5.36f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 10f)
                curveToRelative(0f, 2.761f, 2.015f, 5f, 4.5f, 5f)
                reflectiveCurveToRelative(4.5f, -2.239f, 4.5f, -5f)
            }
        }.build()
        
        return _BrandBadoo!!
    }

private var _BrandBadoo: ImageVector? = null

