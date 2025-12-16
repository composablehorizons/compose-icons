package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EggFried: ImageVector
    get() {
        if (_EggFried != null) return _EggFried!!
        
        _EggFried = ImageVector.Builder(
            name = "egg-fried",
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
                moveTo(15f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 11.5f, 16f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 15f, 12.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8f)
                curveToRelative(0f, -3.5f, 2.5f, -6f, 6.5f, -6f)
                curveToRelative(5f, 0f, 4.83f, 3f, 7.5f, 5f)
                reflectiveCurveToRelative(5f, 2f, 5f, 6f)
                curveToRelative(0f, 4.5f, -2.5f, 6.5f, -7f, 6.5f)
                curveToRelative(-2.5f, 0f, -2.5f, 2.5f, -6f, 2.5f)
                reflectiveCurveToRelative(-7f, -2f, -7f, -5.5f)
                curveToRelative(0f, -3f, 1.5f, -3f, 1.5f, -5f)
                curveTo(3.5f, 10f, 3f, 9f, 3f, 8f)
                close()
            }
        }.build()
        
        return _EggFried!!
    }

private var _EggFried: ImageVector? = null

