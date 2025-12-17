package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyEuroOff: ImageVector
    get() {
        if (_CurrencyEuroOff != null) return _CurrencyEuroOff!!
        
        _CurrencyEuroOff = ImageVector.Builder(
            name = "currency-euro-off",
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
                moveTo(17.2f, 7f)
                curveToRelative(-1.977f, -2.26f, -4.954f, -2.602f, -7.234f, -1.04f)
                moveToRelative(-1.913f, 2.079f)
                curveToRelative(-1.604f, 2.72f, -1.374f, 6.469f, 0.69f, 8.894f)
                curveToRelative(2.292f, 2.691f, 6f, 2.758f, 8.356f, 0.18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                horizontalLineToRelative(-5f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(8f)
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
        
        return _CurrencyEuroOff!!
    }

private var _CurrencyEuroOff: ImageVector? = null

