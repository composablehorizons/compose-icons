package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Apple: ImageVector
    get() {
        if (_Apple != null) return _Apple!!
        
        _Apple = ImageVector.Builder(
            name = "apple",
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
                moveTo(4f, 11.319f)
                curveToRelative(0f, 3.102f, 0.444f, 5.319f, 2.222f, 7.978f)
                curveToRelative(1.351f, 1.797f, 3.156f, 2.247f, 5.08f, 0.988f)
                curveToRelative(0.426f, -0.268f, 0.97f, -0.268f, 1.397f, 0f)
                curveToRelative(1.923f, 1.26f, 3.728f, 0.809f, 5.079f, -0.988f)
                curveToRelative(1.778f, -2.66f, 2.222f, -4.876f, 2.222f, -7.977f)
                curveToRelative(0f, -2.661f, -1.99f, -5.32f, -4.444f, -5.32f)
                curveToRelative(-1.267f, 0f, -2.41f, 0.693f, -3.22f, 1.44f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.672f, 0f)
                curveToRelative(-0.809f, -0.746f, -1.953f, -1.44f, -3.22f, -1.44f)
                curveToRelative(-2.454f, 0f, -4.444f, 2.66f, -4.444f, 5.319f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                curveToRelative(0f, -1.47f, 0.454f, -2.34f, 1.5f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                curveToRelative(0f, -1.2f, 0.867f, -4f, 3f, -4f)
            }
        }.build()
        
        return _Apple!!
    }

private var _Apple: ImageVector? = null

