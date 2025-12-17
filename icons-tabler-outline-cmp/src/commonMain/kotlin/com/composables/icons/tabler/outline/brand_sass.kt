package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSass: ImageVector
    get() {
        if (_BrandSass != null) return _BrandSass!!
        
        _BrandSass = ImageVector.Builder(
            name = "brand-sass",
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
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10.523f)
                curveToRelative(2.46f, -0.826f, 4f, -0.826f, 4f, -2.155f)
                curveToRelative(0f, -1.366f, -1.347f, -1.366f, -2.735f, -1.366f)
                curveToRelative(-1.91f, 0f, -3.352f, 0.49f, -4.537f, 1.748f)
                curveToRelative(-0.848f, 0.902f, -1.027f, 2.449f, -0.153f, 3.307f)
                curveToRelative(0.973f, 0.956f, 3.206f, 1.789f, 2.884f, 3.493f)
                curveToRelative(-0.233f, 1.235f, -1.469f, 1.823f, -2.617f, 1.202f)
                curveToRelative(-0.782f, -0.424f, -0.454f, -1.746f, 0.626f, -2.512f)
                reflectiveCurveToRelative(2.822f, -0.992f, 4.1f, -0.24f)
                curveToRelative(0.98f, 0.575f, 1.046f, 1.724f, 0.434f, 2.193f)
            }
        }.build()
        
        return _BrandSass!!
    }

private var _BrandSass: ImageVector? = null

