package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPatreon: ImageVector
    get() {
        if (_BrandPatreon != null) return _BrandPatreon!!
        
        _BrandPatreon = ImageVector.Builder(
            name = "brand-patreon",
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
                moveTo(20f, 8.408f)
                curveToRelative(-0.003f, -2.299f, -1.746f, -4.182f, -3.79f, -4.862f)
                curveToRelative(-2.54f, -0.844f, -5.888f, -0.722f, -8.312f, 0.453f)
                curveToRelative(-2.939f, 1.425f, -3.862f, 4.545f, -3.896f, 7.656f)
                curveToRelative(-0.028f, 2.559f, 0.22f, 9.297f, 3.92f, 9.345f)
                curveToRelative(2.75f, 0.036f, 3.159f, -3.603f, 4.43f, -5.356f)
                curveToRelative(0.906f, -1.247f, 2.071f, -1.599f, 3.506f, -1.963f)
                curveToRelative(2.465f, -0.627f, 4.146f, -2.626f, 4.142f, -5.273f)
                close()
            }
        }.build()
        
        return _BrandPatreon!!
    }

private var _BrandPatreon: ImageVector? = null

