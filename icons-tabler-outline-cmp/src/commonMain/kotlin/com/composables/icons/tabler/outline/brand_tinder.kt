package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTinder: ImageVector
    get() {
        if (_BrandTinder != null) return _BrandTinder!!
        
        _BrandTinder = ImageVector.Builder(
            name = "brand-tinder",
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
                moveTo(18.918f, 8.174f)
                curveToRelative(2.56f, 4.982f, 0.501f, 11.656f, -5.38f, 12.626f)
                curveToRelative(-7.702f, 1.687f, -12.84f, -7.716f, -7.054f, -13.229f)
                curveToRelative(0.309f, -0.305f, 1.161f, -1.095f, 1.516f, -1.349f)
                curveToRelative(0f, 0.528f, 0.27f, 3.475f, 1f, 3.167f)
                curveToRelative(3f, 0f, 4f, -4.222f, 3.587f, -7.389f)
                curveToRelative(2.7f, 1.411f, 4.987f, 3.376f, 6.331f, 6.174f)
                close()
            }
        }.build()
        
        return _BrandTinder!!
    }

private var _BrandTinder: ImageVector? = null

