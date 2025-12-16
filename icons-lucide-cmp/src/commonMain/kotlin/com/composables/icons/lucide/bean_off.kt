package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BeanOff: ImageVector
    get() {
        if (_BeanOff != null) return _BeanOff!!
        
        _BeanOff = ImageVector.Builder(
            name = "bean-off",
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
                moveTo(9f, 9f)
                curveToRelative(-0.64f, 0.64f, -1.521f, 0.954f, -2.402f, 1.165f)
                arcTo(6f, 6f, 0f, false, false, 8f, 22f)
                arcToRelative(13.96f, 13.96f, 0f, false, false, 9.9f, -4.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 5.093f)
                arcTo(6f, 6f, 0f, false, true, 22f, 8f)
                curveToRelative(0f, 2.411f, -0.61f, 4.68f, -1.683f, 6.66f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4f, 4f, 0f, false, false, 6.487f, 1.208f)
                moveTo(10.62f, 5.341f)
                arcToRelative(4.015f, 4.015f, 0f, false, true, 2.039f, 2.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()
        
        return _BeanOff!!
    }

private var _BeanOff: ImageVector? = null

