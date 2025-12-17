package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RocketOff: ImageVector
    get() {
        if (_RocketOff != null) return _RocketOff!!
        
        _RocketOff = ImageVector.Builder(
            name = "rocket-off",
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
                moveTo(9.29f, 9.275f)
                arcToRelative(9.03f, 9.03f, 0f, false, false, -0.29f, 0.725f)
                arcToRelative(6f, 6f, 0f, false, false, -5f, 3f)
                arcToRelative(8f, 8f, 0f, false, true, 7f, 7f)
                arcToRelative(6f, 6f, 0f, false, false, 3f, -5f)
                curveToRelative(0.241f, -0.085f, 0.478f, -0.18f, 0.708f, -0.283f)
                moveToRelative(2.428f, -1.61f)
                arcToRelative(9f, 9f, 0f, false, false, 2.864f, -6.107f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                arcToRelative(9f, 9f, 0f, false, false, -6.107f, 2.864f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                arcToRelative(6f, 6f, 0f, false, false, -3f, 6f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
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
        
        return _RocketOff!!
    }

private var _RocketOff: ImageVector? = null

