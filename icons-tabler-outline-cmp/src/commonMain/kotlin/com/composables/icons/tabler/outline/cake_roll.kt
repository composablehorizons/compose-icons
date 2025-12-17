package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CakeRoll: ImageVector
    get() {
        if (_CakeRoll != null) return _CakeRoll!!
        
        _CakeRoll = ImageVector.Builder(
            name = "cake-roll",
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
                moveTo(12f, 15f)
                curveToRelative(-4.97f, 0f, -9f, -2.462f, -9f, -5.5f)
                reflectiveCurveToRelative(4.03f, -5.5f, 9f, -5.5f)
                reflectiveCurveToRelative(9f, 2.462f, 9f, 5.5f)
                reflectiveCurveToRelative(-4.03f, 5.5f, -9f, 5.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6.97f)
                curveToRelative(3f, 0f, 4f, 1.036f, 4f, 1.979f)
                curveToRelative(0f, 2.805f, -8f, 2.969f, -8f, -0.99f)
                curveToRelative(0f, -2.11f, 1.5f, -3.959f, 4f, -3.959f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 9.333f)
                verticalLineToRelative(5.334f)
                curveToRelative(0f, 2.945f, -4.03f, 5.333f, -9f, 5.333f)
                reflectiveCurveToRelative(-9f, -2.388f, -9f, -5.333f)
                verticalLineToRelative(-5.334f)
            }
        }.build()
        
        return _CakeRoll!!
    }

private var _CakeRoll: ImageVector? = null

