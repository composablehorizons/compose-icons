package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FishOff: ImageVector
    get() {
        if (_FishOff != null) return _FishOff!!
        
        _FishOff = ImageVector.Builder(
            name = "fish-off",
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
                moveTo(18f, 12.47f)
                verticalLineToRelative(0.03f)
                moveToRelative(0f, -0.5f)
                verticalLineToRelative(0.47f)
                moveToRelative(-0.475f, 5.056f)
                arcTo(6.744f, 6.744f, 0f, false, true, 15f, 18f)
                curveToRelative(-3.56f, 0f, -7.56f, -2.53f, -8.5f, -6f)
                curveToRelative(0.348f, -1.28f, 1.114f, -2.433f, 2.121f, -3.38f)
                moveToRelative(3.444f, -2.088f)
                arcTo(8.802f, 8.802f, 0f, false, true, 15f, 6f)
                curveToRelative(3.56f, 0f, 6.06f, 2.54f, 7f, 6f)
                curveToRelative(-0.309f, 1.14f, -0.786f, 2.177f, -1.413f, 3.058f)
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
                moveToRelative(7.48f, -4.372f)
                arcTo(9.77f, 9.77f, 0f, false, true, 16f, 6.07f)
                moveToRelative(0f, 11.86f)
                arcToRelative(9.77f, 9.77f, 0f, false, true, -1.728f, -3.618f)
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
                moveTo(8.53f, 3f)
                horizontalLineToRelative(5.27f)
                arcToRelative(2f, 2f, 0f, false, true, 1.98f, 1.67f)
                lineToRelative(0.23f, 1.4f)
                moveTo(2f, 2f)
                lineToRelative(20f, 20f)
            }
        }.build()
        
        return _FishOff!!
    }

private var _FishOff: ImageVector? = null

