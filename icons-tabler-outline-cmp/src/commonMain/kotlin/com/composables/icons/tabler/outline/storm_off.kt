package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.StormOff: ImageVector
    get() {
        if (_StormOff != null) return _StormOff!!
        
        _StormOff = ImageVector.Builder(
            name = "storm-off",
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
                moveTo(9.884f, 9.874f)
                arcToRelative(3f, 3f, 0f, true, false, 4.24f, 4.246f)
                moveToRelative(0.57f, -3.441f)
                arcToRelative(3.012f, 3.012f, 0f, false, false, -1.41f, -1.39f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.037f, 7.063f)
                arcToRelative(7f, 7f, 0f, false, false, 9.907f, 9.892f)
                moveToRelative(1.585f, -2.426f)
                arcToRelative(7f, 7f, 0f, false, false, -9.058f, -9.059f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.369f, 14.236f)
                curveToRelative(-1.605f, -3.428f, -1.597f, -6.673f, -1f, -9.849f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.63f, 9.76f)
                arcToRelative(14.323f, 14.323f, 0f, false, true, 1.368f, 6.251f)
                moveToRelative(-0.37f, 3.608f)
                curveToRelative(-0.087f, 0.46f, -0.187f, 0.92f, -0.295f, 1.377f)
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
        
        return _StormOff!!
    }

private var _StormOff: ImageVector? = null

