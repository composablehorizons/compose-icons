package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyPoundOff: ImageVector
    get() {
        if (_CurrencyPoundOff != null) return _CurrencyPoundOff!!
        
        _CurrencyPoundOff = ImageVector.Builder(
            name = "currency-pound-off",
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
                moveTo(17f, 18.5f)
                arcToRelative(6f, 6f, 0f, false, true, -5f, 0f)
                arcToRelative(6f, 6f, 0f, false, false, -5f, 0.5f)
                arcToRelative(3f, 3f, 0f, false, false, 2f, -2.5f)
                verticalLineToRelative(-7.5f)
                moveToRelative(1.192f, -2.825f)
                arcToRelative(4f, 4f, 0f, false, true, 6.258f, 0.825f)
                moveToRelative(-3.45f, 6f)
                horizontalLineToRelative(-6f)
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
        
        return _CurrencyPoundOff!!
    }

private var _CurrencyPoundOff: ImageVector? = null

