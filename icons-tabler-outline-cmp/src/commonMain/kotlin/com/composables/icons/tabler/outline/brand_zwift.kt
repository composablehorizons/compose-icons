package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandZwift: ImageVector
    get() {
        if (_BrandZwift != null) return _BrandZwift!!
        
        _BrandZwift = ImageVector.Builder(
            name = "brand-zwift",
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
                moveTo(5.5f, 4f)
                curveToRelative(-1.465f, 0f, -2.5f, 1.101f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.035f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-4.637f, 7.19f)
                arcToRelative(2.434f, 2.434f, 0f, false, false, -0.011f, 2.538f)
                curveToRelative(0.473f, 0.787f, 1.35f, 1.272f, 2.3f, 1.272f)
                horizontalLineToRelative(10.848f)
                curveToRelative(1.465f, 0f, 2.5f, -1.101f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.035f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(7f, -11f)
                horizontalLineToRelative(-15.5f)
                close()
            }
        }.build()
        
        return _BrandZwift!!
    }

private var _BrandZwift: ImageVector? = null

