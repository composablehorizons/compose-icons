package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LassoSelect: ImageVector
    get() {
        if (_LassoSelect != null) return _LassoSelect!!
        
        _LassoSelect = ImageVector.Builder(
            name = "lasso-select",
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
                moveTo(7f, 22f)
                arcToRelative(5f, 5f, 0f, false, true, -2f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.93f)
                curveToRelative(0.96f, 0.43f, 1.96f, 0.74f, 2.99f, 0.91f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.34f, 14f)
                arcTo(6.8f, 6.8f, 0f, false, true, 2f, 10f)
                curveToRelative(0f, -4.42f, 4.48f, -8f, 10f, -8f)
                reflectiveCurveToRelative(10f, 3.58f, 10f, 8f)
                arcToRelative(7.19f, 7.19f, 0f, false, true, -0.33f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.33f, 22f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, -0.24f, -0.32f)
                verticalLineToRelative(-10f)
                arcToRelative(0.34f, 0.34f, 0f, false, true, 0.33f, -0.34f)
                curveToRelative(0.08f, 0f, 0.15f, 0.03f, 0.21f, 0.08f)
                lineToRelative(7.34f, 6f)
                arcToRelative(0.33f, 0.33f, 0f, false, true, -0.21f, 0.59f)
                horizontalLineToRelative(-4.49f)
                lineToRelative(-2.57f, 3.85f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, -0.28f, 0.14f)
                close()
            }
        }.build()
        
        return _LassoSelect!!
    }

private var _LassoSelect: ImageVector? = null

