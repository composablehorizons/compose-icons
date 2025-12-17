package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandHipchat: ImageVector
    get() {
        if (_BrandHipchat != null) return _BrandHipchat!!
        
        _BrandHipchat = ImageVector.Builder(
            name = "brand-hipchat",
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
                moveTo(17.802f, 17.292f)
                reflectiveCurveToRelative(0.077f, -0.055f, 0.2f, -0.149f)
                curveToRelative(1.843f, -1.425f, 3f, -3.49f, 3f, -5.789f)
                curveToRelative(0f, -4.286f, -4.03f, -7.764f, -9f, -7.764f)
                curveToRelative(-4.97f, 0f, -9f, 3.478f, -9f, 7.764f)
                curveToRelative(0f, 4.288f, 4.03f, 7.646f, 9f, 7.646f)
                curveToRelative(0.424f, 0f, 1.12f, -0.028f, 2.088f, -0.084f)
                curveToRelative(1.262f, 0.82f, 3.104f, 1.493f, 4.716f, 1.493f)
                curveToRelative(0.499f, 0f, 0.734f, -0.41f, 0.414f, -0.828f)
                curveToRelative(-0.486f, -0.596f, -1.156f, -1.551f, -1.416f, -2.29f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 13.5f)
                curveToRelative(2.5f, 2.5f, 6.5f, 2.5f, 9f, 0f)
            }
        }.build()
        
        return _BrandHipchat!!
    }

private var _BrandHipchat: ImageVector? = null

