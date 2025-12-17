package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAmie: ImageVector
    get() {
        if (_BrandAmie != null) return _BrandAmie!!
        
        _BrandAmie = ImageVector.Builder(
            name = "brand-amie",
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
                moveTo(3f, 8.5f)
                curveToRelative(0f, 1.33f, 0.472f, 2.55f, 1.257f, 3.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 7.743f, 7.743f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 7.743f, -7.743f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -7.743f, -7.743f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -9f, 4.243f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 9.5f)
                curveToRelative(0f, -0.828f, 0.895f, -1.5f, 2f, -1.5f)
                reflectiveCurveToRelative(2f, 0.672f, 2f, 1.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.828f, -0.895f, 1.5f, -2f, 1.5f)
                reflectiveCurveToRelative(-2f, -0.672f, -2f, -1.5f)
                close()
            }
        }.build()
        
        return _BrandAmie!!
    }

private var _BrandAmie: ImageVector? = null

