package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVinted: ImageVector
    get() {
        if (_BrandVinted != null) return _BrandVinted!!
        
        _BrandVinted = ImageVector.Builder(
            name = "brand-vinted",
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
                moveTo(11.028f, 6f)
                curveToRelative(0f, 7.695f, -0.292f, 11.728f, 0f, 12f)
                curveToRelative(2.046f, -5f, 4.246f, -12.642f, 5.252f, -14.099f)
                curveToRelative(0.343f, -0.497f, 0.768f, -0.93f, 1.257f, -1.277f)
                curveToRelative(0.603f, -0.39f, 1.292f, -0.76f, 1.463f, -0.575f)
                curveToRelative(-0.07f, 2.319f, -4.023f, 15.822f, -4.209f, 16.314f)
                arcToRelative(6.135f, 6.135f, 0f, false, true, -3.465f, 3.386f)
                curveToRelative(-3.213f, 0.78f, -3.429f, -0.446f, -3.836f, -1.134f)
                curveToRelative(-0.95f, -2.103f, -1.682f, -14.26f, -1.445f, -15.615f)
                curveToRelative(0.05f, -0.523f, 0.143f, -1.851f, 2.491f, -2f)
                curveToRelative(2.359f, -0.354f, 2.547f, 1.404f, 2.492f, 3f)
                close()
            }
        }.build()
        
        return _BrandVinted!!
    }

private var _BrandVinted: ImageVector? = null

