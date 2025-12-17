package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PanoramaHorizontalOff: ImageVector
    get() {
        if (_PanoramaHorizontalOff != null) return _PanoramaHorizontalOff!!
        
        _PanoramaHorizontalOff = ImageVector.Builder(
            name = "panorama-horizontal-off",
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
                moveTo(10.95f, 6.952f)
                curveToRelative(2.901f, 0.15f, 5.803f, -0.323f, 8.705f, -1.42f)
                arcToRelative(1f, 1f, 0f, false, true, 1.345f, 0.934f)
                verticalLineToRelative(10.534f)
                moveToRelative(-3.212f, 0.806f)
                curveToRelative(-4.483f, -1.281f, -8.966f, -1.074f, -13.449f, 0.622f)
                arcToRelative(0.993f, 0.993f, 0f, false, true, -1.339f, -0.935f)
                verticalLineToRelative(-11.027f)
                arcToRelative(1f, 1f, 0f, false, true, 1.338f, -0.935f)
                curveToRelative(0.588f, 0.221f, 1.176f, 0.418f, 1.764f, 0.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PanoramaHorizontalOff!!
    }

private var _PanoramaHorizontalOff: ImageVector? = null

