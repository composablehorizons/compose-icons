package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSymfony: ImageVector
    get() {
        if (_BrandSymfony != null) return _BrandSymfony!!
        
        _BrandSymfony = ImageVector.Builder(
            name = "brand-symfony",
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
                moveTo(6f, 13f)
                curveToRelative(0.458f, 0.667f, 1.125f, 1f, 2f, 1f)
                curveToRelative(1.313f, 0f, 2f, -0.875f, 2f, -1.5f)
                curveToRelative(0f, -1.5f, -2f, -1f, -2f, -2f)
                curveToRelative(0f, -0.625f, 0.516f, -1.5f, 1.5f, -1.5f)
                curveToRelative(2.5f, 0f, 1.563f, 2f, 5.5f, 2f)
                curveToRelative(0.667f, 0f, 1f, -0.333f, 1f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                curveToRelative(-0.095f, 0.667f, 0.238f, 1f, 1f, 1f)
                curveToRelative(1.714f, 0f, 2.714f, -2f, 3f, -6f)
                curveToRelative(0.286f, -4f, 1.571f, -6f, 3f, -6f)
                curveToRelative(0.571f, 0f, 0.905f, 0.333f, 1f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                arcToRelative(10f, 10f, 0f, false, true, 10f, 10f)
                close()
            }
        }.build()
        
        return _BrandSymfony!!
    }

private var _BrandSymfony: ImageVector? = null

