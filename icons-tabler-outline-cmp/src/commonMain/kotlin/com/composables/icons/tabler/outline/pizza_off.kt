package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PizzaOff: ImageVector
    get() {
        if (_PizzaOff != null) return _PizzaOff!!
        
        _PizzaOff = ImageVector.Builder(
            name = "pizza-off",
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
                moveTo(10.313f, 6.277f)
                lineToRelative(1.687f, -3.277f)
                lineToRelative(5.34f, 10.376f)
                moveToRelative(2.477f, 6.463f)
                arcToRelative(19.093f, 19.093f, 0f, false, true, -7.817f, 1.661f)
                curveToRelative(-3.04f, 0f, -5.952f, -0.714f, -8.5f, -1.983f)
                lineToRelative(5.434f, -10.559f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.38f, 15.866f)
                arcToRelative(14.94f, 14.94f, 0f, false, false, 6.815f, 1.634f)
                curveToRelative(1.56f, 0f, 3.105f, -0.24f, 4.582f, -0.713f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                verticalLineToRelative(-0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PizzaOff!!
    }

private var _PizzaOff: ImageVector? = null

