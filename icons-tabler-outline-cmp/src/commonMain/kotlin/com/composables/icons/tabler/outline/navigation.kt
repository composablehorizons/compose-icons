package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Navigation: ImageVector
    get() {
        if (_Navigation != null) return _Navigation!!
        
        _Navigation = ImageVector.Builder(
            name = "navigation",
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
                moveTo(12f, 18.5f)
                lineToRelative(7.265f, 2.463f)
                curveToRelative(0.196f, 0.077f, 0.42f, 0.032f, 0.57f, -0.116f)
                arcToRelative(0.548f, 0.548f, 0f, false, false, 0.134f, -0.572f)
                lineToRelative(-7.969f, -17.275f)
                lineToRelative(-7.97f, 17.275f)
                curveToRelative(-0.07f, 0.2f, -0.017f, 0.424f, 0.135f, 0.572f)
                curveToRelative(0.15f, 0.148f, 0.374f, 0.193f, 0.57f, 0.116f)
                lineToRelative(7.265f, -2.463f)
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

