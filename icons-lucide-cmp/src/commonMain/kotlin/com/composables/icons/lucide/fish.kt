package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Fish: ImageVector
    get() {
        if (_Fish != null) return _Fish!!
        
        _Fish = ImageVector.Builder(
            name = "fish",
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
                moveTo(6.5f, 12f)
                curveToRelative(0.94f, -3.46f, 4.94f, -6f, 8.5f, -6f)
                curveToRelative(3.56f, 0f, 6.06f, 2.54f, 7f, 6f)
                curveToRelative(-0.94f, 3.47f, -3.44f, 6f, -7f, 6f)
                reflectiveCurveToRelative(-7.56f, -2.53f, -8.5f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                verticalLineToRelative(0.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17.93f)
                arcToRelative(9.77f, 9.77f, 0f, false, true, 0f, -11.86f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10.67f)
                curveTo(7f, 8f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveToRelative(-1f, 1.5f, -1f, 5f, 0.23f, 6.5f)
                curveToRelative(-1.24f, 1.5f, -1.24f, 5f, -0.23f, 6.5f)
                curveTo(5.58f, 18.03f, 7f, 16f, 7f, 13.33f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.46f, 7.26f)
                curveTo(10.2f, 5.88f, 9.17f, 4.24f, 8f, 3f)
                horizontalLineToRelative(5.8f)
                arcToRelative(2f, 2f, 0f, false, true, 1.98f, 1.67f)
                lineToRelative(0.23f, 1.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.01f, 17.93f)
                lineToRelative(-0.23f, 1.4f)
                arcTo(2f, 2f, 0f, false, true, 13.8f, 21f)
                horizontalLineTo(9.5f)
                arcToRelative(5.96f, 5.96f, 0f, false, false, 1.49f, -3.98f)
            }
        }.build()
        
        return _Fish!!
    }

private var _Fish: ImageVector? = null

