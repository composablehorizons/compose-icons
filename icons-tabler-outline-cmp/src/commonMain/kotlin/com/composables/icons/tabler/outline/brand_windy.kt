package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWindy: ImageVector
    get() {
        if (_BrandWindy != null) return _BrandWindy!!
        
        _BrandWindy = ImageVector.Builder(
            name = "brand-windy",
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
                moveTo(9f, 4f)
                curveToRelative(0f, 5.5f, -0.33f, 16f, 4f, 16f)
                reflectiveCurveToRelative(7.546f, -11.27f, 8f, -13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 4f)
                curveToRelative(0.253f, 5.44f, 1.449f, 16f, 5.894f, 16f)
                curveToRelative(4.444f, 0f, 8.42f, -10.036f, 9.106f, -14f)
            }
        }.build()
        
        return _BrandWindy!!
    }

private var _BrandWindy: ImageVector? = null

