package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDolbyDigital: ImageVector
    get() {
        if (_BrandDolbyDigital != null) return _BrandDolbyDigital!!
        
        _BrandDolbyDigital = ImageVector.Builder(
            name = "brand-dolby-digital",
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
                moveTo(21f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(-3.34f, 0f, -6.047f, -2.686f, -6.047f, -6f)
                reflectiveCurveToRelative(2.707f, -6f, 6.046f, -6f)
                horizontalLineToRelative(0.891f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.063f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(0.891f)
                curveToRelative(3.34f, 0f, 6.046f, -2.686f, 6.046f, -6f)
                reflectiveCurveToRelative(-2.707f, -6f, -6.046f, -6f)
                horizontalLineToRelative(-0.89f)
                close()
            }
        }.build()
        
        return _BrandDolbyDigital!!
    }

private var _BrandDolbyDigital: ImageVector? = null

