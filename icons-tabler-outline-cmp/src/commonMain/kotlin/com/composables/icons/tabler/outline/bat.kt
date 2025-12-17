package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bat: ImageVector
    get() {
        if (_Bat != null) return _Bat!!
        
        _Bat = ImageVector.Builder(
            name = "bat",
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
                moveTo(17f, 16f)
                curveToRelative(0.74f, -2.286f, 2.778f, -3.762f, 5f, -3f)
                curveToRelative(-0.173f, -2.595f, 0.13f, -5.314f, -2f, -7.5f)
                curveToRelative(-1.708f, 2.648f, -3.358f, 2.557f, -5f, 2.5f)
                verticalLineToRelative(-4f)
                lineToRelative(-3f, 2f)
                lineToRelative(-3f, -2f)
                verticalLineToRelative(4f)
                curveToRelative(-1.642f, 0.057f, -3.292f, 0.148f, -5f, -2.5f)
                curveToRelative(-2.13f, 2.186f, -1.827f, 4.905f, -2f, 7.5f)
                curveToRelative(2.222f, -0.762f, 4.26f, 0.714f, 5f, 3f)
                curveToRelative(2.593f, 0f, 3.889f, 0.952f, 5f, 4f)
                curveToRelative(1.111f, -3.048f, 2.407f, -4f, 5f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                arcToRelative(3f, 3f, 0f, false, false, 6f, 0f)
            }
        }.build()
        
        return _Bat!!
    }

private var _Bat: ImageVector? = null

