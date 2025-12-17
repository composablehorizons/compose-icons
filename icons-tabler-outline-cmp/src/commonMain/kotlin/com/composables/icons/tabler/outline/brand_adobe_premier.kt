package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAdobePremier: ImageVector
    get() {
        if (_BrandAdobePremier != null) return _BrandAdobePremier!!
        
        _BrandAdobePremier = ImageVector.Builder(
            name = "brand-adobe-premier",
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
                moveTo(3f, 12f)
                curveToRelative(0f, -4.243f, 0f, -6.364f, 1.318f, -7.682f)
                reflectiveCurveToRelative(3.44f, -1.318f, 7.682f, -1.318f)
                reflectiveCurveToRelative(6.364f, 0f, 7.682f, 1.318f)
                reflectiveCurveToRelative(1.318f, 3.44f, 1.318f, 7.682f)
                reflectiveCurveToRelative(0f, 6.364f, -1.318f, 7.682f)
                reflectiveCurveToRelative(-3.44f, 1.318f, -7.682f, 1.318f)
                reflectiveCurveToRelative(-6.364f, 0f, -7.682f, -1.318f)
                reflectiveCurveToRelative(-1.318f, -3.44f, -1.318f, -7.682f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.263f, 15.79f)
                verticalLineToRelative(-3.79f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-3.248f)
                curveToRelative(0f, -0.335f, 0.222f, -0.541f, 0.542f, -0.541f)
                horizontalLineToRelative(1.353f)
                arcToRelative(1.895f, 1.895f, 0f, true, true, 0f, 3.789f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.895f, 10.579f)
                verticalLineToRelative(1.895f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.315f)
                moveToRelative(0f, -3.315f)
                curveToRelative(0.531f, -0.709f, 1.026f, -1.592f, 1.894f, -1.832f)
                quadToRelative(0.22f, -0.062f, 0.474f, -0.063f)
            }
        }.build()
        
        return _BrandAdobePremier!!
    }

private var _BrandAdobePremier: ImageVector? = null

