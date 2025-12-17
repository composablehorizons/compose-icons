package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FlameOff: ImageVector
    get() {
        if (_FlameOff != null) return _FlameOff!!
        
        _FlameOff = ImageVector.Builder(
            name = "flame-off",
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
                moveTo(8.973f, 8.974f)
                curveToRelative(-0.335f, 0.378f, -0.67f, 0.716f, -0.973f, 1.026f)
                curveToRelative(-1.226f, 1.26f, -2f, 3.24f, -2f, 5f)
                arcToRelative(6f, 6f, 0f, false, false, 11.472f, 2.466f)
                moveToRelative(0.383f, -3.597f)
                curveToRelative(-0.32f, -1.409f, -1.122f, -3.045f, -1.855f, -3.869f)
                curveToRelative(-0.281f, 0.472f, -0.543f, 0.87f, -0.79f, 1.202f)
                moveToRelative(-2.358f, -2.35f)
                curveToRelative(-0.068f, -2.157f, -1.182f, -4.184f, -1.852f, -4.852f)
                curveToRelative(0f, 0.968f, -0.18f, 1.801f, -0.465f, 2.527f)
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
        
        return _FlameOff!!
    }

private var _FlameOff: ImageVector? = null

