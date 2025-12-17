package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandLastfm: ImageVector
    get() {
        if (_BrandLastfm != null) return _BrandLastfm!!
        
        _BrandLastfm = ImageVector.Builder(
            name = "brand-lastfm",
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
                moveTo(20f, 8f)
                curveToRelative(-0.83f, -1f, -1.388f, -1f, -2f, -1f)
                curveToRelative(-0.612f, 0f, -2f, 0.271f, -2f, 2f)
                reflectiveCurveToRelative(1.384f, 2.233f, 3f, 3f)
                curveToRelative(1.616f, 0.767f, 2.125f, 1.812f, 2f, 3f)
                reflectiveCurveToRelative(-1f, 2f, -3f, 2f)
                reflectiveCurveToRelative(-3f, -1f, -3.5f, -2f)
                reflectiveCurveToRelative(-1.585f, -4.78f, -2.497f, -6f)
                arcToRelative(5f, 5f, 0f, true, false, -1f, 7f)
            }
        }.build()
        
        return _BrandLastfm!!
    }

private var _BrandLastfm: ImageVector? = null

