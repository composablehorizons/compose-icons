package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSkype: ImageVector
    get() {
        if (_BrandSkype != null) return _BrandSkype!!
        
        _BrandSkype = ImageVector.Builder(
            name = "brand-skype",
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
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, false, true, 8.603f, 11.65f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -5.953f, 5.953f)
                arcToRelative(9f, 9f, 0f, false, true, -11.253f, -11.253f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 5.953f, -5.954f)
                arcToRelative(8.987f, 8.987f, 0f, false, true, 2.65f, -0.396f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14.5f)
                curveToRelative(0.5f, 2f, 2.358f, 2.5f, 4f, 2.5f)
                curveToRelative(2.905f, 0f, 4f, -1.187f, 4f, -2.5f)
                curveToRelative(0f, -1.503f, -1.927f, -2.5f, -4f, -2.5f)
                reflectiveCurveToRelative(-4f, -1f, -4f, -2.5f)
                curveToRelative(0f, -1.313f, 1.095f, -2.5f, 4f, -2.5f)
                curveToRelative(1.642f, 0f, 3.5f, 0.5f, 4f, 2.5f)
            }
        }.build()
        
        return _BrandSkype!!
    }

private var _BrandSkype: ImageVector? = null

