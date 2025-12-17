package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandD3: ImageVector
    get() {
        if (_BrandD3 != null) return _BrandD3!!
        
        _BrandD3 = ImageVector.Builder(
            name = "brand-d3",
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
                moveTo(3f, 4f)
                horizontalLineToRelative(1.8f)
                curveToRelative(3.976f, 0f, 7.2f, 3.582f, 7.2f, 8f)
                reflectiveCurveToRelative(-3.224f, 8f, -7.2f, 8f)
                horizontalLineToRelative(-1.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                horizontalLineToRelative(5.472f)
                curveToRelative(1.948f, 0f, 3.528f, 1.79f, 3.528f, 4f)
                reflectiveCurveToRelative(-1.58f, 4f, -3.528f, 4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.472f, 12f)
                horizontalLineToRelative(-2.472f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.472f, 12f)
                horizontalLineToRelative(-2.352f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.472f, 12f)
                curveToRelative(1.948f, 0f, 3.528f, 1.79f, 3.528f, 4f)
                reflectiveCurveToRelative(-1.58f, 4f, -3.528f, 4f)
                horizontalLineToRelative(-5.472f)
            }
        }.build()
        
        return _BrandD3!!
    }

private var _BrandD3: ImageVector? = null

