package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HazeMoon: ImageVector
    get() {
        if (_HazeMoon != null) return _HazeMoon!!
        
        _HazeMoon = ImageVector.Builder(
            name = "haze-moon",
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
                moveTo(3f, 16f)
                horizontalLineToRelative(18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.296f, 16f)
                curveToRelative(-2.268f, -1.4f, -3.598f, -4.087f, -3.237f, -6.916f)
                curveToRelative(0.443f, -3.48f, 3.308f, -6.083f, 6.698f, -6.084f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(0.296f)
                curveToRelative(-1.991f, 1.916f, -2.377f, 5.03f, -0.918f, 7.405f)
                curveToRelative(1.459f, 2.374f, 4.346f, 3.33f, 6.865f, 2.275f)
                arcToRelative(6.888f, 6.888f, 0f, false, true, -2.777f, 3.314f)
            }
        }.build()
        
        return _HazeMoon!!
    }

private var _HazeMoon: ImageVector? = null

