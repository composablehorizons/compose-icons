package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDisney: ImageVector
    get() {
        if (_BrandDisney != null) return _BrandDisney!!
        
        _BrandDisney = ImageVector.Builder(
            name = "brand-disney",
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
                moveTo(3.22f, 5.838f)
                curveToRelative(-1.307f, -0.15f, -1.22f, -0.578f, -1.22f, -0.794f)
                curveToRelative(0f, -0.216f, 0.424f, -1.044f, 4.34f, -1.044f)
                curveToRelative(4.694f, 0f, 14.66f, 3.645f, 14.66f, 10.042f)
                reflectiveCurveToRelative(-8.71f, 4.931f, -10.435f, 4.52f)
                curveToRelative(-1.724f, -0.412f, -5.565f, -2.256f, -5.565f, -4.174f)
                curveToRelative(0f, -1.395f, 3.08f, -2.388f, 6.715f, -2.388f)
                curveToRelative(3.634f, 0f, 5.285f, 1.041f, 5.285f, 2f)
                curveToRelative(0f, 0.5f, -0.074f, 1.229f, -1f, 1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.02f, 8f)
                arcToRelative(505.153f, 505.153f, 0f, false, false, 0f, 13f)
            }
        }.build()
        
        return _BrandDisney!!
    }

private var _BrandDisney: ImageVector? = null

