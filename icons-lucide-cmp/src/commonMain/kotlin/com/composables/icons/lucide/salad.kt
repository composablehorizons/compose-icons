package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Salad: ImageVector
    get() {
        if (_Salad != null) return _Salad!!
        
        _Salad = ImageVector.Builder(
            name = "salad",
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
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, -9f)
                horizontalLineTo(3f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.38f, 12f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -0.4f, -4.77f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.2f, -2.77f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.47f, -0.63f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 3.37f, 3.37f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -1.1f, 3.7f)
                arcToRelative(2.51f, 2.51f, 0f, false, true, 0.03f, 1.1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                lineToRelative(4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.9f, 7.25f)
                arcTo(3.99f, 3.99f, 0f, false, false, 4f, 10f)
                curveToRelative(0f, 0.73f, 0.2f, 1.41f, 0.54f, 2f)
            }
        }.build()
        
        return _Salad!!
    }

private var _Salad: ImageVector? = null

