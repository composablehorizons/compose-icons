package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandEmber: ImageVector
    get() {
        if (_BrandEmber != null) return _BrandEmber!!
        
        _BrandEmber = ImageVector.Builder(
            name = "brand-ember",
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
                moveTo(3f, 12.958f)
                curveToRelative(8.466f, 1.647f, 11.112f, -1.196f, 12.17f, -2.294f)
                curveToRelative(2.116f, -2.196f, 0f, -6.589f, -2.646f, -5.49f)
                curveToRelative(-2.644f, 1.096f, -6.35f, 7.686f, -3.174f, 12.078f)
                curveToRelative(2.116f, 2.928f, 6f, 2.178f, 11.65f, -2.252f)
            }
        }.build()
        
        return _BrandEmber!!
    }

private var _BrandEmber: ImageVector? = null

