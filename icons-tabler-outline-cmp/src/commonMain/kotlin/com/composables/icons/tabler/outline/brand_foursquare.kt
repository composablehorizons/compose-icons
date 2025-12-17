package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFoursquare: ImageVector
    get() {
        if (_BrandFoursquare != null) return _BrandFoursquare!!
        
        _BrandFoursquare = ImageVector.Builder(
            name = "brand-foursquare",
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
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(0.644f, 0f, 1.11f, 0.696f, 0.978f, 1.33f)
                lineToRelative(-1.984f, 9.859f)
                arcToRelative(1.014f, 1.014f, 0f, false, true, -1f, 0.811f)
                horizontalLineToRelative(-2.254f)
                curveToRelative(-0.308f, 0f, -0.6f, 0.141f, -0.793f, 0.382f)
                lineToRelative(-4.144f, 5.25f)
                curveToRelative(-0.599f, 0.752f, -1.809f, 0.331f, -1.809f, -0.632f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -0.564f, 0.44f, -1f, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                lineToRelative(5f, 0f)
            }
        }.build()
        
        return _BrandFoursquare!!
    }

private var _BrandFoursquare: ImageVector? = null

