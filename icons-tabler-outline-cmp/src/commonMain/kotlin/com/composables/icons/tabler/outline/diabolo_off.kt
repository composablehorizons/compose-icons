package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DiaboloOff: ImageVector
    get() {
        if (_DiaboloOff != null) return _DiaboloOff!!
        
        _DiaboloOff = ImageVector.Builder(
            name = "diabolo-off",
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
                moveTo(4.727f, 4.749f)
                curveToRelative(-0.467f, 0.38f, -0.727f, 0.804f, -0.727f, 1.251f)
                curveToRelative(0f, 1.217f, 1.933f, 2.265f, 4.71f, 2.735f)
                moveToRelative(4.257f, 0.243f)
                curveToRelative(3.962f, -0.178f, 7.033f, -1.444f, 7.033f, -2.978f)
                curveToRelative(0f, -1.657f, -3.582f, -3f, -8f, -3f)
                curveToRelative(-1.66f, 0f, -3.202f, 0.19f, -4.48f, 0.514f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(0.143f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, 0.307f)
                lineToRelative(1.952f, 5.55f)
                lineToRelative(-1.964f, 5.67f)
                arcToRelative(1f, 1f, 0f, false, false, -0.036f, 0.265f)
                verticalLineToRelative(0.065f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(3.218f, 0f, 5.992f, -0.712f, 7.262f, -1.74f)
                moveToRelative(-0.211f, -4.227f)
                lineToRelative(-1.051f, -3.033f)
                lineToRelative(1.952f, -5.55f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, -0.307f)
                verticalLineToRelative(-0.143f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveToRelative(0f, 1.105f, 2.686f, 2f, 6f, 2f)
                curveToRelative(0.656f, 0f, 1.288f, -0.035f, 1.879f, -0.1f)
                moveToRelative(3.198f, -0.834f)
                curveToRelative(0.585f, -0.308f, 0.923f, -0.674f, 0.923f, -1.066f)
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
        
        return _DiaboloOff!!
    }

private var _DiaboloOff: ImageVector? = null

