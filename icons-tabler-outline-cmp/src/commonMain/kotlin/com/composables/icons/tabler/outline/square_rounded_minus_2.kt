package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SquareRoundedMinus2: ImageVector
    get() {
        if (_SquareRoundedMinus2 != null) return _SquareRoundedMinus2!!
        
        _SquareRoundedMinus2 = ImageVector.Builder(
            name = "square-rounded-minus-2",
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
                moveTo(12.5f, 21f)
                curveToRelative(-0.18f, 0.002f, -0.314f, 0f, -0.5f, 0f)
                curveToRelative(-7.2f, 0f, -9f, -1.8f, -9f, -9f)
                reflectiveCurveToRelative(1.8f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.8f, 9f, 9f)
                curveToRelative(0f, 1.136f, -0.046f, 2.138f, -0.152f, 3.02f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _SquareRoundedMinus2!!
    }

private var _SquareRoundedMinus2: ImageVector? = null

