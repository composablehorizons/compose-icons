package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Nut: ImageVector
    get() {
        if (_Nut != null) return _Nut!!
        
        _Nut = ImageVector.Builder(
            name = "nut",
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
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, 5.277f, 6.787f)
                curveToRelative(0.412f, 0.104f, 0.802f, 0.292f, 1.102f, 0.592f)
                lineTo(12f, 22f)
                lineToRelative(0.621f, -0.621f)
                curveToRelative(0.3f, -0.3f, 0.69f, -0.488f, 1.102f, -0.592f)
                arcTo(7.003f, 7.003f, 0f, false, false, 19f, 14f)
                verticalLineToRelative(-4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                curveTo(8f, 4f, 4.5f, 6f, 4f, 8f)
                curveToRelative(-0.243f, 0.97f, -0.919f, 1.952f, -2f, 3f)
                curveToRelative(1.31f, -0.082f, 1.972f, -0.29f, 3f, -1f)
                curveToRelative(0.54f, 0.92f, 0.982f, 1.356f, 2f, 2f)
                curveToRelative(1.452f, -0.647f, 1.954f, -1.098f, 2.5f, -2f)
                curveToRelative(0.595f, 0.995f, 1.151f, 1.427f, 2.5f, 2f)
                curveToRelative(1.31f, -0.621f, 1.862f, -1.058f, 2.5f, -2f)
                curveToRelative(0.629f, 0.977f, 1.162f, 1.423f, 2.5f, 2f)
                curveToRelative(1.209f, -0.548f, 1.68f, -0.967f, 2f, -2f)
                curveToRelative(1.032f, 0.916f, 1.683f, 1.157f, 3f, 1f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2f, -3f)
                curveToRelative(-0.5f, -2f, -4f, -4f, -8f, -4f)
                close()
            }
        }.build()
        
        return _Nut!!
    }

private var _Nut: ImageVector? = null

