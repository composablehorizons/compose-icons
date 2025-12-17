package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandStripe: ImageVector
    get() {
        if (_BrandStripe != null) return _BrandStripe!!
        
        _BrandStripe = ImageVector.Builder(
            name = "brand-stripe",
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
                moveTo(11.453f, 8.056f)
                curveToRelative(0f, -0.623f, 0.518f, -0.979f, 1.442f, -0.979f)
                curveToRelative(1.69f, 0f, 3.41f, 0.343f, 4.605f, 0.923f)
                lineToRelative(0.5f, -4f)
                curveToRelative(-0.948f, -0.449f, -2.82f, -1f, -5.5f, -1f)
                curveToRelative(-1.895f, 0f, -3.373f, 0.087f, -4.5f, 1f)
                curveToRelative(-1.172f, 0.956f, -2f, 2.33f, -2f, 4f)
                curveToRelative(0f, 3.03f, 1.958f, 4.906f, 5f, 6f)
                curveToRelative(1.961f, 0.69f, 3f, 0.743f, 3f, 1.5f)
                curveToRelative(0f, 0.735f, -0.851f, 1.5f, -2f, 1.5f)
                curveToRelative(-1.423f, 0f, -3.963f, -0.609f, -5.5f, -1.5f)
                lineToRelative(-0.5f, 4f)
                curveToRelative(1.321f, 0.734f, 3.474f, 1.5f, 6f, 1.5f)
                curveToRelative(2f, 0f, 3.957f, -0.468f, 5.084f, -1.36f)
                curveToRelative(1.263f, -0.979f, 1.916f, -2.268f, 1.916f, -4.14f)
                curveToRelative(0f, -3.096f, -1.915f, -4.547f, -5f, -5.637f)
                curveToRelative(-1.646f, -0.605f, -2.544f, -1.07f, -2.544f, -1.807f)
                close()
            }
        }.build()
        
        return _BrandStripe!!
    }

private var _BrandStripe: ImageVector? = null

