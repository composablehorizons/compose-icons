package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SpiralOff: ImageVector
    get() {
        if (_SpiralOff != null) return _SpiralOff!!
        
        _SpiralOff = ImageVector.Builder(
            name = "spiral-off",
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
                moveTo(10f, 12.057f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, 0.614f, 0.743f)
                curveToRelative(0.682f, 0.459f, 1.509f, 0.374f, 2.164f, -0.02f)
                moveToRelative(1.103f, -2.92f)
                arcToRelative(3.298f, 3.298f, 0f, false, false, -1.749f, -2.059f)
                arcToRelative(3.6f, 3.6f, 0f, false, false, -0.507f, -0.195f)
                moveToRelative(-3.385f, 0.634f)
                arcToRelative(4.154f, 4.154f, 0f, false, false, -1.347f, 1.646f)
                curveToRelative(-1.095f, 2.432f, 0.29f, 5.248f, 2.71f, 6.246f)
                curveToRelative(1.955f, 0.806f, 4.097f, 0.35f, 5.65f, -0.884f)
                moveToRelative(1.745f, -2.268f)
                lineToRelative(0.043f, -0.103f)
                curveToRelative(1.36f, -3.343f, -0.557f, -7.134f, -3.896f, -8.41f)
                curveToRelative(-1.593f, -0.61f, -3.27f, -0.599f, -4.79f, -0.113f)
                moveToRelative(-2.579f, 1.408f)
                arcToRelative(7.574f, 7.574f, 0f, false, false, -2.268f, 3.128f)
                curveToRelative(-1.63f, 4.253f, 0.823f, 9.024f, 5.082f, 10.576f)
                curveToRelative(3.211f, 1.17f, 6.676f, 0.342f, 9.124f, -1.738f)
                moveToRelative(1.869f, -2.149f)
                arcToRelative(9.354f, 9.354f, 0f, false, false, 1.417f, -4.516f)
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
        
        return _SpiralOff!!
    }

private var _SpiralOff: ImageVector? = null

