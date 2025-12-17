package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.VariableOff: ImageVector
    get() {
        if (_VariableOff != null) return _VariableOff!!
        
        _VariableOff = ImageVector.Builder(
            name = "variable-off",
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
                moveTo(4.675f, 4.68f)
                curveToRelative(-2.17f, 4.776f, -2.062f, 9.592f, 0.325f, 15.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 4f)
                curveToRelative(1.959f, 3.917f, 2.383f, 7.834f, 1.272f, 12.232f)
                moveToRelative(-0.983f, 3.051f)
                curveToRelative(-0.093f, 0.238f, -0.189f, 0.477f, -0.289f, 0.717f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.696f, 11.696f)
                curveToRelative(0.095f, 0.257f, 0.2f, 0.533f, 0.32f, 0.831f)
                curveToRelative(0.984f, 2.473f, 0.984f, 3.473f, 1.984f, 3.473f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                moveToRelative(2.022f, -2.514f)
                curveToRelative(0.629f, -0.582f, 1.304f, -0.986f, 1.978f, -0.986f)
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
        
        return _VariableOff!!
    }

private var _VariableOff: ImageVector? = null

