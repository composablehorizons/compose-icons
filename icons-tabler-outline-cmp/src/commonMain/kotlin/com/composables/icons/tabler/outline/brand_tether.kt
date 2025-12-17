package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTether: ImageVector
    get() {
        if (_BrandTether != null) return _BrandTether!!
        
        _BrandTether = ImageVector.Builder(
            name = "brand-tether",
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
                moveTo(14.08f, 20.188f)
                curveToRelative(-1.15f, 1.083f, -3.02f, 1.083f, -4.17f, 0f)
                lineToRelative(-6.93f, -6.548f)
                curveToRelative(-0.96f, -0.906f, -1.27f, -2.624f, -0.69f, -3.831f)
                lineToRelative(2.4f, -5.018f)
                curveToRelative(0.47f, -0.991f, 1.72f, -1.791f, 2.78f, -1.791f)
                horizontalLineToRelative(9.06f)
                curveToRelative(1.06f, 0f, 2.31f, 0.802f, 2.78f, 1.79f)
                lineToRelative(2.4f, 5.019f)
                curveToRelative(0.58f, 1.207f, 0.26f, 2.925f, -0.69f, 3.83f)
                curveToRelative(-3.453f, 3.293f, -3.466f, 3.279f, -6.94f, 6.549f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(-7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
            }
        }.build()
        
        return _BrandTether!!
    }

private var _BrandTether: ImageVector? = null

