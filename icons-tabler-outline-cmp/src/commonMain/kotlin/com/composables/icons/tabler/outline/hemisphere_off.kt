package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HemisphereOff: ImageVector
    get() {
        if (_HemisphereOff != null) return _HemisphereOff!!
        
        _HemisphereOff = ImageVector.Builder(
            name = "hemisphere-off",
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
                moveTo(6.588f, 6.603f)
                curveToRelative(-2.178f, 0.547f, -3.588f, 1.417f, -3.588f, 2.397f)
                curveToRelative(0f, 1.657f, 4.03f, 3f, 9f, 3f)
                moveToRelative(3.72f, -0.267f)
                curveToRelative(3.114f, -0.473f, 5.28f, -1.518f, 5.28f, -2.733f)
                curveToRelative(0f, -1.657f, -4.03f, -3f, -9f, -3f)
                curveToRelative(-0.662f, 0f, -1.308f, 0.024f, -1.93f, 0.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                arcToRelative(9f, 9f, 0f, false, false, 13.677f, 7.69f)
                moveToRelative(2.165f, -1.843f)
                arcToRelative(8.965f, 8.965f, 0f, false, false, 2.158f, -5.847f)
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
        
        return _HemisphereOff!!
    }

private var _HemisphereOff: ImageVector? = null

