package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FrustumOff: ImageVector
    get() {
        if (_FrustumOff != null) return _FrustumOff!!
        
        _FrustumOff = ImageVector.Builder(
            name = "frustum-off",
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
                moveTo(7.72f, 3.728f)
                lineToRelative(3.484f, -1.558f)
                arcToRelative(1.95f, 1.95f, 0f, false, true, 1.59f, 0f)
                lineToRelative(4.496f, 2.01f)
                curveToRelative(0.554f, 0.246f, 0.963f, 0.736f, 1.112f, 1.328f)
                lineToRelative(2.538f, 10.158f)
                curveToRelative(0.103f, 0.412f, 0.07f, 0.832f, -0.075f, 1.206f)
                moveToRelative(-2.299f, 1.699f)
                lineToRelative(-5.725f, 2.738f)
                arcToRelative(1.945f, 1.945f, 0f, false, true, -1.682f, 0f)
                lineToRelative(-7.035f, -3.365f)
                arcToRelative(1.99f, 1.99f, 0f, false, true, -1.064f, -2.278f)
                lineToRelative(2.52f, -10.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4.82f)
                lineToRelative(-5.198f, 2.324f)
                arcToRelative(1.963f, 1.963f, 0f, false, true, -1.602f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.32f)
                verticalLineToRelative(0.68f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(9.5f)
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
        
        return _FrustumOff!!
    }

private var _FrustumOff: ImageVector? = null

