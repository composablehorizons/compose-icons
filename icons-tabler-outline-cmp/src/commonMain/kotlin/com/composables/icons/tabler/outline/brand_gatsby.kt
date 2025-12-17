package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGatsby: ImageVector
    get() {
        if (_BrandGatsby != null) return _BrandGatsby!!
        
        _BrandGatsby = ImageVector.Builder(
            name = "brand-gatsby",
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
                moveTo(3.296f, 14.297f)
                lineToRelative(6.407f, 6.407f)
                arcToRelative(9.018f, 9.018f, 0f, false, true, -6.325f, -6.116f)
                lineToRelative(-0.082f, -0.291f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 13f)
                horizontalLineToRelative(5f)
                curveToRelative(-0.41f, 3.603f, -3.007f, 6.59f, -6.386f, 7.614f)
                lineToRelative(-11.228f, -11.229f)
                arcToRelative(9f, 9f, 0f, false, true, 15.66f, -2.985f)
            }
        }.build()
        
        return _BrandGatsby!!
    }

private var _BrandGatsby: ImageVector? = null

