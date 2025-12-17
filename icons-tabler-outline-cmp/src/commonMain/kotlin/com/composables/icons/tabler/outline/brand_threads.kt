package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandThreads: ImageVector
    get() {
        if (_BrandThreads != null) return _BrandThreads!!
        
        _BrandThreads = ImageVector.Builder(
            name = "brand-threads",
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
                moveTo(19f, 7.5f)
                curveToRelative(-1.333f, -3f, -3.667f, -4.5f, -7f, -4.5f)
                curveToRelative(-5f, 0f, -8f, 2.5f, -8f, 9f)
                reflectiveCurveToRelative(3.5f, 9f, 8f, 9f)
                reflectiveCurveToRelative(7f, -3f, 7f, -5f)
                reflectiveCurveToRelative(-1f, -5f, -7f, -5f)
                curveToRelative(-2.5f, 0f, -3f, 1.25f, -3f, 2.5f)
                curveToRelative(0f, 1.5f, 1f, 2.5f, 2.5f, 2.5f)
                curveToRelative(2.5f, 0f, 3.5f, -1.5f, 3.5f, -5f)
                reflectiveCurveToRelative(-2f, -4f, -3f, -4f)
                reflectiveCurveToRelative(-1.833f, 0.333f, -2.5f, 1f)
            }
        }.build()
        
        return _BrandThreads!!
    }

private var _BrandThreads: ImageVector? = null

