package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FunctionOff: ImageVector
    get() {
        if (_FunctionOff != null) return _FunctionOff!!
        
        _FunctionOff = ImageVector.Builder(
            name = "function-off",
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
                moveTo(9f, 15.5f)
                verticalLineToRelative(0.25f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                arcToRelative(1.38f, 1.38f, 0f, false, false, 1.374f, -1.244f)
                lineToRelative(0.376f, -3.756f)
                moveToRelative(0.363f, -3.63f)
                lineToRelative(0.013f, -0.126f)
                arcToRelative(1.38f, 1.38f, 0f, false, true, 1.374f, -1.244f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(0.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 4f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                moveToRelative(-0.586f, 3.414f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, 0.586f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.547f, 0.22f, -1.043f, 0.576f, -1.405f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _FunctionOff!!
    }

private var _FunctionOff: ImageVector? = null

