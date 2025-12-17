package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BarrelOff: ImageVector
    get() {
        if (_BarrelOff != null) return _BarrelOff!!
        
        _BarrelOff = ImageVector.Builder(
            name = "barrel-off",
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
                moveTo(8f, 4f)
                horizontalLineToRelative(8.722f)
                arcToRelative(2f, 2f, 0f, false, true, 1.841f, 1.22f)
                curveToRelative(0.958f, 2.26f, 1.437f, 4.52f, 1.437f, 6.78f)
                arcToRelative(16.35f, 16.35f, 0f, false, true, -0.407f, 3.609f)
                moveToRelative(-0.964f, 3.013f)
                lineToRelative(-0.066f, 0.158f)
                arcToRelative(2f, 2f, 0f, false, true, -1.841f, 1.22f)
                horizontalLineToRelative(-9.444f)
                arcToRelative(2f, 2f, 0f, false, true, -1.841f, -1.22f)
                curveToRelative(-0.958f, -2.26f, -1.437f, -4.52f, -1.437f, -6.78f)
                curveToRelative(0f, -2.21f, 0.458f, -4.42f, 1.374f, -6.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 4f)
                curveToRelative(0.585f, 2.337f, 0.913f, 4.674f, 0.985f, 7.01f)
                moveToRelative(-0.114f, 3.86f)
                arcToRelative(33.415f, 33.415f, 0f, false, true, -0.871f, 5.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4f)
                arcToRelative(34.42f, 34.42f, 0f, false, false, -0.366f, 1.632f)
                moveToRelative(-0.506f, 3.501f)
                arcToRelative(32.126f, 32.126f, 0f, false, false, -0.128f, 2.867f)
                curveToRelative(0f, 2.667f, 0.333f, 5.333f, 1f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 16f)
                horizontalLineToRelative(11.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 8f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(-3.5f)
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
        
        return _BarrelOff!!
    }

private var _BarrelOff: ImageVector? = null

