package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCake: ImageVector
    get() {
        if (_BrandCake != null) return _BrandCake!!
        
        _BrandCake = ImageVector.Builder(
            name = "brand-cake",
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
                moveTo(20.84f, 12f)
                curveToRelative(0f, 2.05f, 0.985f, 3.225f, -0.04f, 5f)
                curveToRelative(-1.026f, 1.775f, -2.537f, 1.51f, -4.314f, 2.534f)
                curveToRelative(-1.776f, 1.026f, -2.302f, 2.466f, -4.353f, 2.466f)
                curveToRelative(-2.051f, 0f, -2.576f, -1.441f, -4.353f, -2.466f)
                curveToRelative(-1.776f, -1.024f, -3.288f, -0.759f, -4.314f, -2.534f)
                curveToRelative(-1.025f, -1.775f, -0.04f, -2.95f, -0.04f, -5f)
                reflectiveCurveToRelative(-0.985f, -3.225f, 0.04f, -5f)
                curveToRelative(1.026f, -1.775f, 2.537f, -1.51f, 4.314f, -2.534f)
                curveToRelative(1.776f, -1.026f, 2.302f, -2.466f, 4.353f, -2.466f)
                reflectiveCurveToRelative(2.577f, 1.441f, 4.353f, 2.466f)
                curveToRelative(1.776f, 1.024f, 3.288f, 0.759f, 4.313f, 2.534f)
                curveToRelative(1.026f, 1.775f, 0.04f, 2.95f, 0.04f, 5f)
                close()
            }
        }.build()
        
        return _BrandCake!!
    }

private var _BrandCake: ImageVector? = null

