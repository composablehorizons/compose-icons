package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rotate3d: ImageVector
    get() {
        if (_Rotate3d != null) return _Rotate3d!!
        
        _Rotate3d = ImageVector.Builder(
            name = "rotate-3d",
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
                moveTo(16.466f, 7.5f)
                curveTo(15.643f, 4.237f, 13.952f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 6.477f, 7f, 12f)
                reflectiveCurveToRelative(2.239f, 10f, 5f, 10f)
                curveToRelative(0.342f, 0f, 0.677f, -0.069f, 1f, -0.2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.194f, 13.707f)
                lineToRelative(3.814f, 1.86f)
                lineToRelative(-1.86f, 3.814f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 15.57f)
                curveToRelative(-1.804f, 0.885f, -4.274f, 1.43f, -7f, 1.43f)
                curveToRelative(-5.523f, 0f, -10f, -2.239f, -10f, -5f)
                reflectiveCurveToRelative(4.477f, -5f, 10f, -5f)
                curveToRelative(4.838f, 0f, 8.873f, 1.718f, 9.8f, 4f)
            }
        }.build()
        
        return _Rotate3d!!
    }

private var _Rotate3d: ImageVector? = null

