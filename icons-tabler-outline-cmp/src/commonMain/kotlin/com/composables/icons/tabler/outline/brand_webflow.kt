package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWebflow: ImageVector
    get() {
        if (_BrandWebflow != null) return _BrandWebflow!!
        
        _BrandWebflow = ImageVector.Builder(
            name = "brand-webflow",
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
                moveTo(17f, 10f)
                reflectiveCurveToRelative(-1.376f, 3.606f, -1.5f, 4f)
                curveToRelative(-0.046f, -0.4f, -1.5f, -8f, -1.5f, -8f)
                curveToRelative(-2.627f, 0f, -3.766f, 1.562f, -4.5f, 3.5f)
                curveToRelative(0f, 0f, -1.843f, 4.593f, -2f, 5f)
                curveToRelative(-0.013f, -0.368f, -0.5f, -4.5f, -0.5f, -4.5f)
                curveToRelative(-0.15f, -2.371f, -2.211f, -3.98f, -4f, -3.98f)
                lineToRelative(2f, 12.98f)
                curveToRelative(2.745f, -0.013f, 4.72f, -1.562f, 5.5f, -3.5f)
                curveToRelative(0f, 0f, 1.44f, -4.3f, 1.5f, -4.5f)
                curveToRelative(0.013f, 0.18f, 1f, 8f, 1f, 8f)
                curveToRelative(2.758f, 0f, 4.694f, -1.626f, 5.5f, -3.5f)
                lineToRelative(3.5f, -9.5f)
                curveToRelative(-2.732f, 0f, -4.253f, 2.055f, -5f, 4f)
                close()
            }
        }.build()
        
        return _BrandWebflow!!
    }

private var _BrandWebflow: ImageVector? = null

