package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.OctagonOff: ImageVector
    get() {
        if (_OctagonOff != null) return _OctagonOff!!
        
        _OctagonOff = ImageVector.Builder(
            name = "octagon-off",
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
                moveTo(19.027f, 19.002f)
                arcToRelative(2.03f, 2.03f, 0f, false, true, -0.65f, 0.444f)
                lineToRelative(-5.575f, 2.39f)
                arcToRelative(2.04f, 2.04f, 0f, false, true, -1.604f, 0f)
                lineToRelative(-5.575f, -2.39f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, -1.07f, -1.07f)
                lineToRelative(-2.388f, -5.574f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, 0f, -1.604f)
                lineToRelative(2.389f, -5.575f)
                curveToRelative(0.103f, -0.24f, 0.25f, -0.457f, 0.433f, -0.639f)
                moveToRelative(2.689f, -1.31f)
                lineToRelative(3.522f, -1.51f)
                arcToRelative(2.036f, 2.036f, 0f, false, true, 1.604f, 0f)
                lineToRelative(5.575f, 2.39f)
                curveToRelative(0.48f, 0.206f, 0.863f, 0.589f, 1.07f, 1.07f)
                lineToRelative(2.388f, 5.574f)
                curveToRelative(0.22f, 0.512f, 0.22f, 1.092f, 0f, 1.604f)
                lineToRelative(-1.509f, 3.522f)
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
        
        return _OctagonOff!!
    }

private var _OctagonOff: ImageVector? = null

