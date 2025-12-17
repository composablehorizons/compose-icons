package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ScribbleOff: ImageVector
    get() {
        if (_ScribbleOff != null) return _ScribbleOff!!
        
        _ScribbleOff = ImageVector.Builder(
            name = "scribble-off",
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
                moveTo(3f, 15f)
                curveToRelative(2f, 3f, 4f, 4f, 7f, 4f)
                curveToRelative(1.95f, 0f, 4.324f, -1.268f, 5.746f, -3.256f)
                moveToRelative(1.181f, -2.812f)
                arcToRelative(5.97f, 5.97f, 0f, false, false, 0.073f, -0.932f)
                curveToRelative(0f, -4f, -3f, -7f, -6f, -7f)
                curveToRelative(-0.642f, 0f, -1.239f, 0.069f, -1.78f, 0.201f)
                moveToRelative(-2.492f, 1.515f)
                curveToRelative(-0.47f, 0.617f, -0.728f, 1.386f, -0.728f, 2.284f)
                curveToRelative(0f, 2.5f, 2f, 5f, 6f, 5f)
                curveToRelative(0.597f, 0f, 1.203f, -0.055f, 1.808f, -0.156f)
                moveToRelative(3.102f, -0.921f)
                curveToRelative(2.235f, -0.953f, 4.152f, -2.423f, 5.09f, -3.923f)
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
        
        return _ScribbleOff!!
    }

private var _ScribbleOff: ImageVector? = null

