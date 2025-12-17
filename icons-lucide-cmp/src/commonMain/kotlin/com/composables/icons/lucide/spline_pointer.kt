package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SplinePointer: ImageVector
    get() {
        if (_SplinePointer != null) return _SplinePointer!!
        
        _SplinePointer = ImageVector.Builder(
            name = "spline-pointer",
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
                moveTo(12.034f, 12.681f)
                arcToRelative(0.498f, 0.498f, 0f, false, true, 0.647f, -0.647f)
                lineToRelative(9f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.033f, 0.943f)
                lineToRelative(-3.444f, 1.068f)
                arcToRelative(1f, 1f, 0f, false, false, -0.66f, 0.66f)
                lineToRelative(-1.067f, 3.443f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.943f, 0.033f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                arcTo(12f, 12f, 0f, false, true, 17f, 5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                arcTo(2f, 2f, 0f, false, true, 19f, 7f)
                arcTo(2f, 2f, 0f, false, true, 17f, 5f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                arcTo(2f, 2f, 0f, false, true, 5f, 21f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                arcTo(2f, 2f, 0f, false, true, 7f, 19f)
                close()
            }
        }.build()
        
        return _SplinePointer!!
    }

private var _SplinePointer: ImageVector? = null

