package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAdobeAfterEffect: ImageVector
    get() {
        if (_BrandAdobeAfterEffect != null) return _BrandAdobeAfterEffect!!
        
        _BrandAdobeAfterEffect = ImageVector.Builder(
            name = "brand-adobe-after-effect",
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.79f)
                lineToRelative(-0.82f, -2.653f)
                moveToRelative(-4.864f, 2.652f)
                lineToRelative(0.82f, -2.652f)
                moveToRelative(0f, 0f)
                lineToRelative(0.686f, -2.218f)
                curveToRelative(0.559f, -1.806f, 0.838f, -2.708f, 1.336f, -2.708f)
                reflectiveCurveToRelative(0.777f, 0.902f, 1.335f, 2.708f)
                lineToRelative(0.686f, 2.218f)
                moveToRelative(-4.043f, 0f)
                horizontalLineToRelative(4.043f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.895f, 12.824f)
                verticalLineToRelative(1.07f)
                arcToRelative(1.895f, 1.895f, 0f, false, false, 3.54f, 0.942f)
                moveToRelative(-3.54f, -2.012f)
                verticalLineToRelative(-0.824f)
                arcToRelative(1.895f, 1.895f, 0f, true, true, 3.79f, 0f)
                verticalLineToRelative(0.824f)
                close()
            }
        }.build()
        
        return _BrandAdobeAfterEffect!!
    }

private var _BrandAdobeAfterEffect: ImageVector? = null

