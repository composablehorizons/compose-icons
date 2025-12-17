package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.NavigationOff: ImageVector
    get() {
        if (_NavigationOff != null) return _NavigationOff!!
        
        _NavigationOff = ImageVector.Builder(
            name = "navigation-off",
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
                moveTo(16.28f, 12.28f)
                curveToRelative(-0.95f, -2.064f, -2.377f, -5.157f, -4.28f, -9.28f)
                curveToRelative(-0.7f, 1.515f, -1.223f, 2.652f, -1.573f, 3.41f)
                moveToRelative(-1.27f, 2.75f)
                curveToRelative(-0.882f, 1.913f, -2.59f, 5.618f, -5.127f, 11.115f)
                curveToRelative(-0.07f, 0.2f, -0.017f, 0.424f, 0.135f, 0.572f)
                curveToRelative(0.15f, 0.148f, 0.374f, 0.193f, 0.57f, 0.116f)
                lineToRelative(7.265f, -2.463f)
                lineToRelative(7.265f, 2.463f)
                curveToRelative(0.196f, 0.077f, 0.42f, 0.032f, 0.57f, -0.116f)
                arcToRelative(0.548f, 0.548f, 0f, false, false, 0.134f, -0.572f)
                lineToRelative(-0.26f, -0.563f)
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
        
        return _NavigationOff!!
    }

private var _NavigationOff: ImageVector? = null

