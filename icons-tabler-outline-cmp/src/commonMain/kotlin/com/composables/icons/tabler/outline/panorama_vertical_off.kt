package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PanoramaVerticalOff: ImageVector
    get() {
        if (_PanoramaVerticalOff != null) return _PanoramaVerticalOff!!
        
        _PanoramaVerticalOff = ImageVector.Builder(
            name = "panorama-vertical-off",
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
                moveTo(7f, 3f)
                horizontalLineToRelative(10.53f)
                curveToRelative(0.693f, 0f, 1.18f, 0.691f, 0.935f, 1.338f)
                curveToRelative(-1.098f, 2.898f, -1.573f, 5.795f, -1.425f, 8.692f)
                moveToRelative(0.828f, 4.847f)
                curveToRelative(0.172f, 0.592f, 0.37f, 1.185f, 0.595f, 1.778f)
                arcToRelative(1f, 1f, 0f, false, true, -0.934f, 1.345f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.692f, 0f, -1.208f, -0.692f, -0.962f, -1.34f)
                curveToRelative(1.697f, -4.486f, 1.903f, -8.973f, 0.619f, -13.46f)
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
        
        return _PanoramaVerticalOff!!
    }

private var _PanoramaVerticalOff: ImageVector? = null

