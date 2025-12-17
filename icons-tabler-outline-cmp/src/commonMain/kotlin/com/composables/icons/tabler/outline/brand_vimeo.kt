package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVimeo: ImageVector
    get() {
        if (_BrandVimeo != null) return _BrandVimeo!!
        
        _BrandVimeo = ImageVector.Builder(
            name = "brand-vimeo",
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
                moveTo(3f, 8.5f)
                lineToRelative(1f, 1f)
                reflectiveCurveToRelative(1.5f, -1.102f, 2f, -0.5f)
                curveToRelative(0.509f, 0.609f, 1.863f, 7.65f, 2.5f, 9f)
                curveToRelative(0.556f, 1.184f, 1.978f, 2.89f, 4f, 1.5f)
                curveToRelative(2f, -1.5f, 7.5f, -5.5f, 8.5f, -11.5f)
                curveToRelative(0.444f, -2.661f, -1f, -4f, -2.5f, -4f)
                curveToRelative(-2f, 0f, -4.047f, 1.202f, -4.5f, 4f)
                curveToRelative(2.05f, -1.254f, 2.551f, 1f, 1.5f, 3f)
                curveToRelative(-1.052f, 2f, -2f, 3f, -2.5f, 3f)
                curveToRelative(-0.49f, 0f, -0.924f, -1.165f, -1.5f, -3.5f)
                curveToRelative(-0.59f, -2.42f, -0.5f, -6.5f, -3f, -6.5f)
                reflectiveCurveToRelative(-5.5f, 4.5f, -5.5f, 4.5f)
                close()
            }
        }.build()
        
        return _BrandVimeo!!
    }

private var _BrandVimeo: ImageVector? = null

