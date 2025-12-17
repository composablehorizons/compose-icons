package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDebian: ImageVector
    get() {
        if (_BrandDebian != null) return _BrandDebian!!
        
        _BrandDebian = ImageVector.Builder(
            name = "brand-debian",
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
                moveTo(12f, 17f)
                curveToRelative(-2.397f, -0.943f, -4f, -3.153f, -4f, -5.635f)
                curveToRelative(0f, -2.19f, 1.039f, -3.14f, 1.604f, -3.595f)
                curveToRelative(2.646f, -2.133f, 6.396f, -0.27f, 6.396f, 3.23f)
                curveToRelative(0f, 2.5f, -2.905f, 2.121f, -3.5f, 1.5f)
                curveToRelative(-0.595f, -0.621f, -1f, -1.5f, -0.5f, -2.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
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
        }.build()
        
        return _BrandDebian!!
    }

private var _BrandDebian: ImageVector? = null

