package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SphereOff: ImageVector
    get() {
        if (_SphereOff != null) return _SphereOff!!
        
        _SphereOff = ImageVector.Builder(
            name = "sphere-off",
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
                moveTo(3f, 12f)
                curveToRelative(0f, 1.657f, 4.03f, 3f, 9f, 3f)
                curveToRelative(0.987f, 0f, 1.936f, -0.053f, 2.825f, -0.15f)
                moveToRelative(3.357f, -0.67f)
                curveToRelative(1.735f, -0.547f, 2.818f, -1.32f, 2.818f, -2.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.051f, 16.027f)
                arcToRelative(9f, 9f, 0f, false, false, -12.083f, -12.075f)
                moveToRelative(-2.34f, 1.692f)
                arcToRelative(9f, 9f, 0f, false, false, 12.74f, 12.716f)
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
        
        return _SphereOff!!
    }

private var _SphereOff: ImageVector? = null

