package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WorldOff: ImageVector
    get() {
        if (_WorldOff != null) return _WorldOff!!
        
        _WorldOff = ImageVector.Builder(
            name = "world-off",
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
                moveTo(5.657f, 5.615f)
                arcToRelative(9f, 9f, 0f, true, false, 12.717f, 12.739f)
                moveToRelative(1.672f, -2.322f)
                arcToRelative(9f, 9f, 0f, false, false, -12.066f, -12.084f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.6f, 9f)
                horizontalLineToRelative(5.4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(7.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.6f, 15f)
                horizontalLineToRelative(11.4f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 3f)
                arcToRelative(17.001f, 17.001f, 0f, false, false, -1.493f, 3.022f)
                moveToRelative(-0.847f, 3.145f)
                curveToRelative(-0.68f, 4.027f, 0.1f, 8.244f, 2.34f, 11.833f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 3f)
                arcToRelative(16.982f, 16.982f, 0f, false, true, 2.549f, 8.005f)
                moveToRelative(-0.207f, 3.818f)
                arcToRelative(16.979f, 16.979f, 0f, false, true, -2.342f, 6.177f)
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
        
        return _WorldOff!!
    }

private var _WorldOff: ImageVector? = null

