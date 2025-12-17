package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlanetOff: ImageVector
    get() {
        if (_PlanetOff != null) return _PlanetOff!!
        
        _PlanetOff = ImageVector.Builder(
            name = "planet-off",
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
                moveTo(18.816f, 13.58f)
                curveToRelative(1.956f, 1.825f, 3.157f, 3.449f, 3.184f, 4.445f)
                moveToRelative(-3.428f, 0.593f)
                curveToRelative(-2.098f, -0.634f, -4.944f, -2.03f, -7.919f, -3.976f)
                curveToRelative(-5.47f, -3.579f, -9.304f, -7.664f, -8.56f, -9.123f)
                curveToRelative(0.32f, -0.628f, 1.591f, -0.6f, 3.294f, -0.113f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.042f, 7.059f)
                arcToRelative(7f, 7f, 0f, false, false, 9.908f, 9.89f)
                moveToRelative(1.581f, -2.425f)
                arcToRelative(7f, 7f, 0f, false, false, -9.057f, -9.054f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PlanetOff!!
    }

private var _PlanetOff: ImageVector? = null

