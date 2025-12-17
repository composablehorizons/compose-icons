package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAmazon: ImageVector
    get() {
        if (_BrandAmazon != null) return _BrandAmazon!!
        
        _BrandAmazon = ImageVector.Builder(
            name = "brand-amazon",
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
                moveTo(17f, 12.5f)
                arcToRelative(15.198f, 15.198f, 0f, false, true, -7.37f, 1.44f)
                arcToRelative(14.62f, 14.62f, 0f, false, true, -6.63f, -2.94f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 15f)
                curveToRelative(0.907f, -1.411f, 1.451f, -3.323f, 1.5f, -5f)
                curveToRelative(-1.197f, -0.773f, -2.577f, -0.935f, -4f, -1f)
            }
        }.build()
        
        return _BrandAmazon!!
    }

private var _BrandAmazon: ImageVector? = null

