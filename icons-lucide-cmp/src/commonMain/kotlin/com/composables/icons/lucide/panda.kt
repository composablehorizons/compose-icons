package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Panda: ImageVector
    get() {
        if (_Panda != null) return _Panda!!
        
        _Panda = ImageVector.Builder(
            name = "panda",
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
                moveTo(11.25f, 17.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.69f, 9.67f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.04f, -5.5f)
                arcToRelative(8.35f, 8.35f, 0f, false, false, -3.3f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.04f, 5.5f)
                curveTo(2.49f, 11.2f, 2f, 12.88f, 2f, 14.5f)
                curveTo(2f, 19.47f, 6.48f, 22f, 12f, 22f)
                reflectiveCurveToRelative(10f, -2.53f, 10f, -7.5f)
                curveToRelative(0f, -1.62f, -0.48f, -3.3f, -1.3f, -4.83f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6.5f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                lineToRelative(-2f, 2f)
            }
        }.build()
        
        return _Panda!!
    }

private var _Panda: ImageVector? = null

