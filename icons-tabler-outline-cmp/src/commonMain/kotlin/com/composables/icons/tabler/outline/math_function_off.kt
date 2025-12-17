package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MathFunctionOff: ImageVector
    get() {
        if (_MathFunctionOff != null) return _MathFunctionOff!!
        
        _MathFunctionOff = ImageVector.Builder(
            name = "math-function-off",
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
                moveTo(14f, 10f)
                horizontalLineToRelative(1f)
                curveToRelative(0.882f, 0f, 0.986f, 0.777f, 1.694f, 2.692f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 17f)
                curveToRelative(0.864f, 0f, 1.727f, -0.663f, 2.495f, -1.512f)
                moveToRelative(1.717f, -2.302f)
                curveToRelative(0.993f, -1.45f, 2.39f, -3.186f, 3.788f, -3.186f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19f)
                curveToRelative(0f, 1.5f, 0.5f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -4f, 3f, -9f)
                curveToRelative(0.237f, -1.186f, 0.446f, -2.317f, 0.647f, -3.35f)
                moveToRelative(0.727f, -3.248f)
                curveToRelative(0.423f, -1.492f, 0.91f, -2.402f, 1.626f, -2.402f)
                curveToRelative(1.5f, 0f, 2f, 0.5f, 2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                horizontalLineToRelative(6f)
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
        
        return _MathFunctionOff!!
    }

private var _MathFunctionOff: ImageVector? = null

